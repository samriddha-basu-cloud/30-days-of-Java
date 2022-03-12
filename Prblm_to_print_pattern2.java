public class Prblm_to_print_pattern2 {
  /*
    static void pattern_rec(int n) {
        if (n > 0) {
            pattern_rec(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
            public static void main (String[]args){
pattern_rec(5);
            }
        }
        */
static void temperature (float c){
if(c==0)
{
    System.out.println("32 fahrenheit");
}
else{
    float f = (c * 9 / 5) + 32;

    System.out.println(f+ "fahrenheit");
}
}

    public static void main(String[] args) {
        temperature(45);
    }}