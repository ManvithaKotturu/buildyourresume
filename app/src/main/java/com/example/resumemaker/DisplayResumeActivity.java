package com.example.resumemaker;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DisplayResumeActivity extends AppCompatActivity {

    private TextView tvName, tvTitle, tvContact, tvEducation, tvSkills, tvExperience;
    private int selectedTemplate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Retrieve the selected template number passed from ChooseTemplateActivity
        selectedTemplate = getIntent().getIntExtra("template", 1); // Default to template 1 if not provided

        // Dynamically choose the template based on the selection
        switch (selectedTemplate) {
            case 1:
                setContentView(R.layout.template1); // Inflate template1.xml
                break;
            case 2:
                setContentView(R.layout.template2); // Inflate template2.xml
                break;
            case 3:
                setContentView(R.layout.template3); // Inflate template3.xml
                break;
            default:
                setContentView(R.layout.template1); // Default to template1 if something goes wrong
                break;
        }

        // Initialize TextView variables from the dynamically loaded template layout
        tvName = findViewById(R.id.tv_name); // Ensure this ID exists in your template XML
        tvTitle = findViewById(R.id.tv_title);
        tvContact = findViewById(R.id.tv_contact);
        tvEducation = findViewById(R.id.tv_education); // Add for education
        tvSkills = findViewById(R.id.tv_skills);     // Add for skills
        tvExperience = findViewById(R.id.tv_experience); // Add for experience

        // Retrieve the data passed from MainActivity or ChooseTemplateActivity
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String name = extras.getString("name");
            String title = extras.getString("title");
            String contact = extras.getString("contact");
            String education = extras.getString("education"); // Get education data
            String skills = extras.getString("skills");     // Get skills data
            String experience = extras.getString("experience"); // Get experience data

            // Set the retrieved data into the TextViews
            if (tvName != null) {
                tvName.setText(name);
            }
            if (tvTitle != null) {
                tvTitle.setText(title);
            }
            if (tvContact != null) {
                tvContact.setText(contact);
            }
            if (tvEducation != null) {
                tvEducation.setText(education); // Set education data
            }
            if (tvSkills != null) {
                tvSkills.setText(skills); // Set skills data
            }
            if (tvExperience != null) {
                tvExperience.setText(experience); // Set experience data
            }
        }
    }
}
