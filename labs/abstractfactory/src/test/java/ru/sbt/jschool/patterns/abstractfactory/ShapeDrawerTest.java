package ru.sbt.jschool.patterns.abstractfactory;

import ru.sbt.jschool.patterns.abstractfactory.faces.Eye;
import ru.sbt.jschool.patterns.abstractfactory.faces.Face;
import ru.sbt.jschool.patterns.abstractfactory.faces.FaceFactory;
import ru.sbt.jschool.patterns.abstractfactory.faces.Mouth;
import ru.sbt.jschool.patterns.abstractfactory.faces.impl.round.RoundEye;
import ru.sbt.jschool.patterns.abstractfactory.faces.impl.round.RoundFace;
import ru.sbt.jschool.patterns.abstractfactory.faces.impl.round.RoundFaceFactory;
import ru.sbt.jschool.patterns.abstractfactory.faces.impl.round.RoundMouth;
import ru.sbt.jschool.patterns.abstractfactory.faces.impl.square.SquareEye;
import ru.sbt.jschool.patterns.abstractfactory.faces.impl.square.SquareFace;
import ru.sbt.jschool.patterns.abstractfactory.faces.impl.square.SquareMouth;
import ru.sbt.jschool.patterns.abstractfactory.faces.impl.triangle.TriangleEye;
import ru.sbt.jschool.patterns.abstractfactory.faces.impl.triangle.TriangleFace;
import ru.sbt.jschool.patterns.abstractfactory.faces.impl.triangle.TriangleFaceFactory;
import ru.sbt.jschool.patterns.abstractfactory.faces.impl.triangle.TriangleMouth;

import java.awt.*;
import java.io.IOException;

public class ShapeDrawerTest {

    public void createRoundFace() throws IOException {
        int w = 800;
        int h = 800;
        Face face = new RoundFace(w, h);
        Eye eyeLeft = new RoundEye(w, h, true);
        Eye eyeRight = new RoundEye(w, h, false);
        Mouth mouth = new RoundMouth(w, h);

        ShapeDrawer.drawImage((graphics2D, width, height) -> {
            drawShapes(graphics2D, width, height, face, eyeLeft, eyeRight, mouth);
        }, w, h, "round_face_image.png");
    }

    public void createSquareFace() throws IOException{
        int w = 800;
        int h = 800;
        Face face = new SquareFace(w, h);
        Eye yeyLeft = new SquareEye(w, h, true);
        Eye yeyRight = new SquareEye(w, h, false);
        Mouth mouth = new SquareMouth(w, h);

        ShapeDrawer.drawImage(((graphics2D, width, height) -> {
            drawShapes(graphics2D, width, height, face, yeyLeft, yeyRight, mouth);
        }), w, h, "square_face_image.png");
    }

    public void createTriangleFace() throws IOException {
        int w = 800;
        int h = 800;
        Face face = new TriangleFace(w, h);
        Eye eyeLeft = new TriangleEye(w, h, true);
        Eye eyeRight = new TriangleEye(w, h, false);
        Mouth mouth = new TriangleMouth(w, h);

        ShapeDrawer.drawImage((graphics2D, width, height) -> {
            drawShapes(graphics2D, width, height, face, eyeLeft, eyeRight, mouth);
        }, w, h, "triangle_face_image.png");
    }

    public void createFaceWithFactory(FaceFactory faceFactory, int w, int h) throws IOException {
        Face face = faceFactory.createFace();
        Eye eyeLeft = faceFactory.createEyeLeft();
        Eye eyeRight = faceFactory.createEyeRight();
        Mouth mouth = faceFactory.createMouth();

        ShapeDrawer.drawImage((graphics2D, width, height) -> {
            drawShapes(graphics2D, width, height, face, eyeLeft, eyeRight, mouth);
        }, w, h, "face_image.png");
    }

    private void drawShapes(Graphics2D graphics, int width, int height, Face face, Eye eyeLeft, Eye eyeRight, Mouth mouth) {
        ShapeDrawer.fillBack(graphics, width, height);
        face.draw(graphics);
        eyeLeft.draw(graphics);
        eyeRight.draw(graphics);
        mouth.draw(graphics);

    }

    // Родина слышит - сертификаты подменяются, репозитории не доступны :)
    public static void main(String[] args) throws IOException {
        ShapeDrawerTest test = new ShapeDrawerTest();

        test.createTriangleFace();
        test.createRoundFace();
        test.createSquareFace();

        int h = 800;
        int w = 800;

        FaceFactory faceFactory = new TriangleFaceFactory(w, h);

        test.createFaceWithFactory(faceFactory, w, h);
    }
}
