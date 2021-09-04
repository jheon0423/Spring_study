package design.src.com;

import design.src.com.adapter.AirConditioner;
import design.src.com.adapter.Cleaner;
import design.src.com.adapter.Electronic110V;
// import design.src.com.singleton.Aclazz;
// import design.src.com.singleton.Bclazz;
// import design.src.com.singleton.SocketClient;
import design.src.com.adapter.HairDryer;
import design.src.com.adapter.SocketAdapter;

public class Main {
    public static void main(String[] args){

        // Aclazz aClazz = new Aclazz();
        // Bclazz bClazz = new Bclazz();
        
        // SocketClient aClient = aClazz.getSocketClient();
        // SocketClient bClient = bClazz.getSocketClient();

        // System.out.println("두개의 객체가 동일한가?");
        // System.out.println(aClient.equals(bClient));
        HairDryer hairDryer = new HairDryer();
        connect(hairDryer);

        Cleaner cleaner = new Cleaner();
        //connect(cleaner);
        Electronic110V adapter = new SocketAdapter(cleaner);
        connect(adapter);

        AirConditioner airConditioner = new AirConditioner();
        Electronic110V airAdapter = new SocketAdapter(airConditioner);
        connect(airAdapter);
    }
    // 콘센트
    public static void connect(Electronic110V electronic110v){
        electronic110v.powerOn();
    }

    
}
