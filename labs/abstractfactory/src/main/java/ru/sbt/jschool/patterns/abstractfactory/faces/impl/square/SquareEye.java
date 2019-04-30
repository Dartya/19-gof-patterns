package ru.sbt.jschool.patterns.abstractfactory.faces.impl.square;

import ru.sbt.jschool.patterns.abstractfactory.ShapeDrawer;
import ru.sbt.jschool.patterns.abstractfactory.faces.Eye;

import java.awt.*;

public class SquareEye extends Eye {

    private void drawShape(Graphics2D graphics, int width, int height) {
        if (isLeft()) {
            ShapeDrawer.drawSquare(graphics, width / 4, height / 4, height/4 - height/8);
        } else {
            ShapeDrawer.drawSquare(graphics, width - width / 4, height / 4, height/4 - height/8);
        }
    }

    public SquareEye(int faceWidth, int faceHeight, boolean left) {
        super(faceWidth, faceHeight, left);
    }

    @Override
    public void draw(Graphics2D graphics) {
        drawShape(graphics, getFaceWidth(), getFaceHeight());
    }
}
