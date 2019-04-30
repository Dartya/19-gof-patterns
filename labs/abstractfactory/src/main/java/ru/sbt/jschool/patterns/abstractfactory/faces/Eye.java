package ru.sbt.jschool.patterns.abstractfactory.faces;

import java.awt.*;

public abstract class Eye {
    private int faceWidth;
    private int faceHeight;
    private boolean left;

    public Eye(int faceWidth, int faceHeight, boolean left) {
        this.faceWidth = faceWidth;
        this.faceHeight = faceHeight;
        this.left = left;
    }

    public abstract void draw(Graphics2D graphics);

    public int getFaceWidth() {
        return faceWidth;
    }

    public int getFaceHeight() {
        return faceHeight;
    }

    public boolean isLeft() {
        return left;
    }
}
