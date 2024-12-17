package org.example;

public class Button {
    private int clickCount = 0;

    public void touch() {
        clickCount += 1;
        System.out.println(clickCount);
    }

    public int getClickCount() {
        return clickCount;
    }
}