package assignment;

public class Java08 {

    public static class Rectangle{
        int width;
        int height;

        public Rectangle(int width, int height) {
            this.width = width;
            this.height = height;
        }

        public int area(){
            return height*width;
        }

        public int perimeter(){
            return 2*(width + height);
        }

        public static void main(String[] args) {
            Rectangle r = new Rectangle(10,5);
            System.out.println("넓이 : "+ r.area());
            System.out.println("둘레 : "+ r.perimeter());
        }
    }



}
