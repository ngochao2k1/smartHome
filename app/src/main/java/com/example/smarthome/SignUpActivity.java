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

public class SignUpActivity extends AppCompatActivity {
    EditText edt_SignUp_username,edt_SignUp_email,
            edt_SignUp_password, getEdt_SignUp_Confirmpassword;
    boolean passWordVisible1,passWordVisible2 ;
    Button btn_SignUp;
    TextView tv_SignIn;
    LinearLayout FaceBook_SignUp, Google_SignUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        InitWidget();
        // password visible
        edt_SignUp_password.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent event) {
                final int Right =2;
                if(event.getAction()  == MotionEvent.ACTION_UP){
                    if(event.getRawX() >=
                            edt_SignUp_password.getRight() - edt_SignUp_password.getCompoundDrawables()[Right].getBounds().width()){
                        int selection = edt_SignUp_password.getSelectionEnd();
                        if(passWordVisible1){
                            //set drawale image here
                            edt_SignUp_password.setCompoundDrawablesRelativeWithIntrinsicBounds
                                    (0,0,R.drawable.ic_baseline_visibility_off_24,0);
                            //for hide password
                            edt_SignUp_password.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            passWordVisible1 = false;
                        }
                        else{
                            //set drawale image here
                            edt_SignUp_password.setCompoundDrawablesRelativeWithIntrinsicBounds
                                    (0,0,R.drawable.ic_baseline_visibility_24,0);
                            //for shoe password
                            edt_SignUp_password.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                            passWordVisible1 = true;
                        }
                        edt_SignUp_password.setSelection(selection);
                        return true;
                    }
                }
                return false;
            }
        });
        getEdt_SignUp_Confirmpassword.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                final int Right =2;
                if(motionEvent.getAction()  == MotionEvent.ACTION_UP){
                    if(motionEvent.getRawX() >=
                            getEdt_SignUp_Confirmpassword.getRight() - getEdt_SignUp_Confirmpassword.getCompoundDrawables()[Right].getBounds().width()){
                        int selection = getEdt_SignUp_Confirmpassword.getSelectionEnd();
                        if(passWordVisible2){
                            //set drawale image here
                            getEdt_SignUp_Confirmpassword.setCompoundDrawablesRelativeWithIntrinsicBounds
                                    (0,0,R.drawable.ic_baseline_visibility_off_24,0);
                            //for hide password
                            getEdt_SignUp_Confirmpassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            passWordVisible2= false;
                        }
                        else{
                            //set drawale image here
                            getEdt_SignUp_Confirmpassword.setCompoundDrawablesRelativeWithIntrinsicBounds
                                    (0,0,R.drawable.ic_baseline_visibility_24,0);
                            //for shoe password
                            getEdt_SignUp_Confirmpassword.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                            passWordVisible2= true;
                        }
                        getEdt_SignUp_Confirmpassword.setSelection(selection);
                        return true;
                    }
                }
                return false;
            }
        });


        //Sign Up
        btn_SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SignUpActivity.this,"Developing!!!",Toast.LENGTH_SHORT).show();
            }
        });

        // Go to Sign In
        tv_SignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignUpActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        //Sign up with FAceBook
        FaceBook_SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SignUpActivity.this,"Developing!!!",Toast.LENGTH_SHORT).show();
            }
        });
        //Sing UP with Google
        Google_SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SignUpActivity.this,"Developing!!!",Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void InitWidget() {
        edt_SignUp_username  = findViewById(R.id.edt_signUp_UserName);
        edt_SignUp_email = findViewById(R.id.edt_signUp_Email);
        edt_SignUp_password = findViewById(R.id.edt_signUp_Password);
        getEdt_SignUp_Confirmpassword = findViewById(R.id.edt_signUp_confirmPassword);
        btn_SignUp = findViewById(R.id.btnSignUp);
        tv_SignIn = findViewById(R.id.tv_SignIn);
        FaceBook_SignUp = findViewById(R.id.SignUp_FACEBOOK);
        Google_SignUp = findViewById(R.id.SignUp_Google);
    }
}