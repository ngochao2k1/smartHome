package com.example.smarthome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText edt_username, edt_password;
    boolean passWordVisible;
    Button SignIn;
    LinearLayout FaceBook,Google;
    TextView SignUp, ForgotPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        InitWidget();
        // hidden password
        edt_password.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                final int Right =2;
                if(event.getAction()  == MotionEvent.ACTION_UP){
                    if(event.getRawX() >=
                            edt_password.getRight() - edt_password.getCompoundDrawables()[Right].getBounds().width()){
                        int selection = edt_password.getSelectionEnd();
                        if(passWordVisible){
                            //set drawale image here
                            edt_password.setCompoundDrawablesRelativeWithIntrinsicBounds
                                    (0,0,R.drawable.ic_baseline_visibility_off_24,0);
                            //for hide password
                            edt_password.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            passWordVisible = false;
                        }
                        else{
                            //set drawale image here
                            edt_password.setCompoundDrawablesRelativeWithIntrinsicBounds
                                    (0,0,R.drawable.ic_baseline_visibility_24,0);
                            //for shoe password
                            edt_password.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                            passWordVisible = true;
                        }
                        edt_password.setSelection(selection);
                        return true;
                    }
                }
                return false;
            }
        });
        //Sign in
        SignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, DashBoard.class);
                startActivity(intent);
            }
        });
        // Sign In with FaceBook
        FaceBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(LoginActivity.this,"Developing!!!",Toast.LENGTH_SHORT).show();
            }
        });
        //Sign in with Google
        Google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(LoginActivity.this,"Developing!!!",Toast.LENGTH_SHORT).show();
            }
        });
        // Forgot pass word
        ForgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(LoginActivity.this,"Developing!!!",Toast.LENGTH_SHORT).show();
            }
        });
        // Sign Up
        SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, SignUpActivity.class);
                Toast.makeText(LoginActivity.this,"Developing!!!",Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
    }

    private void InitWidget() {
        edt_password = findViewById(R.id.editTextTextPassword);
        edt_username = findViewById(R.id.editTextEmail);
        FaceBook = findViewById(R.id.FACEBOOK);
        Google = findViewById(R.id.Google);
        SignIn = findViewById(R.id.btn_signIn);
        SignUp = findViewById(R.id.tv_SignUp);
        ForgotPassword =  findViewById(R.id.tv_ForgotPassword);
    }
}