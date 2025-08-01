package exception.basic.checked;

public class Service {

    Client client = new Client();

    public void callCatch() {
        try {
            client.call();
        } catch (Exception e) {
            System.out.println("예외 처리, message = " + e.getMessage());
        }
        System.out.println("정상 흐름");
    }

    public void callThrow() throws MyCheckedException {
        client.call();
    }

}
