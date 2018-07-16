package com.example.javierhdzc.seguridapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ScriptsActivity extends Activity {

    String script;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scripts);
    }

    public void snort(View v) {
        Intent intent = new Intent(ScriptsActivity.this, ScriptActivity.class);
        script = "Snort";
        intent.putExtra("script", script);
        startActivity(intent);
    }

    public void ports(View v) {
        Intent intent = new Intent(ScriptsActivity.this, ScriptActivity.class);
        script = "Puertos";
        intent.putExtra("script", script);
        startActivity(intent);
    }

    public void disc(View v) {
        Intent intent = new Intent(ScriptsActivity.this, ScriptActivity.class);
        script = "Disco";
        intent.putExtra("script", script);
        startActivity(intent);
    }
}
