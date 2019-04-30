package ru.sbt.jschool.patterns.abstractfactory;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ShapeDrawer {
    public static void drawImage(ImageDrawer imageDrawer, int width, int height, String fileName) {
        final BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D graphics = image.createGraphics();

        imageDrawer.drawOnCanvas(graphics, width, height);

        graphics.dispose();
        try {
            ImageIO.write(image, "png", new File(fileName));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void drawCircle(Graphics2D graphics2D, int x, int y, int r) {
        graphics2D.setPaint(Color.BLACK);
        graphics2D.drawOval(x - r, y - r, 2 * r, 2 * r);
    }

    public static void drawTriangle(Graphics2D graphics2D, int x, int y, int size) {
        graphics2D.setPaint(Color.BLACK);
        graphics2D.drawPolygon(new int[]{x - size / 2, x + size / 2, x}, new int[]{y - size / 2, y - size / 2, y + size / 2}, 3);
    }

    public static void drawSquare(Graphics2D graphics2D, int x, int y, int size){
        graphics2D.setPaint(Color.BLACK);
        graphics2D.drawPolygon(new int[]{x, x - size, x - size, x}, new int[]{y, y, y - size, y - size}, 4);
    }

    public static void fillBack(Graphics2D graphics2D, int width, int height) {
        graphics2D.setPaint(Color.WHITE);
        graphics2D.fillRect(0, 0, width, height);
    }

}
