package generic.test.ex3;

import generic.test.ex3.unit.BioUnit;

public class UnitUtil {

    static <T extends BioUnit> T maxHp(T t1, T t2) {
        int hp1 = t1.getHp();
        int hp2 = t2.getHp();
        if (hp1 >= hp2) {
            return t1;
        } else {
            return t2;
        }
    }

}
