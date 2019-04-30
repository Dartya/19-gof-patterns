package ru.sbt.jschool.patterns.abstractfactory.faces.impl.round;

import ru.sbt.jschool.patterns.abstractfactory.faces.Eye;
import ru.sbt.jschool.patterns.abstractfactory.faces.Face;
import ru.sbt.jschool.patterns.abstractfactory.faces.FaceFactory;
import ru.sbt.jschool.patterns.abstractfactory.faces.Mouth;

public class RoundFaceFactory implements FaceFactory {
    private int faceWidth;
    private int faceHeight;

    public RoundFaceFactory(int faceWidth, int faceHeight) {
        this.faceWidth = faceWidth;
        this.faceHeight = faceHeight;
    }

    @Override
    public Face createFace() {
        return new RoundFace(faceWidth, faceHeight);

    }

    @Override
    public Eye createEyeLeft() {
        return new RoundEye(faceWidth, faceHeight, true);

    }

    @Override
    public Eye createEyeRight() {
        return new RoundEye(faceWidth, faceHeight, false);
    }

    @Override
    public Mouth createMouth() {
        return new RoundMouth(faceWidth, faceHeight);
    }
}
