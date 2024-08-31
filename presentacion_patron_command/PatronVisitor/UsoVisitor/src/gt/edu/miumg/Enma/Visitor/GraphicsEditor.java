package gt.edu.miumg.Enma.Visitor;

public class GraphicsEditor {

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(10, 4);
        Triangle triangle = new Triangle(6,3);

        Visitor areaCalculator = new AreaCalculator();
        Visitor shapeRender = new ShapeRender();

        circle.accept(areaCalculator);
        circle.accept(shapeRender);

        rectangle.accept(areaCalculator);
        rectangle.accept(shapeRender);

        triangle.accept(areaCalculator);
        triangle.accept(shapeRender);
    }
}
