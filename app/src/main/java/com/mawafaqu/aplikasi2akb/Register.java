package com.mawafaqu.aplikasi2akb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity {
    /*
    -- 16 April 2020
    -- Membuat kelas Main, Register, almost
    -- 10117126
    -- Mawa Faqu R
    -- IF-4

    ---
    -- 17 April 2020
    -- Membuat kelas Verify, Beranda & Finishing
    -- 10117126
    -- Mawa Faqu R
    -- IF-4

    */
    Button btnregs;
    EditText usr;
    public static final String User = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        btnregs = (Button) findViewById(R.id.btnreg);
        usr = findViewById(R.id.user);
        btnregs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //save input data to variables
                String User = usr.getText().toString();
                //check if email is empty
                if (User.isEmpty()){
                    usr.setError("Masukan Nama Anda");
                    return;
                }

                //call function login
                login(User);
            }
        });
    }
    private void login(String User){
        //create the intent
        Intent intent = new Intent(getApplicationContext(), Almost.class);
        startActivity(intent);
    }
}
