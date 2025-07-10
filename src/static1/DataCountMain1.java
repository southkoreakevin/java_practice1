package static1;

public class DataCountMain1 {

    public static void main(String[] args) {
        Count counter = new Count();
        Data1 data1 = new Data1("A", counter);
        System.out.println("A count = " + counter.count);

        Data1 data2 = new Data1("B", counter);
        System.out.println("B count = " + counter.count);

        Data1 data3 = new Data1("B", counter);
        System.out.println("B count = " + counter.count);


    }

}
