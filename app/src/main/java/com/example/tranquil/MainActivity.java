package com.example.tranquil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.app.ProgressDialog.show;

public class MainActivity extends AppCompatActivity {

    private EditText eName;
    private EditText ePassword;
    private Button eLogin;
    private TextView eNewUser;

    private String Username = "hafsamu@gmail.com";
    private String Password = "12345";

    boolean isValid = false;
    private int counter = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eName = findViewById(R.id.etName);//connects these to the activity page ids
        ePassword = findViewById(R.id.etPassword);
        eLogin = findViewById(R.id.btnLogin);
        eNewUser = findViewById(R.id.tvNewUser);

        eLogin.setOnClickListener(new OnClickListener() { // when button is clicked
            @Override
            public void onClick(View view) {
                String inputName = eName.getText().toString(); // converts user input into string
                String inputPassword = ePassword.getText().toString(); //converts user input to string

                if(inputName.isEmpty() || inputPassword.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Please enter all information correctly", Toast.LENGTH_SHORT).show();
                }
                else {
                    isValid = validate(inputName, inputPassword);

                    if (!isValid) {
                        counter--;
                        Toast.makeText(MainActivity.this, "Incorrect credentials entered", Toast.LENGTH_SHORT).show();

                        if(counter == 0) {
                            eLogin.setEnabled(false);
                        }
                    }else {
                        Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                        //add code to go to another page
                        Intent intent = new Intent(MainActivity.this, Home.class);
                        startActivity(intent);
                    }

                }
            }
        });
    }

    private boolean validate(String name, String password) {
        if(name.equals(Username) && password.equals(Password)) {
            return true;
        }
        return false;
    }
}