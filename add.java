import java.util.*;
public class add{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("input the integer : ");
        int num = sc.nextInt();

        int firstDigit = num%10;
        int remainingNumber =num/10;
        int secondDigit = num%10;
        remainingNumber = num/10;
        int thirdDigit = num%10;
        remainingNumber= num/10;
        int fourthDigit = remainingNumber % 10;
        int sum = thirdDigit+secondDigit+firstDigit+fourthDigit;
        System.out.println("the sum of all digits in : "+num+ "is"+sum);

    }
}
