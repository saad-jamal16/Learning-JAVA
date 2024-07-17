import java.util.*;
public class fun2mul {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number to multiply: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print("product of two number is: "+calcProduct(a,b));
    }
    public static int calcProduct(int a,int b){
        return a * b;
    }
}
