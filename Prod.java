import java.util.*;

public class Prod {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("input first number: ");
        int num1 = sc.nextInt();

        System.out.println("input the second number: ");
        int num2 = sc.nextInt();

        int product = num1 * num2;
        System.out.print("product is: "+ product);
    }

}
