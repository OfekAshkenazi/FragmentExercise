package com.example.android.fragmentexercise;

/**
 * Created by Android on 10/26/2017.
 */

public class MyEvent {
    String title;
    String date;

    public MyEvent(String title, String date) {
        this.title = title;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
