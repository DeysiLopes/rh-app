package com.deysi.rh_app.application.core.domain;

import java.util.UUID;

public class Position {

    private UUID id;
    private String title;
    private String level;

    public Position() {
    }

    public Position(UUID id, String title, String level) {
        this.id = id;
        this.title = title;
        this.level = level;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
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
