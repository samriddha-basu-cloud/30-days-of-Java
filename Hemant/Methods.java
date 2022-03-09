public class Methods {
    static int logic(int x, int y) {
        int z;
        if (x > y) {
            z = (x + y) * 8;
        } else {
            z = x + y;
        }
        return z;

    }
    public static void main(String[] args) {
        int a = 7;
        int b = 2;
        int c;
        c = logic(a,b);
        int a1 = 9;
        int b1 = 10;
        int c1;
        if (a1>b1){
            c1 = (a1+b1)*4;
        }
        else {
            c1 = a1+b1;
        }
        System.out.println(c);
        System.out.println(c1);


    }

}