package ru.sbt.jschool.patterns.abstractfactory.faces.impl.triangle;

import ru.sbt.jschool.patterns.abstractfactory.ShapeDrawer;
import ru.sbt.jschool.patterns.abstractfactory.faces.Face;

import java.awt.*;

public class TriangleFace extends Face {

    public TriangleFace(int width, int height) {
        super(width, height);
    }

    @Override
    public void draw(Graphics2D graphics) {
        int h = getFaceHeight();
        int w = getFaceWidth();

        ShapeDrawer.drawTriangle(graphics, w / 2, h / 2, w);
    }

}
