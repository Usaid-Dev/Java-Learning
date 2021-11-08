package com.company;

public class IntellijIdea extends Screen implements Game {

    @Override
    String getTitle() {
        return "Idea";
    }

    @Override
    public String getGameType() {
        return "Action";
    }
}
