package assignment;

public class IShapeMain {

    public static void main(String[] args) {

        IShape circle = new ICircle(3);
        IShape rectangle = new IRectangle(5,6);
        IShape triangle = new ITriangle(7,8);

        System.out.println(circle.area());
        System.out.println(rectangle.area());
        System.out.println(triangle.area());

    }
}
