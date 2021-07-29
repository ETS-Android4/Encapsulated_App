package com.example.all_in_one;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class DatabasePage extends AppCompatActivity {
    TextView heading;
    EditText nameField, emailField, passwordField, mobileField;
    Button updateButton, continueButton;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database_page);
        heading = findViewById(R.id.textView14);
        nameField = findViewById(R.id.editText70);
        emailField = findViewById(R.id.editText71);
        passwordField = findViewById(R.id.editText72);
        mobileField = findViewById(R.id.editText73);
        updateButton = findViewById(R.id.button70);
        continueButton = findViewById(R.id.button71);
        firebaseDatabase = FirebaseDatabase.getInstance();

        YoYo.with(Techniques.FlipInX).duration(1500).repeat(0).playOn(heading);
        YoYo.with(Techniques.Shake).duration(2500).repeat(0).playOn(nameField);
        YoYo.with(Techniques.Shake).duration(2500).repeat(0).playOn(emailField);
        YoYo.with(Techniques.Shake).duration(2500).repeat(0).playOn(passwordField);
        YoYo.with(Techniques.Shake).duration(2500).repeat(0).playOn(mobileField);
        YoYo.with(Techniques.FlipInX).duration(3000).repeat(0).playOn(updateButton);
        YoYo.with(Techniques.FlipInX).duration(3000).repeat(0).playOn(continueButton);

        updateButton.setOnClickListener(v -> {
            databaseReference = firebaseDatabase.getReference("users");
            String name = nameField.getText().toString();
        });
    }
}