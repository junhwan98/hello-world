package assignment;

public class ICircle implements IShape {
    int radius;


    public ICircle(int radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        System.out.print("원의 넓이 : ");
        return Math.PI * (double) radius * radius;
    }
}
