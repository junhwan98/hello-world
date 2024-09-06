package assignment;

public class IRectangle implements IShape {
    int width;
    int height;

    public IRectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        System.out.print("직사각형의 넓이 : ");
        return height * width;
    }
}
