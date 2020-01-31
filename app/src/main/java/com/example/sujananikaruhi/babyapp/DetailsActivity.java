package com.example.sujananikaruhi.babyapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    ImageView imgRhymes;
    TextView txtName,txtDetails;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        imgRhymes=findViewById(R.id.img_rhymes);
        txtName=findViewById(R.id.txt_rhymes_names);
        txtDetails=findViewById(R.id.txt_details);

        String getid = getIntent().getExtras().getString("id");

        if(getid.equals("one"))
        {

            imgRhymes.setImageResource(R.drawable.twinkle);
            txtName.setText("Twinkle Twinkle Little Star");
            txtDetails.setText(R.string.rhymes1);
        }

        if(getid.equals("two"))
        {

            imgRhymes.setImageResource(R.drawable.humty);
            txtName.setText("Humty Dumty Sat on a Wall");
            txtDetails.setText(R.string.rhymes2);
        }

        if(getid.equals("three"))
        {

            imgRhymes.setImageResource(R.drawable.baa);
            txtName.setText("Baa Baa Black Sheep");
            txtDetails.setText(R.string.rhymes3);
        }

        if(getid.equals("four"))
        {

            imgRhymes.setImageResource(R.drawable.hickory);
            txtName.setText("Hickory Dickory Dock");
            txtDetails.setText(R.string.rhymes4);
        }

        if(getid.equals("five"))
        {

            imgRhymes.setImageResource(R.drawable.jack);
            txtName.setText("Jack and Jill");
            txtDetails.setText(R.string.rhymes5);
        }

    }
}
