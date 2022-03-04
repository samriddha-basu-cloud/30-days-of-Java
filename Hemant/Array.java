public class Array {
    public static void main(String [] args){
        int [] marks = {90,98,96,97,91};
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        // Displaying the array using for loop
        System.out.println("Displaying using for loop");
        for(int i=0; i<marks.length;i++){
                 System.out.println(marks[i]);
        }
        System.out.println("Displaying using for loop in reverse order");
        for(int i=marks.length-1; i>=0;i--){
            System.out.println(marks[i]);
        }
        System.out.println("Displaying using for-each loop");
        for(int element : marks){
            System.out.println(element);
        }
    }
}
