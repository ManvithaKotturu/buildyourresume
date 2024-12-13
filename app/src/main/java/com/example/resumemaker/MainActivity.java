package com.example.resumemaker;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText etName, etTitle, etContact, etEducation, etSkills, etExperience;
    private Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Link XML layout to this activity

        // Initialize EditText variables with the IDs from the XML layout
        etName = findViewById(R.id.et_name);
        etTitle = findViewById(R.id.et_title);
        etContact = findViewById(R.id.et_contact);
        etEducation = findViewById(R.id.et_education);
        etSkills = findViewById(R.id.et_skills);
        etExperience = findViewById(R.id.et_experience);

        // Initialize Submit button
        btnSubmit = findViewById(R.id.btn_submit);

        // Set an OnClickListener for the Submit button
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Get the user input from the EditText fields
                String name = etName.getText().toString().trim();
                String title = etTitle.getText().toString().trim();
                String contact = etContact.getText().toString().trim();
                String education = etEducation.getText().toString().trim();
                String skills = etSkills.getText().toString().trim();
                String experience = etExperience.getText().toString().trim();

                // Check if any field is empty
                if (name.isEmpty() || title.isEmpty() || contact.isEmpty() || education.isEmpty() || skills.isEmpty() || experience.isEmpty()) {
                    // Show a toast message if any field is empty
                    Toast.makeText(MainActivity.this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
                } else {
                    // If all fields are filled, create an Intent to pass the data to ChooseTemplateActivity
                    Intent intent = new Intent(MainActivity.this, ChooseTemplateActivity.class);

                    // Add the user inputs as extras to the intent
                    intent.putExtra("name", name);
                    intent.putExtra("title", title);
                    intent.putExtra("contact", contact);
                    intent.putExtra("education", education);
                    intent.putExtra("skills", skills);
                    intent.putExtra("experience", experience);

                    // Start ChooseTemplateActivity
                    startActivity(intent);
                }
            }
        });
    }
}
