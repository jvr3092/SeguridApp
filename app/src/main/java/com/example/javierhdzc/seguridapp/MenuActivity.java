package com.example.javierhdzc.seguridapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void cipher(View v) {
        Intent intent = new Intent(MenuActivity.this, CipherActivity.class);
        startActivity(intent);
    }

    public void script(View v) {
        Intent intent = new Intent(MenuActivity.this, ScriptsActivity.class);
        startActivity(intent);
    }

    public void info(View v) {
        Intent intent = new Intent(MenuActivity.this, InfoActivity.class);
        startActivity(intent);
    }

    public void images(View v) {
        Intent intent = new Intent(MenuActivity.this, AlbumActivity.class);
        startActivity(intent);
    }
}
