package com.example.pavel.engl2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button game = (Button) findViewById(R.id.google);
        Button gamelogin = (Button) findViewById(R.id.gamelogin);
        TextView registration = (TextView) findViewById(R.id.registeration);

        game.setOnClickListener(new OnClickLogin());
        gamelogin.setOnClickListener(new OnClickLogin());
        registration.setOnClickListener(new OnClickRegistration());

    }

    class OnClickLogin implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            Intent soloGameClick = new Intent(MainActivity.this, MainMenu.class);
         //  finish();
            startActivity(soloGameClick);


        }
    }

    class OnClickRegistration implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            Intent soloGameClick = new Intent(MainActivity.this, Registration.class);
            startActivity(soloGameClick);


        }
    }
}



