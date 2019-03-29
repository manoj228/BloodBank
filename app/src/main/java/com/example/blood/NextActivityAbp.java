package com.example.blood;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

public class NextActivityAbp extends AppCompatActivity {

    Spinner sabp;
    TextView tvabp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_abp);


        sabp = findViewById(R.id.spinnerAbp);
        tvabp = findViewById(R.id.tvDetailsabp);

        sabp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String i = parent.getItemAtPosition(position).toString();

                if (i == parent.getItemAtPosition(0)){
                    tvabp.setText("Phone: 787664823" );
                }

                if (i == parent.getItemAtPosition(1)){
                    tvabp.setText("Phone: 9896621777" );
                }

                if (i == parent.getItemAtPosition(2)){
                    tvabp.setText("Phone: 7533666852" );
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
