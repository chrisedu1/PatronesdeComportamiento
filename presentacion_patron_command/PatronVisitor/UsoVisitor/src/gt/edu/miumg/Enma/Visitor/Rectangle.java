package gt.edu.miumg.Enma.Visitor;

public class Rectangle implements GraphicElement{

    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
