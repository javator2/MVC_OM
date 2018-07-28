package com.sda.mvc.model;

public enum Nourishment {
    SATUARED("satuared"), HUNGY("hungry"), STARVING("starving");
    private String title;

    Nourishment(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
