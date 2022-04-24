package com.example.sangam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.sangam.databinding.ActivityLoginBinding;
import com.example.sangam.databinding.ActivitySignUpBinding;

public class signUpActivity extends AppCompatActivity {
    ActivitySignUpBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignUpBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();
        Intent intent = new Intent(this, LoginActivity.class);
        // binding.SignP.setVisibility(View.VISIBLE):

        binding.goToLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
                finish();
            }
        });
        binding.signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = String.valueOf(binding.SignUpName.getText()),
                        email = String.valueOf(binding.SignUpEmail.getText()),
                        pass = String.valueOf(binding.signUpPassword.getText()),
                        conPass = String.valueOf(binding.signUpConfirmPassword.getText());
                if (!pass.equals(conPass))
                    Toast.makeText(signUpActivity.this, "Passwords didn't match!!", Toast.LENGTH_SHORT).show();
                else if (pass.equals("") || name.equals("") || email.equals(""))
                    Toast.makeText(signUpActivity.this, "Empty fields not allowed!!", Toast.LENGTH_SHORT).show();
                else {

                }
                binding.signUpPassword.setText("");
                binding.signUpConfirmPassword.setText("");
            }
        });
    }
}