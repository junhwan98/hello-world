package assignment;

public class Shape {

public double area(Shape shape){return 0;};

}

class Circle extends Shape{
    int radius;


    public Circle(int radius){
        this.radius = radius;
    }

    @Override
    public double area(Shape circle){
        System.out.print("원의 넓이 : ");
        return Math.PI * ((Circle) circle).radius * ((Circle) circle).radius;
    }
}
class Triangle extends Shape{
    int bottomSide; //  밑변 길이
    int height;
    public Triangle(int bottomSide,int height){
        this.bottomSide = bottomSide;
        this.height = height;
    }
    @Override
    public double area(Shape triangle){
        System.out.print("삼각형의 넓이 : ");
        return (double)((Triangle)triangle).height * ((Triangle)triangle).bottomSide /2;
    }
}
class Rectangle extends Shape{
int width;
int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
@Override
    public double area(Shape rectangle){
    System.out.print("직사각형의 넓이 : ");
        return ((Rectangle)rectangle).height * ((Rectangle)rectangle).width;
    }
}

