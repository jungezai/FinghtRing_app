package com.example.jungezai.fightring;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by cfx on 2017/11/21.
 */

public class FightContentFragment extends Fragment {

    private View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState){
        view = inflater.inflate(R.layout.activity_run,container,false);
        return view;
    }

    public void refresh(String name){
        View visibilityLayout = view.findViewById(R.id.visibility_layout);
        visibilityLayout.setVisibility(View.VISIBLE);
        TextView TitleText = (TextView) view.findViewById(R.id.textView);
        TitleText.setText(name);
    }
}
