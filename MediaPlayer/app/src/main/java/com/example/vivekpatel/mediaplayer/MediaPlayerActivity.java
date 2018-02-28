package com.example.vivekpatel.mediaplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class MediaPlayerActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MusicAdapter adapter;
    private List<SongInfo> songList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media_player);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        songList = new ArrayList<>();
        adapter = new MusicAdapter(this,songList);

        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);

        prepareSongs();
    }
    private void prepareSongs() {
        int[] covers = new int[]{
                R.drawable.quora,
                R.drawable.quora,
                R.drawable.quora,
                R.drawable.quora,
                R.drawable.quora,
                R.drawable.quora,
                R.drawable.quora,
                R.drawable.quora,
                R.drawable.quora,
               };

        int[] likess = new int[]{
                R.drawable.red_heart,
                R.drawable.red_heart,
                R.drawable.red_heart,
                R.drawable.red_heart,
                R.drawable.red_heart,
                R.drawable.red_heart,
                R.drawable.red_heart,
                R.drawable.red_heart,
                R.drawable.red_heart,
        };

        SongInfo a = new SongInfo("Quora Qaagaz","Session1-Session2","22.4k","2:10 min");
        songList.add(a);
        SongInfo a1 = new SongInfo("Quora Qaagaz","Session1-Session2","22.4k","2:10 min");
        songList.add(a1);
        SongInfo a2 = new SongInfo("Quora Qaagaz","Session1-Session2","22.4k","2:10 min");
        songList.add(a2);
        SongInfo a3 = new SongInfo("Quora Qaagaz","Session1-Session2","22.4k","2:10 min");
        songList.add(a3);
        SongInfo a4 = new SongInfo("Quora Qaagaz","Session1-Session2","22.4k","2:10 min");
        songList.add(a4);
        SongInfo a5 = new SongInfo("Quora Qaagaz","Session1-Session2","22.4k","2:10 min");
        songList.add(a5);
        SongInfo a6 = new SongInfo("Quora Qaagaz","Session1-Session2","22.4k","2:10 min");
        songList.add(a6);
        SongInfo a7 = new SongInfo("Quora Qaagaz","Session1-Session2","22.4k","2:10 min");
        songList.add(a7);
        SongInfo a8 = new SongInfo("Quora Qaagaz","Session1-Session2","22.4k","2:10 min");
        songList.add(a8);
        SongInfo a9 = new SongInfo("Quora Qaagaz","Session1-Session2","22.4k","2:10 min");
        songList.add(a9);
        adapter.notifyDataSetChanged();
    }
}
