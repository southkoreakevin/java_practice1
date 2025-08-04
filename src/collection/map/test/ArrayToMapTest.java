package collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ArrayToMapTest {

    public static void main(String[] args) {
        String[][] productArr = {{"Java", "10000"}, {"Spring", "20000"}, {"JPA", "30000"}};

        // 주어진 배열로부터 Map 생성
        Map<String, Integer> productMap = new HashMap<>();

        for (String[] strings : productArr) {
            productMap.put(strings[0], Integer.valueOf(strings[1]));
        }

        Set<String> keySet = productMap.keySet();
        for (String string : keySet) {
            Integer value = productMap.get(string);
            System.out.println("key = " + string + ", value = " + value);

        }

    }

}
