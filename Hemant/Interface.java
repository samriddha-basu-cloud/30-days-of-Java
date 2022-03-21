interface Bicycle{
    int a = 45;
    void applyBrake(int decrement);
    void speedup(int increment);
}
interface HornBlow{
    void BlowHornPee();
    void BlowHornPoo();
}
class AvonCycle implements Bicycle, HornBlow{
    void blowhorn(){
        System.out.println("Pee Pee Pee Poo");
    }
   public void applyBrake(int decrement){
        System.out.println("Applying Brake");
    }
    public void speedup(int increment){
        System.out.println("Applying Speedup");
    }
    public void BlowHornPee(){
        System.out.println("Pee Pee Pee");
    }
    public void BlowHornPoo(){
        System.out.println("Poo Poo Poo");
    }
}
public class Interface {
    public static void main(String[] args) {
        AvonCycle Cycle1 = new AvonCycle();
        Cycle1.applyBrake(2);
        System.out.println(Cycle1.a);
        Cycle1.blowhorn();
        Cycle1.BlowHornPee();
        Cycle1.BlowHornPoo();
        Cycle1.speedup(3);
        //Cycle1.a = 454; --> Can't modify the properties in interferance as they are final
       // System.out.println(Cycle1.a);
    }
}
