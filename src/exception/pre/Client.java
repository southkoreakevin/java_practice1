package exception.pre;

public class Client {

    public void call() {
        throw new MyUncheckedException("ex");
    }

}
