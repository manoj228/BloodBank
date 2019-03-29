package com.example.blood;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

public class NextAcitivityO extends AppCompatActivity {

    Spinner sbo;
    TextView tvo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_acitivity_o);

        sbo = findViewById(R.id.spinnerO);
        tvo = findViewById(R.id.tvdetailsO);

        sbo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String i = parent.getItemAtPosition(position).toString();

                if (i == parent.getItemAtPosition(0)){
                    tvo.setText("Phone: 7892214823" );
                }

                if (i == parent.getItemAtPosition(1)){
                    tvo.setText("Phone: 6598321777" );
                }

                if (i == parent.getItemAtPosition(2)){
                    tvo.setText("Phone: 8213672852" );
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}
