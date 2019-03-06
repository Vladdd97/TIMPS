package bridge.shape;

import bridge.color.Color;

public class Circle extends Shape {
    public Circle(Color c) {
        super(c);
    }

    @Override
    public void applyColor() {
        System.out.print("Circle filled with color ");
        color.applyColor();
    }
}
