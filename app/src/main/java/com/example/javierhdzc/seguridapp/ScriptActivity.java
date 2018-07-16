package com.example.javierhdzc.seguridapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ScriptActivity extends Activity {

    String script;
    TextView scriptName, scriptText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_script);

        script = getIntent().getStringExtra("script");
        scriptName = (TextView) findViewById(R.id.script_name);
        scriptText = (TextView) findViewById(R.id.script_text);

        scriptName.setText(script);

        if(script.contains("Snort")) {
            scriptText.setText(R.string.script1);
        }
        else if(script.contains("Puertos")) {
            scriptText.setText(R.string.script2);
        }
        else {
            scriptText.setText(R.string.script3);
        }
    }
}
