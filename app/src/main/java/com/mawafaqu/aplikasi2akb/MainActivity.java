package com.mawafaqu.aplikasi2akb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
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
    TextView reg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        reg = (TextView) findViewById(R.id.textreg);

        String regs = "doesn't have account ? Register";

        SpannableString ss = new SpannableString(regs);

        StyleSpan txtBold = new StyleSpan(Typeface.BOLD);

        ClickableSpan clickableSpan1 = new ClickableSpan() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Register.class);
                startActivity(intent);
            }

            @Override
            public void updateDrawState(TextPaint ds) {
                super.updateDrawState(ds);
                ds.setUnderlineText(false);
            }
        };

        ss.setSpan(clickableSpan1, 23, 31, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(txtBold, 23, 31, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        reg.setText(ss);
        reg.setMovementMethod(LinkMovementMethod.getInstance());
    }
}