package ru.sbt.jschool.patterns.abstractfactory.faces.impl.square;

import ru.sbt.jschool.patterns.abstractfactory.ShapeDrawer;
import ru.sbt.jschool.patterns.abstractfactory.faces.Mouth;

import java.awt.*;

public class SquareMouth extends Mouth {

    private void drawShape(Graphics2D graphics, int width, int height) {
        ShapeDrawer.drawSquare(graphics, width / 2, height - height/2, height/15);
    }

    public SquareMouth(int faceWidth, int faceHeight) {
        super(faceWidth, faceHeight);
    }

    @Override
    public void draw(Graphics2D graphics) {
        drawShape(graphics, getFaceWidth(), getFaceHeight());
    }
}
