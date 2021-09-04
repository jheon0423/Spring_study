package design.src.com.singleton;

public class Bclazz {
    private SocketClient socketClient;

    public Bclazz(){
        this.socketClient = SocketClient.getInstance();
    }

    public SocketClient getSocketClient(){
        return this.socketClient;
    }
}
