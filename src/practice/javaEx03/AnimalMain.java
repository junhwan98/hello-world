package practice.javaEx03;

public class AnimalMain {

    public static void main(String[] args) {
        Animal a = new Animal();
        a.show();
        a.sound();

        Cat c = new Cat();
        c.show();
        c.sound();

        Dog d = new Dog();
        d.show();
        d.sound();

        //다형성 표현 : 부모 클래스 타입에 여러 자식 객체 대입
        //하나의 타입에 여러 객체를 대입함으로써 다양한 기능 이용
        //자식 타입이 부모 타입으로 자동 타입변입 변환 발생
        Animal ap = null;
        ap = new Cat();
        ap.show();
        ap.sound();

        ap = new Dog();
        ap.show();
        ap.sound();


    }
}
