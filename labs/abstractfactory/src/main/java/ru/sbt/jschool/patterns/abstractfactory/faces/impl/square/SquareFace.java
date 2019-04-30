package ru.sbt.jschool.patterns.abstractfactory.faces.impl.square;

import ru.sbt.jschool.patterns.abstractfactory.ShapeDrawer;
import ru.sbt.jschool.patterns.abstractfactory.faces.Face;

import java.awt.*;

public class SquareFace extends Face {

    public SquareFace(int faceWidth, int faceHeight) {
        super(faceWidth, faceHeight);
    }

    @Override
    public void draw(Graphics2D graphics) {
        int h = getFaceHeight();
        int w = getFaceWidth();
        ShapeDrawer.drawSquare(graphics, w-w/14, h-h/3, h-h/10);
    }
}
