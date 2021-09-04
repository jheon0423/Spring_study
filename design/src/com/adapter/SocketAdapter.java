package design.src.com.adapter;


public class SocketAdapter implements Electronic110V{

    private Electronic220V electronic220v;

    public SocketAdapter(Electronic220V electronic220v){
        this.electronic220v = electronic220v;
    }

    @Override
    public void powerOn() {
        electronic220v.connect();
    }
    
}
