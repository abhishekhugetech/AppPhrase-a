package com.abhishek.appphrase_a;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void speakUp(View view){

        int id = view.getId();
        String ourId="";
        ourId = view.getResources().getResourceEntryName(id);
        int resourceId = getResources().getIdentifier(ourId, "raw","com.abhishek.appphrase_a");

        MediaPlayer mPlayer = MediaPlayer.create(this, resourceId);
        mPlayer.start();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
