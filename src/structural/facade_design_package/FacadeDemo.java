package structural.facade_design_package;

public class FacadeDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawRectangle();
        shapeMaker.drawCircle();
        shapeMaker.drawSquare();
    }
}
