import java.util.*;
public class sumdigitfun7 {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("input the integer: ");
        int digits = sc.nextInt();
        System.out.println("the sum of digits are: "+sumDigit(digits));
    }
    public static  int sumDigit(long n){
        int sum = 0;
        while(n>0){
            sum += n%10;
            n /=10;
        }
        return sum;
    }
}
