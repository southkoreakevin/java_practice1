package generic.ex3;

import generic.animal.Animal;

public class AnimalHospitalV1<T> {

    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkup() {
//        System.out.println("동물 이름: " + animal.getName());
//        System.out.println("동물 크기: " + animal.getSize());
//        animal.sound();
        animal.toString();
        animal.equals(null);
    }

    public Animal getBigger(T target) {
//        return animal.getSize() > target.getSize() ? animal : target;
        return null;
    }


}
