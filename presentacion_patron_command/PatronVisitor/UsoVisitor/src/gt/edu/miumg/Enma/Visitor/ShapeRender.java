package gt.edu.miumg.Enma.Visitor;

import java.awt.*;

public class ShapeRender implements Visitor {
    @Override
    public void visit(Circle circle) {
        System.out.println("Dibujando un circulo con ASCII Art:");
        System.out.println("  ***  ");
        System.out.println(" *   * ");
        System.out.println("  *** ");

    }
    @Override
    public void visit(Rectangle rectangle) {
        System.out.println("Dibujando un Rectangulo con ASCII Art:");
        System.out.println(" *****  ");
        System.out.println(" *   * ");
        System.out.println(" ***** ");
    }
    @Override
    public void visit(Triangle triangle) {
        System.out.println("Dibujando un Triangulo con ASCII Art:");
        System.out.println("  / \\  ");
        System.out.println(" /   \\ ");
        System.out.println("/     \\");
    }
}
