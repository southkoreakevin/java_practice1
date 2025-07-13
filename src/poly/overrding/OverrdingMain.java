package poly.overrding;

public class OverrdingMain {

    public static void main(String[] args) {
        Child child = new Child();
        System.out.println("Child -> Child");
        System.out.println("value = " + child.value);
        System.out.println();
        child.method();

        Parent parent = new Parent();
        System.out.println("Parent -> Parent");
        System.out.println("value = " + parent.value);
        System.out.println();
        parent.method();

        Parent poly = new Child();
        System.out.println("Parent -> Child");
        System.out.println("Value = " + poly.value);
        System.out.println();
        poly.method();
    }

}
