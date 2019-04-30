package ru.sbt.jschool.patterns.abstractfactory.faces;

import java.awt.*;

public abstract class Face {
    private int faceWidth;
    private int faceHeight;

    public Face(int faceWidth, int faceHeight) {
        this.faceWidth = faceWidth;
        this.faceHeight = faceHeight;
    }

    public int getFaceWidth() {
        return faceWidth;
    }

    public int getFaceHeight() {
        return faceHeight;
    }

    public abstract void draw(Graphics2D graphics);
}
