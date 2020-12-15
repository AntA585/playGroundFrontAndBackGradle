package com.anthony.playgroundwebbackend.data;

public class ToDo {

    private String id;

    private String title;

    private Boolean completed;

    @Override
    public String toString() {
        return "ToDo{" +
                "title='" + title + '\'' +
                ", completed=" + completed +
                '}';
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Boolean getCompleted() {
        return completed;
    }
}
