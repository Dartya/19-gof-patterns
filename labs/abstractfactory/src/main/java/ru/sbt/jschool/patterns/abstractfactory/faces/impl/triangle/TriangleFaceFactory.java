package ru.sbt.jschool.patterns.abstractfactory.faces.impl.triangle;

import ru.sbt.jschool.patterns.abstractfactory.faces.Eye;
import ru.sbt.jschool.patterns.abstractfactory.faces.Face;
import ru.sbt.jschool.patterns.abstractfactory.faces.FaceFactory;
import ru.sbt.jschool.patterns.abstractfactory.faces.Mouth;

public class TriangleFaceFactory implements FaceFactory {

    private int faceWidth;
    private int faceHeight;

    public TriangleFaceFactory(int faceWidth, int faceHeight) {
        this.faceWidth = faceWidth;
        this.faceHeight = faceHeight;
    }

    @Override
    public Face createFace() {
        return new TriangleFace(faceWidth, faceHeight);

    }

    @Override
    public Eye createEyeLeft() {
        return new TriangleEye(faceWidth, faceHeight, true);

    }

    @Override
    public Eye createEyeRight() {
        return new TriangleEye(faceWidth, faceHeight, false);
    }

    @Override
    public Mouth createMouth() {
        return new TriangleMouth(faceWidth, faceHeight);
    }
}
