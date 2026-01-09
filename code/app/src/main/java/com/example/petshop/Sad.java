package com.example.petshop;

import java.util.Date;

public class Sad extends Mood{

    public Sad(Date moodDate) {
        super(moodDate);
    }

    public Sad() {
    }

    @Override
    public String getMood() {
        return "sad";
    }
}
