abstract class Parent2{
    public Parent2(){
        System.out.println("I am a Parent2 Constructor");
    }
    public void SayHello(){
        System.out.println("Hello");
    }
    abstract  public void greet();
    abstract  public void greet2();
    }
    class Child2 extends Parent2{
    public void greet(){
        System.out.println("Good Morning");
    }   public void greet2(){
        System.out.println("Good Evening");
    }
    }
abstract class Child3 extends Parent2{
    public void th(){
        System.out.println("I am good ");
    }
}

public class Abstract_class {
    public static void main(String[] args) {
        //Parent2 p = new Parent2(); --> throws an cz they are abstract class
        Child2 c = new Child2() ;
     //   Child3 c3 = new Child3() ;--> throws an error cz they are abstract class


    }
}

