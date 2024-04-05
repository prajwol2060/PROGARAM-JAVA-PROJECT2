package simpleinterest;
import java.util.Scanner;
public class simpleinterest {
    public static void main(String[] args) {
        float p,r,t,SI;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a principal :");
        p=sc.nextFloat();
        System.out.println("enter the rate of interest:");
        r=sc.nextFloat();
        System.out.println("enter the time period");
        t=sc.nextFloat();

        SI=(p*r*t)/100;
        System.out.println("simple interest is :" +SI);

    };
}
