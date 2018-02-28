package com.example.vivekpatel.mediaplayer;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by VIVEK PATEL on 2/27/2018.
 */

public class MusicAdapter extends RecyclerView.Adapter<MusicAdapter.MyViewHolder> {

    private Context mContext;
    private List<SongInfo> albumList;

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView thumbnail,like;
        TextView songtitle,songdes,time,likes;
        public MyViewHolder(View view) {
            super(view);
            thumbnail = (ImageView) view.findViewById(R.id.thumbnail);
            like = (ImageView) view.findViewById(R.id.likes);
            likes = (TextView) view.findViewById(R.id.like);
            songdes = (TextView) view.findViewById(R.id.song_des);
            songtitle = (TextView) view.findViewById(R.id.songtitle);
            time = (TextView) view.findViewById(R.id.time);
        }
    }


    public MusicAdapter(Context mContext, List<SongInfo> albumList) {
        this.mContext = mContext;
        this.albumList = albumList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.song_list, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        SongInfo album = albumList.get(position);
     //   holder.thumbnail.setBackgroundResource(R.drawable.quora);
        holder.songtitle.setText(album.getSession());
     //   holder.like.setBackgroundResource(android.R);
        holder.time.setText(album.getTime());
        holder.songdes.setText(album.getSession());
        holder.likes.setText(album.getLikes());

        holder.thumbnail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(mContext,SongPlay.class);
                mContext.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return albumList.size();
    }
}