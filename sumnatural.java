import java.util.*;
public class sumnatural {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int sum=0, i,n;
        System.out.println("Input number: ");
        n = sc.nextInt();

        for(i = 1; i<=n; i++){
            System.out.print(i+"\n");
            sum+=i;
        }
        System.out.print("the sum of natural number upto n terms: "+sum);


    }
}