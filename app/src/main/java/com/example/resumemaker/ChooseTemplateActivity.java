package com.example.resumemaker;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class ChooseTemplateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_template);

        // Retrieve user input data passed from MainActivity
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String title = intent.getStringExtra("title");
        String contact = intent.getStringExtra("contact");
        String education = intent.getStringExtra("education");
        String skills = intent.getStringExtra("skills");
        String experience = intent.getStringExtra("experience");

        // Button for Template 1
        Button btnTemplate1 = findViewById(R.id.btn_template1);
        btnTemplate1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Pass the selected template and user data to DisplayResumeActivity
                Intent intent1 = new Intent(ChooseTemplateActivity.this, DisplayResumeActivity.class);
                intent1.putExtra("template", 1); // Template 1
                intent1.putExtra("name", name);
                intent1.putExtra("title", title);
                intent1.putExtra("contact", contact);
                intent1.putExtra("education", education);
                intent1.putExtra("skills", skills);
                intent1.putExtra("experience", experience);
                startActivity(intent1);
            }
        });

        // Button for Template 2
        Button btnTemplate2 = findViewById(R.id.btn_template2);
        btnTemplate2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Pass the selected template and user data to DisplayResumeActivity
                Intent intent2 = new Intent(ChooseTemplateActivity.this, DisplayResumeActivity.class);
                intent2.putExtra("template", 2); // Template 2
                intent2.putExtra("name", name);
                intent2.putExtra("title", title);
                intent2.putExtra("contact", contact);
                intent2.putExtra("education", education);
                intent2.putExtra("skills", skills);
                intent2.putExtra("experience", experience);
                startActivity(intent2);
            }
        });

        // Button for Template 3
        Button btnTemplate3 = findViewById(R.id.btn_template3);
        btnTemplate3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Pass the selected template and user data to DisplayResumeActivity
                Intent intent3 = new Intent(ChooseTemplateActivity.this, DisplayResumeActivity.class);
                intent3.putExtra("template", 3); // Template 3
                intent3.putExtra("name", name);
                intent3.putExtra("title", title);
                intent3.putExtra("contact", contact);
                intent3.putExtra("education", education);
                intent3.putExtra("skills", skills);
                intent3.putExtra("experience", experience);
                startActivity(intent3);
            }
        });
    }
}
