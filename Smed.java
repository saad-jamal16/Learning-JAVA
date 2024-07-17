import java.util.Scanner;

public class Smed {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("input the first number: ");
        int num1 = sc.nextInt();

        System.out.println("input second number: ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        int mul = num1 * num2;
        int sub = num1 - num2;
        int div = num1/num2;



        System.out.println("sum of number is: "+sum);
        System.out.println("multiplication of number is: "+mul);
        System.out.println("subtraction of number is: "+sub);
        System.out.println("division of number is : "+div);
    }
}
