package com.example.tranquil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tranquil.R;

public class opener_activity extends AppCompatActivity {
    TextView continue2;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.opener);

        continue2 = (TextView) findViewById(R.id.continue1);
        continue2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(opener_activity.this, MainActivity.class);
                startActivity(intent);

            }
        });
    }
}
