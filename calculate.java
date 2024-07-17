import java.util.*;
public class calculate{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Input 1st integer: ");
        int firstInt = sc.nextInt();

        System.out.println("Input 2nd integer: ");
        int secondInt = sc.nextInt();

        int sum = firstInt + secondInt;
        int difference =  firstInt - secondInt;
        int product =  firstInt * secondInt;
        int average =  firstInt * secondInt /2;
        int distance = Math.abs(firstInt - secondInt);
        int max = Math.max(firstInt,secondInt);
        int min = Math.min(firstInt,secondInt);

        //// printing the values:
        System.out.println("sum of two integer: "+ sum);
        System.out.print("difference between two integer: "+difference);
        System.out.println("product of two integer: "+ product);
        System.out.println("average of two number : "+ average);
        System.out.println("distance of two integer: "+distance);
        System.out.println("max integer: "+max);
        System.out.println("min integer: "+min);
        sc.close();
    }
}
