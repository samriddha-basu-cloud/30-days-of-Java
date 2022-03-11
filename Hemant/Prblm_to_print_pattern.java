public class Prblm_to_print_pattern {
    /*
   static void pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(9);
    }
}*/


    //public class Ps_java_methods {
        /*
             static void multiplication (int n){
                for(int i=1;i<=10;i++){
                    System.out.println(n*i);
                }
            }
            public static void main(String[] args) {
                multiplication(7);
        }
        }
        */
    /*
    static int sumRec(int n) {
        // Base condition
        if (n == 1) {
            return 1;
        }
        return n + sumRec(n - 1);
    }

    public static void main(String[] args) {
       int c = sumRec(5);
        System.out.println(c);
    }
}
*/
/*
    static void pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j >i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(3);
    }
}*/

    static int fib(int n) {
        /* if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        } */
        if (n == 1 || n == 2) {
            return n - 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
public static void main(String[]args) {
    int result = fib(7 );
    System.out.println(result);
}
        }