package com.example.vivekpatel.mediaplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Welcome extends AppCompatActivity {

    Button originals,livequiz,social;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        originals = (Button) findViewById(R.id.original);
        livequiz = (Button) findViewById(R.id.livequiz);
        social = (Button) findViewById(R.id.social);

    }
    public void Originals(View view)
    {
        Intent i = new Intent(this,MediaPlayerActivity.class);
        startActivity(i);
    }

    public void LiveQuiz(View view)
    {
        Intent i = new Intent(this,LiveQuiz.class);
        startActivity(i);
    }
    public void Social(View view)
    {
        Intent i = new Intent(this,Social.class);
        startActivity(i);
    }
}
