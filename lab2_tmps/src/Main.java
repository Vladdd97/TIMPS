import adapter.*;
import adapter.Volt;
import bridge.color.BlackColor;
import bridge.color.BlueColor;
import bridge.shape.Circle;
import bridge.shape.Shape;
import bridge.shape.Square;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n\tTest Adapter Pattern: ");
        testAdapterPattern();
        System.out.println("\n\tTest Bridge Pattern: ");
        testBridgePattern();
    }

    public static void testBridgePattern(){
        Shape square = new Square(new BlackColor());
        square.applyColor();

        Shape circle = new Circle(new BlueColor());
        circle.applyColor();
    }

    public static void testAdapterPattern(){
        SocketAdapter sockAdapter = new SocketClassAdapterImpl();
        Volt v3 = getVolt(sockAdapter,3);
        Volt v12 = getVolt(sockAdapter,12);
        Volt v120 = getVolt(sockAdapter,120);
        System.out.println("v3 volts using Object Adapter="+v3.getVolts());
        System.out.println("v12 volts using Object Adapter="+v12.getVolts());
        System.out.println("v120 volts using Object Adapter="+v120.getVolts());
    }

    private static Volt getVolt(SocketAdapter sockAdapter, int i) {
        switch (i) {
            case 3:
                return sockAdapter.get3Volt();
            case 12:
                return sockAdapter.get12Volt();
            case 120:
                return sockAdapter.get120Volt();
            default:
                return sockAdapter.get120Volt();
        }
    }
}
