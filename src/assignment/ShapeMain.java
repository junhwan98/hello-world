package assignment;

public class ShapeMain {
    public static void main(String[] args) {

        Shape circle = new Circle(3);
        Shape triangle = new Triangle(4,5);
        Shape rectangle = new Rectangle(6,7);

        Shape[] shapes = {circle,triangle,rectangle};


        for(Shape shape : shapes){
            System.out.println(shape.area(shape));
        }
    }
}
