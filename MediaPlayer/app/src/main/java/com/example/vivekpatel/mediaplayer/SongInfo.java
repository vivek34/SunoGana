package com.example.vivekpatel.mediaplayer;

import android.media.Image;
import android.widget.ImageView;

/**
 * Created by VIVEK PATEL on 2/19/2018.
 */

public class SongInfo {
    private String SongName;
    private String session;
    private ImageView song_image;
    private String time;
    private ImageView thumb;
    private String likes;

    public SongInfo()
    {

    }
    public SongInfo(String songName, String session,String likes, String time)
    {
        this.SongName = songName;
        this.session = session;
        this.likes = likes;
        this.time = time;
    }
    public void setSongName(String songName)
    {
        this.SongName = songName;
    }
    public void setSession(String session)
    {
        this.session = session;
    }
    public void setSong_image(ImageView song_image)
    {
        this.song_image = song_image;
    }
    public void setTime(String time)
    {
        this.time = time;
    }
    public void setThumb(ImageView thumb)
    {
        this.thumb = thumb;
    }
    public void setLikes(String likes)
    {
        this.likes = likes;
    }
    public String getSongName()
    {
        return this.SongName;
    }
    public String getSession()
    {
        return this.session;
    }
    public ImageView getSong_image()
    {
       return this.song_image;
    }
    public String getTime()
    {
        return this.time;
    }
    public ImageView getThumb()
    {
        return this.thumb;
    }
    public String getLikes()
    {
        return this.likes;
    }
}
