public class Reverse_an_array {
    public static void main(String[] args) {
        int [] arr  = { 8,50,64,78,98};
        int l = arr.length;
        int n = Math.floorDiv(l, 2);
        int temp;
        for (int i=0; i<n;i++) {
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }
            for(int element: arr){
                System.out.println(element);


        }
    }
}
