package assignment;

public abstract class AShape {
    public abstract double area();
}
class ACircle extends AShape{
    int radius;
    public ACircle(int radius){
        this.radius = radius;
    }
    @Override
    public double area(){
        System.out.print("원의 넓이 : ");
        return Math.PI * radius * radius;
    }
}
class ATriangle extends AShape{
    int bottomSide; //  밑변 길이
    int height;
    public ATriangle(int bottomSide, int height){
        this.bottomSide = bottomSide;
        this.height = height;
    }
    @Override
    public double area(){
        System.out.print("삼각형의 넓이 : ");
        return (double)height * bottomSide /2;
    }
}
class ARectangle extends AShape {
    int width;
    int height;

    public ARectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        System.out.print("직사각형의 넓이 : ");
        return height * width;
    }
}
