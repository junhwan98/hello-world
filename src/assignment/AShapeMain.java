package assignment;

public class AShapeMain {

    public static void main(String[] args) {

        AShape circle = new ACircle(3);
        AShape rectangle = new ARectangle(4,5);
        AShape triangle = new ATriangle(7,8);

        AShape[] shapes = { circle,rectangle,triangle};

        for(AShape shape : shapes){
            System.out.println(shape.area());
        }
    }
}
