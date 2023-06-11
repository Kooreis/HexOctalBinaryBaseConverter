import java.util.Scanner;

public class BaseConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        int choice;
        do {
            System.out.println("1. Convert Binary to Decimal");
            System.out.println("2. Convert Binary to Hexadecimal");
            System.out.println("3. Convert Binary to Octal");
            System.out.println("4. Convert Decimal to Binary");
            System.out.println("5. Convert Decimal to Hexadecimal");
            System.out.println("6. Convert Decimal to Octal");
            System.out.println("7. Convert Hexadecimal to Binary");
            System.out.println("8. Convert Hexadecimal to Decimal");
            System.out.println("9. Convert Hexadecimal to Octal");
            System.out.println("10. Convert Octal to Binary");
            System.out.println("11. Convert Octal to Decimal");
            System.out.println("12. Convert Octal to Hexadecimal");
            System.out.println("13. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();