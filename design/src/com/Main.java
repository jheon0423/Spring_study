package design.src.com;

import design.src.com.singleton.Aclazz;
import design.src.com.singleton.Bclazz;
import design.src.com.singleton.SocketClient;

public class Main {
    public static void main(String[] args){

        Aclazz aClazz = new Aclazz();
        Bclazz bClazz = new Bclazz();
        
        SocketClient aClient = aClazz.getSocketClient();
        SocketClient bClient = bClazz.getSocketClient();

        System.out.println("두개의 객체가 동일한가?");
        System.out.println(aClient.equals(bClient));
    }
}
