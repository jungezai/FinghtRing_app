package com.example.jungezai.fightring;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by cfx on 2017/11/21.
 */

/*
public class FightAdapter extends ArrayAdapter<fight> {
    private int resourceId;
    public FightAdapter(Context context, int textViewResourceId,
                        List<fight>object){
        super(context,textViewResourceId,object);
        resourceId=textViewResourceId;
    }
    @Override
    public View getView(int position, View converView, ViewGroup parent){
        fight fight=getItem(position);//获取当前的fight实例

        View view;
        if(converView == null){
            view= LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
        }
        else{
            view = converView;
        }

        ImageView fightImage =(ImageView) view.findViewById(R.id.fight_image);
        TextView fightName =(TextView) view.findViewById(R.id.fight_name);
        fightImage.setImageResource(fight.getImageId());
        fightName.setText(fight.getName());
        return view;
    }
}
*/
public class FightAdapter extends RecyclerView.Adapter<FightAdapter.ViewHolder>{

    private List<fight> mFightList;

    static class ViewHolder extends RecyclerView.ViewHolder{
        View fightView;
        ImageView fightImage;
        TextView fightName;

        public ViewHolder(View view){
            super(view);
            fightView=view;
            fightImage=(ImageView) view.findViewById(R.id.fight_image);
            fightName=(TextView) view.findViewById(R.id.fight_name);
        }
    }
    public FightAdapter(List<fight> fightList){
        mFightList=fightList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent,int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fight_item,parent,false);
        final ViewHolder holder=new ViewHolder(view);
        holder.fightView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                int position = holder.getAdapterPosition();
                fight fight=mFightList.get(position);
                Toast.makeText(v.getContext(),"you clicked image "+fight.getName(),Toast.LENGTH_SHORT).show();

            }
        });
        return holder;
        }

    @Override
    public void onBindViewHolder(ViewHolder holder,int position){
        fight fight=mFightList.get(position);
        holder.fightImage.setImageResource(fight.getImageId());
        holder.fightName.setText(fight.getName());

    }

    @Override
    public int getItemCount(){

        return mFightList.size();
    }

}