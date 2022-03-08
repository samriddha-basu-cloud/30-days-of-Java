public class Methods_overloading {
    static void foo(){
        System.out.println("Good mrng bro!");
    }
    static void foo(int a){
        System.out.println("Good mrng  " + a +" bro!");
    }

    static void change(int a) {
        a = 97;
    }
    static void change2(int []arr) {
        arr[0] = 81;
    }
       // static void TelJoke (){
         //   System.out.println("I invented a new word 1 \n"+
           // "Plagiarism! ");


   // }

    public static void main(String[] args) {
    // TelJoke();
      //  int[] marks = {98, 97, 95, 93, 91};
       // int x = 85;
        ///change(x);
     //   change2(marks);
       // System.out.println(+marks[0]);

//Methods overloading
        foo();
        foo(3000);
    }
}
