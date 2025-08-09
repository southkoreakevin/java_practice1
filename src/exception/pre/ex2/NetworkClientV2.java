package exception.pre.ex2;

public class NetworkClientV2 {

    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV2(String address) {
        this.address = address;
    }

    public void connect() throws NetworkClientExceptionV2 {
        if (connectError) {
            throw new NetworkClientExceptionV2("connect error",
                address + "service connection fail");
        }
        System.out.println(address + " server connection success");

    }

    public void send(String data) throws NetworkClientExceptionV2 {
        if (sendError) {
            throw new NetworkClientExceptionV2("sendError",
                address + "server data transfermation fail" + data);
        }
        System.out.println(address + "success to server data transmition");
    }

    public void disconnect() {
        System.out.println(address + "server connection fail");
    }

    public void initError(String data) {
        if (data.contains("error1")) {
            connectError = true;
        }
        if (data.contains("error2")) {
            sendError = true;
        }
    }
}
