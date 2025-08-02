package collection.set.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetOperationsTest {

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(List.of(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(List.of(3, 4, 5, 6, 7));

        Set<Integer> set3 = new HashSet<>();
        //union
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        //intersection retainAll
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        //difference
        Set<Integer> s = new HashSet<>(set1);
        s.removeAll(set2);

        System.out.println("union : " + union);
        System.out.println("intersection" + intersection);
        System.out.println("difference" + s);

    }

}
