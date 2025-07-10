package static1;

public class Data1 {

    public String name;

    public Data1(String name, Count counter) {
        this.name = name;
        counter.count++;
    }
}
