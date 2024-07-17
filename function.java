import java.util.*;
public class function{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("enter both a and b");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = calculateSum(a, b);
            System.out.print(sum);
        }
        //method
        public static int calculateSum(int a,int b) {
            int sum = a + b;
            return sum;

            }
    }


