import java.util.*;

public class averagefun3 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter number a:");
        double a = sc.nextDouble();
        System.out.println("enter number b: ");
        double b = sc.nextDouble();
        System.out.print("enter number c: ");
        double c = sc.nextDouble();
        System.out.println("the average of three number is: "+avg(a,b,c));
    }
    public static double avg(double a,double b,double c){
        return (a+b+c)/3;
    }
}
