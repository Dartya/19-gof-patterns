package ru.sbt.jschool.patterns.abstractfactory.faces.impl.triangle;

import ru.sbt.jschool.patterns.abstractfactory.ShapeDrawer;
import ru.sbt.jschool.patterns.abstractfactory.faces.Mouth;

import java.awt.*;

public class TriangleMouth extends Mouth {
    private void drawShape(Graphics2D graphics, int width, int height) {
        ShapeDrawer.drawTriangle(graphics, width / 2, height - height/5, height/30);
    }

    public TriangleMouth(int faceWidth, int faceHeight) {
        super(faceWidth, faceHeight);
    }

    @Override
    public void draw(Graphics2D graphics) {
        drawShape(graphics, getFaceWidth(), getFaceHeight());
    }
}
