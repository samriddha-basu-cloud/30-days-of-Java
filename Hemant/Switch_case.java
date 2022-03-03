import java.util.Scanner;

public class Switch_case {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter your age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        switch(age){
            case 17:
                System.out.println("You are not an adult");
                break;

        case 21:
        System.out.println("You are an adult");
        break;

        case 5:
                System.out.println("You are a child");
                break;
            default:
                System.out.println("Age is just a number");
}
    }
}
