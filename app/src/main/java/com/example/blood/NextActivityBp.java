package com.example.blood;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

public class NextActivityBp extends AppCompatActivity {

    Spinner sbp;
    TextView tvbp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_bp);

        sbp = findViewById(R.id.spinnerBp);
        tvbp = findViewById(R.id.tvdetailsBp);

        sbp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
           public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String i = parent.getItemAtPosition(position).toString();

                if (i == parent.getItemAtPosition(0)){
                    tvbp.setText("Phone: 7862214823" );
                }

                if (i == parent.getItemAtPosition(1)){
                    tvbp.setText("Phone: 7898321777" );
                }

                if (i == parent.getItemAtPosition(2)){
                    tvbp.setText("Phone: 8333672852" );
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
       });
    }

}
