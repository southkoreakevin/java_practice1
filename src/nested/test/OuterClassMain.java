package nested.test;

import nested.test.OuterClass1.NestedClass;

public class OuterClassMain {

    public static void main(String[] args) {
        OuterClass1.NestedClass nes = new NestedClass();
        nes.hello();
    }
}
