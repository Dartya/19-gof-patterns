package ru.sbt.jschool.patterns.abstractfactory;

import java.awt.*;

public interface ImageDrawer {
    void drawOnCanvas(Graphics2D graphics2D, int width, int height);
}
