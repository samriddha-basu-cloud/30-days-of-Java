import java.util.Scanner;

public class question5 {
    public static void main(String[] args) {
        
        Scanner year= new Scanner(System.in);
        int given_year= year.nextInt();
        if (given_year%4==0) {
            System.out.println("the year u entered is a leap year");    
        }
        else{
            System.out.println("the year u entered is not a leap year");
        }

    }
    
}
