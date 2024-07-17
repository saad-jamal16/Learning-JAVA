import java.util.*;
public class odd{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        int n,i,sum=0;
        System.out.println("Input number of terms: ");
        n = sc.nextInt();

        for(i=10; i <= n; i++ ){
            System.out.println(2*i-1);
            sum+= 2*i-1;
        }
        System.out.println("The sum of odd natural number upto"+n +"term is :"+sum);
    }

}
