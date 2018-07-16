package com.example.javierhdzc.seguridapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ConceptsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_concepts);
    }

    public void one(View v) {
        Intent intent = new Intent(ConceptsActivity.this, AActivity.class);
        startActivity(intent);
    }

    public void two(View v) {
        Intent intent = new Intent(ConceptsActivity.this, A1Activity.class);
        startActivity(intent);
    }

    public void three(View v) {
        Intent intent = new Intent(ConceptsActivity.this, A2Activity.class);
        startActivity(intent);
    }

    public void four(View v) {
        Intent intent = new Intent(ConceptsActivity.this, A3Activity.class);
        startActivity(intent);
    }
}
