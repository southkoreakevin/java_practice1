package generic.test.ex2;

public class PairTest {

    public static void main(String[] args) {
        Pair<Integer, String> pair1 = new Pair<>();
        pair1.setData1(1);
        pair1.setData2("data");
        System.out.println(pair1.getData1());
        System.out.println(pair1.getData2());
        System.out.println("pair1 = " + pair1);

        Pair<String, String> pair2 = new Pair<>();
        pair2.setData1("key");
        pair2.setData2("value");
        System.out.println(pair2.getData1());
        System.out.println(pair2.getData2());
        System.out.println("pair2 = " + pair2);

    }

}
