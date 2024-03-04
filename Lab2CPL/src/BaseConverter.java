import java.util.Scanner;


public class BaseConverter {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int number1;
        int number2;
        System.out.println("Enter the number you want to convert:");
        number1 = keyboard.nextInt();
        System.out.println("Enter the base you want to convert it to (between 2 and 16):");
        number2 = keyboard.nextInt();

        if (number2 < 2 || number2 > 16) {
            System.out.println("Base should be between 2 and 16.");
        } else {
            String convertedNumber = convertBase(number1, number2);
            System.out.println("Converted number: " + convertedNumber);
        }
    }

    public static String convertBase(int number1, int number2) {
        return Integer.toString(number1, number2);
    }
}
