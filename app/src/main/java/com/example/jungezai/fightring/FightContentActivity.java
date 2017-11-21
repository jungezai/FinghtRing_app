package com.example.jungezai.fightring;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class FightContentActivity extends AppCompatActivity {

    public static void actionStart(Context context,String name){
        Intent intent = new Intent(context,FightContentActivity.class);
        intent.putExtra("name",name);
        context.startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fight_content);
        String name=getIntent().getStringExtra("news_title");
        //FightContentFragment mfightContentFragment=(FightContentFragment)
        //getSupportFragmentManager().findFragmentById(R.id.fight_content_fragment);
        //mfightContentFragment.refresh(name);
    }
}
