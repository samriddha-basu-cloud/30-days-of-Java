class Firstclass{
    int a;
    public int getA(){
        return  a;
    }
    Firstclass(int a){
        this.a = a;
    }
    public int returnone(){
        return 1;
    }
}
class Second extends Firstclass{
    Second(int c){
        super(c);
        System.out.println("I am a constructor");
    }
}
public class this_and_super {
    public static void main(String[] args) {
        Firstclass fc = new Firstclass(77);
        Second sc = new Second(33);
        System.out.println(fc.getA());
    }
}
