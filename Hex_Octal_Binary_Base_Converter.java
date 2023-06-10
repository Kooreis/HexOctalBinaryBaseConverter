```java
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
            switch (choice) {
                case 1:
                    System.out.println("Enter binary number: ");
                    input = scanner.next();
                    System.out.println("Decimal: " + Integer.parseInt(input, 2));
                    break;
                case 2:
                    System.out.println("Enter binary number: ");
                    input = scanner.next();
                    System.out.println("Hexadecimal: " + Integer.toHexString(Integer.parseInt(input, 2)).toUpperCase());
                    break;
                case 3:
                    System.out.println("Enter binary number: ");
                    input = scanner.next();
                    System.out.println("Octal: " + Integer.toOctalString(Integer.parseInt(input, 2)));
                    break;
                case 4:
                    System.out.println("Enter decimal number: ");
                    input = scanner.next();
                    System.out.println("Binary: " + Integer.toBinaryString(Integer.parseInt(input)));
                    break;
                case 5:
                    System.out.println("Enter decimal number: ");
                    input = scanner.next();
                    System.out.println("Hexadecimal: " + Integer.toHexString(Integer.parseInt(input)).toUpperCase());
                    break;
                case 6:
                    System.out.println("Enter decimal number: ");
                    input = scanner.next();
                    System.out.println("Octal: " + Integer.toOctalString(Integer.parseInt(input)));
                    break;
                case 7:
                    System.out.println("Enter hexadecimal number: ");
                    input = scanner.next();
                    System.out.println("Binary: " + Integer.toBinaryString(Integer.parseInt(input, 16)));
                    break;
                case 8:
                    System.out.println("Enter hexadecimal number: ");
                    input = scanner.next();
                    System.out.println("Decimal: " + Integer.parseInt(input, 16));
                    break;
                case 9:
                    System.out.println("Enter hexadecimal number: ");
                    input = scanner.next();
                    System.out.println("Octal: " + Integer.toOctalString(Integer.parseInt(input, 16)));
                    break;
                case 10:
                    System.out.println("Enter octal number: ");
                    input = scanner.next();
                    System.out.println("Binary: " + Integer.toBinaryString(Integer.parseInt(input, 8)));
                    break;
                case 11:
                    System.out.println("Enter octal number: ");
                    input = scanner.next();
                    System.out.println("Decimal: " + Integer.parseInt(input, 8));
                    break;
                case 12:
                    System.out.println("Enter octal number: ");
                    input = scanner.next();
                    System.out.println("Hexadecimal: " + Integer.toHexString(Integer.parseInt(input, 8)).toUpperCase());
                    break;
                case 13:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 13);
        scanner.close();
    }
}
```