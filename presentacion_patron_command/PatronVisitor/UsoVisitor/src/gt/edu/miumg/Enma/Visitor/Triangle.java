package gt.edu.miumg.Enma.Visitor;

public class Triangle implements GraphicElement {
    private int base;
    private int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }
    public int getBase(){
        return base;
    }
    public int getHeight(){
        return height;
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
