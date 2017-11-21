package com.example.jungezai.fightring;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<fight> fightList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
        initfights();
        RecyclerView recyclerView= (RecyclerView) findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        FightAdapter adapter = new FightAdapter(fightList);
        recyclerView.setAdapter(adapter);

    }


    private void initfights(){
        for(int i=0;i<2;i++){
            fight monitai = new fight("Monitai",R.mipmap.ic_launcher);
            fightList.add(monitai);
            fight kalate = new fight("kalate",R.mipmap.ic_launcher);
            fightList.add(kalate);
            fight JKD = new fight("JKD",R.mipmap.ic_launcher);
            fightList.add(JKD);
            fight Boxing = new fight("Boxing",R.mipmap.ic_launcher);
            fightList.add(Boxing);
            fight taichi = new fight("taichi",R.mipmap.ic_launcher);
            fightList.add(taichi);
            fight MMA = new fight("MMA",R.mipmap.ic_launcher);
            fightList.add(MMA);
        }
    }

}

