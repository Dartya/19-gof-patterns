package ru.sbt.jschool.patterns.abstractfactory.faces.impl.round;

import ru.sbt.jschool.patterns.abstractfactory.ShapeDrawer;
import ru.sbt.jschool.patterns.abstractfactory.faces.Face;

import java.awt.*;

public class RoundFace extends Face {

    public RoundFace(int faceWidth, int faceHeight) {
        super(faceWidth, faceHeight);
    }

    @Override
    public void draw(Graphics2D graphics) {
        int h = getFaceHeight();
        int w = getFaceWidth();
        ShapeDrawer.drawCircle(graphics, w / 2, h / 2, h / 2 - h / 15);
    }

}
