package calculator;
import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner n1 = new Scanner(System.in);
        System.out.println("enter two numbers");
        int a = n1.nextInt();
        int b = n1.nextInt();
        System.out.println("...CALCULATOR...rencyc");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("enter your choice");
        int choice = n1.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Addition Result = " + (a + b));
                break;
            case 2:
                System.out.println("Subtraction Result = " + (a - b));
                break;
            case 3:
                System.out.println("Multiplication Result = " + (a* b));
                break;
            case 4:
                System.out.println("Division Result = " + (a / b));
                break;
            default:
                System.out.println("INVALID CHOICE");
                break;
        }
    }
}