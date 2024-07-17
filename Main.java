import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first value: ");
        int a = sc.nextInt();

        System.out.print("Enter the second value: ");
        int b = sc.nextInt();

        int mul = (a * b);
        System.out.println("The product is: " + mul);

        sc.close();
    }
}
