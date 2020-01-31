package com.example.sujananikaruhi.babyapp;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class SongActivity extends AppCompatActivity {

    VideoView videoView1,videoView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song);

        videoView1 =findViewById(R.id.video_view1);
        String videoPath1 = "android.resource://" + getPackageName()+ "/" + R.raw.abc;
        Uri uri1 = Uri.parse(videoPath1);
        videoView1.setVideoURI(uri1);

        MediaController mediaController1 = new MediaController(this);
        videoView1.setMediaController(mediaController1);
        mediaController1.setAnchorView(videoView1);

        videoView2 =findViewById(R.id.video_view2);
        String videoPath2 = "android.resource://" + getPackageName()+ "/" + R.raw.color;
        Uri uri = Uri.parse(videoPath2);
        videoView2.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoView2.setMediaController(mediaController);
        mediaController.setAnchorView(videoView2);



    }
}
