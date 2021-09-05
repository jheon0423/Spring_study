package design.src.com;

//import design.src.com.proxy.Browser;
import design.src.com.proxy.BrowserProxy;
import design.src.com.proxy.IBrowser;

// import design.src.com.adapter.AirConditioner;
// import design.src.com.adapter.Cleaner;
// import design.src.com.adapter.Electronic110V;
// import design.src.com.singleton.Aclazz;
// import design.src.com.singleton.Bclazz;
// import design.src.com.singleton.SocketClient;
// import design.src.com.adapter.HairDryer;
// import design.src.com.adapter.SocketAdapter;

public class Main {
    public static void main(String[] args){
        /*
        Browser browser = new Browser("www.naver.com");
        browser.show();
        */

        IBrowser browser = new BrowserProxy("www.naver.com");
        browser.show();
    }

    
}
