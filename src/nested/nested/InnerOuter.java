package nested.nested;

public class InnerOuter {

    private static int outClassValue = 3;
    private int outInstanceValue = 2;

    class Inner {

        private int innerInstanceValue = 1;

        public void print() {
            System.out.println(innerInstanceValue);
            System.out.println(outClassValue);
            System.out.println(InnerOuter.outClassValue);
        }
    }

}
