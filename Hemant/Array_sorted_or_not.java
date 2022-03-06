public class Array_sorted_or_not {
    public static void main(String[] args) {
        boolean isSorted = true;
        int [] arr = { 64,464,711,902,945,1500};
        for(int i = 0; i< arr.length-1;i++){
           if ( arr[i]>arr[i+1]){
               isSorted = false;
               break;
           }
        }
        if (isSorted)
        {
            System.out.println("The array is Sorted");
        }
        else{
            System.out.println("The array is not Sorted");
        }
    }
}
