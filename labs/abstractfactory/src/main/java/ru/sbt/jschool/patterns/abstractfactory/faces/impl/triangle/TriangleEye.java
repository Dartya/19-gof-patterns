package ru.sbt.jschool.patterns.abstractfactory.faces.impl.triangle;

import ru.sbt.jschool.patterns.abstractfactory.ShapeDrawer;
import ru.sbt.jschool.patterns.abstractfactory.faces.Eye;

import java.awt.*;

public class TriangleEye extends Eye {
    private void drawShape(Graphics2D graphics, int width, int height) {
        if (isLeft()) {
            ShapeDrawer.drawTriangle(graphics, width / 4, height / 3, height/2 - height/15);
        } else {
            ShapeDrawer.drawTriangle(graphics, width - width / 4, height / 3, height/2 - height/15);
        }
    }

    public TriangleEye(int faceWidth, int faceHeight, boolean left) {
        super(faceWidth, faceHeight, left);
    }

    @Override
    public void draw(Graphics2D graphics) {
        drawShape(graphics, getFaceWidth(), getFaceHeight());
    }
}
