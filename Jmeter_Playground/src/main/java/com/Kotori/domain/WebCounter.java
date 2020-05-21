package com.Kotori.domain;

public class WebCounter {
    public WebCounter(Integer userClickCounter) {
        this.userClickCounter = userClickCounter;
    }

    private Integer userClickCounter;

    public Integer getUserClickCounter() {
        return userClickCounter;
    }

    public void setUserClickCounter(Integer userClickCounter) {
        this.userClickCounter = userClickCounter;
    }
}
