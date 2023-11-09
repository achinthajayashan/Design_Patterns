package structural.decorator_design_package;

public class DecoratorDemo {
    public static void main(String[] args) {
        Shape circle=new Circle();
        Shape redCircle =new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("circle without border");
        circle.draw();

        System.out.println("-----------------------------");

        System.out.println("circle with red border");
        redCircle.draw();
    }
}
