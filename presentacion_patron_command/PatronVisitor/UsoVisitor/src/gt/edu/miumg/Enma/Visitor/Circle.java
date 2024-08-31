package gt.edu.miumg.Enma.Visitor;

public class Circle implements  GraphicElement {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }
    public int getRadius() {
        return radius;
    }
    @Override
    public void accept( Visitor visitor) {
        visitor.visit(this);
    }
}
