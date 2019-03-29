package com.example.blood;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

public class NextActivityOp extends AppCompatActivity {

    Spinner sbOp;
    TextView tvOp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_op);

        sbOp = findViewById(R.id.spinnerOp);
        tvOp = findViewById(R.id.tvdetailsOp);

        sbOp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String i = parent.getItemAtPosition(position).toString();

                if (i == parent.getItemAtPosition(0)){
                    tvOp.setText("Phone: 7892214823" );
                }

                if (i == parent.getItemAtPosition(1)){
                    tvOp.setText("Phone: 7895521777" );
                }

                if (i == parent.getItemAtPosition(2)){
                    tvOp.setText("Phone: 9333672852" );
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}
