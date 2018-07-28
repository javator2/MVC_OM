package com.sda.mvc.model;

public enum Health {
    HEALTHY("healthy"), WOUNDER("wounder"),  DEAD("dead");
    private String title;

    Health(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
