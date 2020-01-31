package com.example.sujananikaruhi.babyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class RhymesActivity extends AppCompatActivity {

    Button btnRhymes1,btnRhymes2,btnRhymes3,btnRhymes4,btnRhymes5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rhymes);

        btnRhymes1=findViewById(R.id.btn_rhymes1);
        btnRhymes2=findViewById(R.id.btn_rhymes2);
        btnRhymes3=findViewById(R.id.btn_rhymes3);
        btnRhymes4=findViewById(R.id.btn_rhymes4);
        btnRhymes5=findViewById(R.id.btn_rhymes5);

        btnRhymes5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(RhymesActivity.this,DetailsActivity.class);
                intent.putExtra("id","one");
                startActivity(intent);
                Toast.makeText(RhymesActivity.this, "Twinkle Twinkle Little Star", Toast.LENGTH_SHORT).show();
            }
        });

        btnRhymes4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(RhymesActivity.this,DetailsActivity.class);
                intent.putExtra("id","two");
                startActivity(intent);
                Toast.makeText(RhymesActivity.this, "Humty Dumty Sat on a Wall ", Toast.LENGTH_SHORT).show();
            }
        });

        btnRhymes3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(RhymesActivity.this,DetailsActivity.class);
                intent.putExtra("id","three");
                startActivity(intent);
                Toast.makeText(RhymesActivity.this, "Baa Baa Black Sheep", Toast.LENGTH_SHORT).show();
            }
        });

        btnRhymes2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(RhymesActivity.this,DetailsActivity.class);
                intent.putExtra("id","four");
                startActivity(intent);
                Toast.makeText(RhymesActivity.this, "Hickory Dickory Dock", Toast.LENGTH_SHORT).show();
            }
        });

        btnRhymes1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(RhymesActivity.this,DetailsActivity.class);
                intent.putExtra("id","five");
                startActivity(intent);
                Toast.makeText(RhymesActivity.this, "Jack and Jill", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
