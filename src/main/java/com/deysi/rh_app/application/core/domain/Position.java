package com.deysi.rh_app.application.core.domain;

public class Position {

    private String id;
    private String title;
    private String level;

    public Position() {
    }

    public Position(String id, String title, String level) {
        this.id = id;
        this.title = title;
        this.level = level;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
