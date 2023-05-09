package Patterns.Structural.bridge;

import Patterns.Structural.bridge.color.BlueColor;
import Patterns.Structural.bridge.color.RedColor;
import Patterns.Structural.bridge.shape.Circle;
import Patterns.Structural.bridge.shape.Square;

public class bridgeApp {
    public static void main(String[] args) {
        Circle blueCircle = new Circle();
        blueCircle.setColor(new BlueColor());

        Circle redCircle = new Circle();
        redCircle.setColor(new RedColor());

        Square square = new Square();
        square.setColor(new RedColor());
    }
}
