package bridge.shape;

import bridge.color.Color;

public class Square extends Shape {

    public Square(Color c) {
        super(c);
    }

    @Override
    public void applyColor() {
        System.out.print("Square of color ");
        color.applyColor();
    }
}
