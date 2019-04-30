package ru.sbt.jschool.patterns.abstractfactory.faces.impl.square;

import ru.sbt.jschool.patterns.abstractfactory.faces.Eye;
import ru.sbt.jschool.patterns.abstractfactory.faces.Face;
import ru.sbt.jschool.patterns.abstractfactory.faces.FaceFactory;
import ru.sbt.jschool.patterns.abstractfactory.faces.Mouth;

public class SquareFaceFactory implements FaceFactory {
    private int faceWidth;
    private int faceHeight;

    public SquareFaceFactory(int faceWidth, int faceHeight) {
        this.faceWidth = faceWidth;
        this.faceHeight = faceHeight;
    }

    @Override
    public Face createFace() {
        return new SquareFace(faceWidth, faceHeight);
    }

    @Override
    public Eye createEyeLeft() {
        return new SquareEye(faceWidth, faceHeight, true);
    }

    @Override
    public Eye createEyeRight() {
        return new SquareEye(faceWidth, faceHeight, false);
    }

    @Override
    public Mouth createMouth() {
        return new SquareMouth(faceWidth, faceHeight);
    }
}
