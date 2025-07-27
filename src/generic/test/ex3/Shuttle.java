package generic.test.ex3;

import generic.test.ex3.unit.BioUnit;

public class Shuttle<T extends BioUnit> {

    T t;

    public void in(T unit) {
        this.t = unit;
    }

    public void showInfo() {
        System.out.println(t.toString());
    }

    public T out() {
        return t;
    }
}
