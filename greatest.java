import java.util.*;
public class greatest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("input first number: ");
        int num1 = sc.nextInt();
        System.out.println("Input second number: ");
        int num2 = sc.nextInt();
        System.out.println("Input third number: ");
        int num3 = sc.nextInt();

        if (num1 > num2)
            if (num1 > num3)
                System.out.println("The greatest number is : " + num1);
        if (num2 > num1)
            if (num2 > num3)
                System.out.println("The greatest number is : " + num2);
        if (num3 > num1)
            if (num3 > num2)
                System.out.println("The greatest number is: " + num3);
    }
}