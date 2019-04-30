package ru.sbt.jschool.patterns.abstractfactory.faces.impl.round;

import ru.sbt.jschool.patterns.abstractfactory.ShapeDrawer;
import ru.sbt.jschool.patterns.abstractfactory.faces.Eye;

import java.awt.*;

public class RoundEye extends Eye {
    private void drawShape(Graphics2D graphics, int width, int height) {
        if (isLeft()) {
            ShapeDrawer.drawCircle(graphics, width / 4, height / 3, height / 20);
        } else {
            ShapeDrawer.drawCircle(graphics, width - width / 4, height / 3, height / 20);
        }
    }

    public RoundEye(int faceWidth, int faceHeight, boolean left) {
        super(faceWidth, faceHeight, left);
    }

    @Override
    public void draw(Graphics2D graphics) {
        drawShape(graphics, getFaceWidth(), getFaceHeight());
    }
}
