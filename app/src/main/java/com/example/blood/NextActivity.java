package com.example.blood;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    Spinner sa;
     TextView tvd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        sa = findViewById(R.id.spinnerA);
        tvd = findViewById(R.id.tvdetails);

        sa.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String i = parent.getItemAtPosition(position).toString();

                if (i == parent.getItemAtPosition(0)){
                     tvd.setText("Phone: 9098856743" );
                }

                if (i == parent.getItemAtPosition(1)){
                    tvd.setText("Phone: 9898321567" );
                }

                if (i == parent.getItemAtPosition(2)){
                    tvd.setText("Phone: 893672852" );
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
