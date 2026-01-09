package com.example.petshop;

import java.util.Date;

public class Happy extends Mood {

    public Happy(Date moodDate) {
        super(moodDate);
    }

    public Happy() {
    }

    @Override
    public String getMood() {
        return "happy";
    }
}
