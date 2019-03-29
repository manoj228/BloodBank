package com.example.blood;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

public class NextActivityB extends AppCompatActivity {


    Spinner sb;
    TextView tvb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_b);

        sb = findViewById(R.id.spinnerB);
        tvb = findViewById(R.id.tvdetailsB);

        sb.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String i = parent.getItemAtPosition(position).toString();

                if (i == parent.getItemAtPosition(0)){
                    tvb.setText("Phone: 7862214823" );
                }

                if (i == parent.getItemAtPosition(1)){
                    tvb.setText("Phone: 7898321777" );
                }

                if (i == parent.getItemAtPosition(2)){
                    tvb.setText("Phone: 8333672852" );
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
