import java.util.Scanner;

// sum of natural numbers
public class question8 {
    public static void main(String[] args) {
        int num,sum=0;
        Scanner n= new Scanner(System.in);
        num=n.nextInt();
        for (int i = 1; i <=num; i++) {
             sum=sum+i;   
        }
        System.out.printf("the sum of the natural numbers is %d ",sum);    
    }
    
}
