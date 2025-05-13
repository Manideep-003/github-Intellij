package com.man.introduction.Interfaces;

public class powerengine implements engine {
    @Override
    public void brake() {
        System.out.println("powerengine breake");
    }

    @Override
    public void start() {
        System.out.println("power engine sart");
    }

    @Override
    public void stop(int x) {
        System.out.println("powerengine stop");
    }
}
