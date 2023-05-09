package Patterns.Structural.bridge.shape;

import Patterns.Structural.bridge.color.Color;

public abstract class Shape {
    protected Color color;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
