package com.example.sujananikaruhi.babyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {
    Button rhymes, song;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        rhymes =(Button) findViewById(R.id.btn_rhymes);

        song =(Button) findViewById(R.id.btn_song);

        rhymes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(HomeActivity.this,RhymesActivity.class);
                intent.putExtra("id","one");
                startActivity(intent);
            }
        });

        song.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(HomeActivity.this,SongActivity.class);
                intent.putExtra("id","two");
                startActivity(intent);

            }
        });
    }
}
