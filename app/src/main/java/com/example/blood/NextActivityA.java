package com.example.blood;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

public class NextActivityA extends AppCompatActivity {

    Spinner sap;
    TextView tvdp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_activity);

        sap = findViewById(R.id.spinnerAp);
        tvdp = findViewById(R.id.tvdetailsAp);

        sap.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String i = parent.getItemAtPosition(position).toString();

                if (i == parent.getItemAtPosition(0)){
                    tvdp.setText("Phone: 7876554823" );
                }

                if (i == parent.getItemAtPosition(1)){
                    tvdp.setText("Phone: 9898321777" );
                }

                if (i == parent.getItemAtPosition(2)){
                    tvdp.setText("Phone: 7533672852" );
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}
