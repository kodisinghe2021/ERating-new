package com.example.eratingappv_02;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity {
    private EditText input_log_email;
    private EditText input_log_password;
    private Button btn_login;
    private FirebaseAuth mAuth;
    TextView link_to_registration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mAuth = FirebaseAuth.getInstance();
        link_to_registration = findViewById(R.id.link_to_registration);
        input_log_email = findViewById(R.id.input_log_email);
        input_log_password = findViewById(R.id.input_log_password);
        btn_login = findViewById(R.id.btn_login);
// link to registration page
        link_to_registration.setOnClickListener(view -> {
            startActivity(new Intent(LoginActivity.this, RegistrationActivity.class));
        });
// register user
        btn_login.setOnClickListener(view -> {
            user_register();
        });


    }

    private void user_register() {
        String s_email = input_log_email.getText().toString();
        String s_password = input_log_password.getText().toString();

        mAuth.signInWithEmailAndPassword(s_email, s_password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    startActivity(new Intent(LoginActivity.this, HomeActivity.class));
                    Toast.makeText(LoginActivity.this, "Login Success..!", Toast.LENGTH_SHORT).show();
                } else if (!task.isSuccessful()) {
                    Toast.makeText(LoginActivity.this, "ERROR", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}