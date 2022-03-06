public class Max_in_array {
    public static void main(String[] args) {
        int [] arr = { 15,97,365,1489,735};
        int max = 0;
        for(int e : arr){
        if (e>max) {
            max = e;
        }
        }
        System.out.println("The value of max value present in this is " +max);
    }
}
