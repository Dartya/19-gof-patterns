package ru.sbt.jschool.patterns.abstractfactory.faces;

import java.awt.*;

public abstract class Mouth {
    private int faceWidth;
    private int faceHeight;

    public Mouth(int faceWidth, int faceHeight) {
        this.faceWidth = faceWidth;
        this.faceHeight = faceHeight;
    }

    public abstract void draw(Graphics2D graphics);

    public int getFaceWidth() {
        return faceWidth;
    }

    public int getFaceHeight() {
        return faceHeight;
    }
}
