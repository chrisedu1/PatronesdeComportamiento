package gt.edu.miumg.Enma.Visitor;

import javax.sound.sampled.Line;

public interface Visitor {
    void visit(Circle circle);
    void visit(Rectangle rectangle);
    void visit(Triangle line);
}
