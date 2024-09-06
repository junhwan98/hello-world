package assignment;

public class ITriangle implements IShape {

    int bottomSide; //  밑변 길이
    int height;

    public ITriangle(int bottomSide, int height) {
        this.bottomSide = bottomSide;
        this.height = height;
    }

    @Override
    public double area() {
        System.out.print("삼각형의 넓이 : ");
        return (double)height * bottomSide /2;
    }
}
