public class Nmbr_in_aaray {
    public static void main(String[] args) {
        //Q2 Chk whether a no. is present in array or not
        int [] marks = { 90,98,97,96,92};
        int num = 98;
        boolean isInArray = false;
        for(int element : marks) {
            if (num == element) {
                isInArray = true;
                break;
            }
        }
        if (isInArray){
            System.out.println("The value is present in array");
        }
        else{
            System.out.println("The value is not present in array");
        }
    }
}
