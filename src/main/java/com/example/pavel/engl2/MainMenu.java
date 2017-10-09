package com.example.pavel.engl2;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

/**
 * Created by pavel on 10/03/2017.
 */
public class MainMenu extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_screen);

        Button soloGame = (Button) findViewById(R.id.solo);
        Button setup = (Button) findViewById(R.id.setup);
        Button homework = (Button) findViewById(R.id.home_work);
        homework.setOnClickListener(new onClickHomework());
        soloGame.setOnClickListener(new onClickSolo());
        setup.setOnClickListener(new onClicksetup());
    }

    class onClickSolo implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            Intent goToSolo = new Intent(MainMenu.this, SoloGame.class);

            startActivity(goToSolo);
        }
    }

    class onClicksetup implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            Intent goSetup = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ukr.net/"));
            startActivity(goSetup);
        }
    }

//    @Override
//    protected void onResume() {
//        super.onResume();
//
//        if(isVideoStarted == true && video != null){
//            video.start();
//        }
//    }

    class onClickHomework implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            //  MediaPlayer MB = new MediaPlayer(findViewById(R.id.video));
            VideoView video = (VideoView) findViewById(R.id.video);
            String vidAddress = "http://94.158.80.101:8080/malyatko/stream.m3u8";
            Uri vidUri = Uri.parse(vidAddress);
            video.setVideoURI(vidUri);
            video.requestFocus(0); // ловим фокус (нажатие пальцев)
            video.start();
        }
    }

}
