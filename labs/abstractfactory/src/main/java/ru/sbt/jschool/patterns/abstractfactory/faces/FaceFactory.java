package ru.sbt.jschool.patterns.abstractfactory.faces;

public interface FaceFactory {
    Face createFace();

    public Eye createEyeLeft();

    public Eye createEyeRight();

    Mouth createMouth();
}
