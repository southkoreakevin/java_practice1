package extends1.ex1;

public class ElectricCar extends Car {


    @Override
    public void move() {
        System.out.println("전기차를 빠르게 이동합니다.");
    }

    public void charge() {
        System.out.println("charge");
    }

}
