package com.mawafaqu.aplikasi2akb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Verify extends AppCompatActivity {
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
    Button SND;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);
        SND = findViewById(R.id.Send);


        SND.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Verify.this,Beranda.class);
                startActivity(intent);
            }
        });

    }
}
