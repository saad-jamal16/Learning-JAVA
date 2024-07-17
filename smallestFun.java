import java.util.*;
public class smallestFun {
    public static void main(String []args){
        Scanner sc = new Scanner (System.in);
        System.out.print("input the first number: ");
        double x = sc.nextDouble();
        System.out.print("input the second number: ");
        double y = sc.nextDouble();
        System.out.print("input the third number: ");
        double z = sc.nextDouble();
        System.out.print("The smallest number is: "+ smallestNum(x,y,z));
    }
    public static  double smallestNum(double x,double y,double z ){
          return Math.min(Math.min(x,y),z);
    }
}
