package com.example.all_in_one;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;

public class MP3Player extends AppCompatActivity {
    Button playButton, pauseButton, stopButton, backButton;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mp3_player);
        playButton = findViewById(R.id.button140);
        pauseButton = findViewById(R.id.button141);
        stopButton = findViewById(R.id.button142);
    }
}