class A{
    public int a;
    //public int Hemant(){
     //   return 3;
   // }
    public void meth2(){
        System.out.println("I an a method 2 of class A");
    }
}
class B extends A{
    @Override
    public void meth2(){
        System.out.println("I am a method 2 of class B");
    }
    public void meth3(){
       System.out.println("I am a method 3 of class B");
    }
}
public class Method_Override {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();
        B b = new B();
        b.meth2();
    }
}
