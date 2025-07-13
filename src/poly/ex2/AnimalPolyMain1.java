package poly.ex2;

public class AnimalPolyMain1 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        Animal[] animals = {dog, cat, caw};

        for (Animal animal : animals) {
            System.out.println("동물 테스트 시작 ");
            animal.sound();
            System.out.println("동물 테스트 끝");
        }

    }
}
