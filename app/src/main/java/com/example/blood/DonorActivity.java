package com.example.blood;

import android.content.Intent;
import android.database.DatabaseErrorHandler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class DonorActivity extends AppCompatActivity {

    private EditText etdname,etdcontact;
    private Button dosave;
    private Spinner spb;
    String Dname,Dcontact;
    private FirebaseAuth fa;
    private DatabaseReference db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donor);

        etdcontact = findViewById(R.id.etDonorContact);
        etdname = findViewById(R.id.etDonorname);
        spb = findViewById(R.id.spinnerb);
        dosave = findViewById(R.id.btndsave);

        fa=FirebaseAuth.getInstance();
        db= FirebaseDatabase.getInstance().getReference();

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(DonorActivity.this, R.array.Bloods, android.R.layout.simple_spinner_item);

        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        spb.setAdapter(adapter);

        spb.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String it= parent.getItemAtPosition(position).toString();
                if(it == parent.getItemAtPosition(0).toString()) {
                    Toast.makeText(parent.getContext(), "Selected None" , Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(parent.getContext(), "Selected: " + it, Toast.LENGTH_LONG).show();
                }



            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        dosave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valid();
            }
        });

    }

    public void valid()
    {
        Dname = etdname.getText().toString();
        Dcontact = etdcontact.getText().toString();

        if(Dname.isEmpty() || Dcontact.isEmpty())
        {
            Toast.makeText(DonorActivity.this, "Please fill all the details and also choose blood group if u missed", Toast.LENGTH_SHORT).show();
        }

        DonorDetail DD = new DonorDetail(Dname,Dcontact);

        FirebaseUser fu = fa.getCurrentUser();

        db.child(fu.getUid()).setValue(DD);

        Toast.makeText(DonorActivity.this,"Details Saved",Toast.LENGTH_SHORT).show();
    }
}
