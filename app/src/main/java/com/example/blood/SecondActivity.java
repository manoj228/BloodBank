package com.example.blood;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class SecondActivity extends AppCompatActivity {

    private FirebaseAuth firebaseAuth;
    private Button next;
    private Spinner s;
    private TextView don;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        firebaseAuth = FirebaseAuth.getInstance();

        s = findViewById(R.id.spinner);

        don =(TextView) findViewById(R.id.tvDonor);




        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(SecondActivity.this, R.array.Bloods, android.R.layout.simple_spinner_item);

        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        s.setAdapter(adapter);

        s.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String item = parent.getItemAtPosition(position).toString();

                if(item == parent.getItemAtPosition(0).toString()) {
                    Toast.makeText(parent.getContext(), "Selected None" , Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
                }

                if(item == parent.getItemAtPosition(1).toString()){
                    Intent i =new Intent(SecondActivity.this,NextActivity.class);
                    startActivity(i);
                }

                if(item == parent.getItemAtPosition(2).toString()){
                    Intent i =new Intent(SecondActivity.this,NextActivityA.class);
                    startActivity(i);
                }
                if(item == parent.getItemAtPosition(3).toString()){
                    Intent i =new Intent(SecondActivity.this,NextActivityB.class);
                    startActivity(i);
                }
                if(item == parent.getItemAtPosition(4).toString()){
                    Intent i =new Intent(SecondActivity.this,NextActivityBp.class);
                    startActivity(i);
                }
                if(item == parent.getItemAtPosition(5).toString()){
                    Intent i =new Intent(SecondActivity.this,NextAcitivityO.class);
                    startActivity(i);
                }

                if(item == parent.getItemAtPosition(6).toString()){
                    Intent i =new Intent(SecondActivity.this,NextActivityOp.class);
                    startActivity(i);
                }
                if(item == parent.getItemAtPosition(7).toString()){
                    Intent i =new Intent(SecondActivity.this,NextActivityAbp.class);
                    startActivity(i);
                }
                if(item == parent.getItemAtPosition(8).toString()){
                    Intent i =new Intent(SecondActivity.this,NextActivityAbn.class);
                    startActivity(i);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    don.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
                   startActivity(new Intent(SecondActivity.this,DonorActivity.class));
        }
    });

    }
    private void Logout(){
        firebaseAuth.signOut();
        finish();
        startActivity(new Intent(SecondActivity.this, MainActivity.class));
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.logoutMenu:{
                Logout();
            break;
            }
            case R.id.profileMenu:
                startActivity(new Intent(SecondActivity.this, ProfileActivity.class));
                break;
        }
        return super.onOptionsItemSelected(item);
    }


}
