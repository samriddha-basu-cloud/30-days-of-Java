import javax.swing.*;

class Phone{
    public void ShowTime(){
        System.out.println("Time is 8 AM");
    }
    public void on(){
        System.out.println("Turning on Phone...");
    }
}
class SmartPhone extends Phone{
    public void music(){
        System.out.println("Playing Music");
    }
    public void on(){
        System.out.println("Turning on SmartPhone...");
    }
}
public class Dynamic_method_dispatch {
    public static void main(String[] args) {
        Phone ph = new Phone();
        SmartPhone sph = new SmartPhone();
                ph.on();
        ph.ShowTime();
        sph.music();
        sph.on();
        Phone phn = new SmartPhone();
        phn.ShowTime();
        phn.on();
        // phn.music(); -->Not Allowed
    }
}