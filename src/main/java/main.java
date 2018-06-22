import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        printHelloName();

    }
    static void printHelloName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter your name: ");
        String input = scanner.next();
        String output = Character.toUpperCase(input.charAt(0)) + input.substring(1);
        System.out.println("Hello, " + output);
    }
}
