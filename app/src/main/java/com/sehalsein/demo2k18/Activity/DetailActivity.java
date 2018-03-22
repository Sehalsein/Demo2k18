package com.sehalsein.demo2k18.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.sehalsein.demo2k18.R;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        String id = getIntent().getStringExtra("NAME");

        Toast.makeText(DetailActivity.this,id+"",Toast.LENGTH_SHORT).show();
    }
}
