package currencyconvertor;
import java.util.Scanner;
public class currencyconvertor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("CURRENCY CONVERTER");
        System.out.println("1. USD to NPR");
        System.out.println("2.NPR to USD");
        System.out.println("3.INR to NPR");
        System.out.println("4.NPR to INR");

        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter Amount in US dollar");
                int usd = sc.nextInt();
                System.out.println("$" + usd + "=" + "Rs" + (usd * 113.18));
                break;
            case 2:
                System.out.println("Enter Amount in Nepali Rupees");
                int npr = sc.nextInt();
                System.out.println("Rs" + npr + "=" + "$" + (npr / 113.18));
                break;
            case 3:
                System.out.println("Enter Amount in Indian Rupees");
                int inr = sc.nextInt();
                System.out.println("Indian RS" + inr + "="+"NepaliRS" + (inr/1.60));
                break;
            case 4:
                System.out.println("Enter Amount in Nepali Rupees");
                int npr1= sc.nextInt();
                System.out.println("Nepali RS" + npr1 + "=" + "Indian RS"+(npr1*1.60));
                break;

            default:
                System.out.println("INVALID CHOICE");
                break;
        }
    }
}
