package gt.edu.miumg.Enma.Visitor;

import java.awt.geom.Area;

public class AreaCalculator  implements Visitor {

    @Override
    public void visit(Triangle triangle) {
        double area = 0.5 * triangle.getBase() * triangle.getHeight();
        System.out.println("Area del Triangulo: " + area);

    }
    @Override
    public void visit(Circle circle) {
        double area =  Math.pow(circle.getRadius(), 2);
        System.out.println("Area del Circulo: " + area);

    }
    @Override
    public void visit(Rectangle rectangle) {
        int area = rectangle.getWidth() * rectangle.getHeight();
        System.out.println("Area del Rectangulo: " + area);
    }
}
