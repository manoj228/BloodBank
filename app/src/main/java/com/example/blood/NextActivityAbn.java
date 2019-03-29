package com.example.blood;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

public class NextActivityAbn extends AppCompatActivity {

    Spinner sabn;
    TextView tvabn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_abn);

        sabn = findViewById(R.id.spinnerAbn);
        tvabn = findViewById(R.id.tvdetailsAbn);

        sabn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String i = parent.getItemAtPosition(position).toString();

                if (i == parent.getItemAtPosition(0)){
                    tvabn.setText("Phone: 897664823" );
                }

                if (i == parent.getItemAtPosition(1)){
                    tvabn.setText("Phone: 7796621777" );
                }

                if (i == parent.getItemAtPosition(2)){
                    tvabn.setText("Phone: 8933666852" );
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
