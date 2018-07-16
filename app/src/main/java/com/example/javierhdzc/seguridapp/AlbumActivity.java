package com.example.javierhdzc.seguridapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AlbumActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);
    }

    public void concepts(View v) {
        Intent intent = new Intent(AlbumActivity.this, ConceptsActivity.class);
        startActivity(intent);
    }

    public void md5(View v) {
        Intent intent = new Intent(AlbumActivity.this, BActivity.class);
        startActivity(intent);
    }

    public void secure(View v) {
        Intent intent = new Intent(AlbumActivity.this, CActivity.class);
        startActivity(intent);
    }
}
