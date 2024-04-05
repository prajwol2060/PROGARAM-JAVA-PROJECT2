package vowelconsonent;

import java.util.Scanner;

public class VowelConsonentCheck {
    public static void main(String[] args) {
        char ch;
        System.out.print("Enter a character: ");
        Scanner scanner = new Scanner(System.in);
        ch = scanner.next().toLowerCase().charAt(0);

        if ((ch >= 'a' && ch <= 'z')) {

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        }

    }
}
