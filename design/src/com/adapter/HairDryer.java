package design.src.com.adapter;

public class HairDryer implements Electronic110V {

    @Override
    public void powerOn() {
        System.out.println("헤어드라이어 110V on");
    }
    
}