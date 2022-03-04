import java.util.Scanner;

// multiplication table.
public class question7 {
    public static void main(String[] args) {
        
        int num;
        Scanner no = new Scanner(System.in);
        num= no.nextInt();
        for(int i = 1; i <= 10; ++i)
        {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
        }
    }
    
}



    
