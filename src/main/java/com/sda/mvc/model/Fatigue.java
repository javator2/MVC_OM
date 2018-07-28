package com.sda.mvc.model;

public enum Fatigue {
    TIRED("tired"),SLEEPING ("sleeping");
    private String title;

    Fatigue(String title) {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
