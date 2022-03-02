import java.util.Scanner;
public class question3 {
    public static void main(String[] args) {
        Scanner age = new Scanner(System.in); 
        int user_age;
        user_age= age.nextInt();
            if (user_age<18) {
                System.out.println("you are not eligible to drive");
                
            }
            else{
                System.out.println("you are eligible to drive");
            }
        
        
       
        
    }

    
}
