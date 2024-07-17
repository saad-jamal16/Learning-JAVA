import java.util.*;
public class astrik{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, n;
        System.out.print("input number of rows: ");
        n = sc.nextInt();
        //upper part

        for (i = 1; i <= n; i++) {
            //space
            for (j = 1; j <= n - 1; j++)
                System.out.print("   ");

           //asterik
            for (j = 1; j <= 2 * i - 1; j++)
                System.out.print("* ");

                System.out.println();
        }
        //lower part

        for (i = n - 1; i >= 1; i--) {
            //spaces
            for (j = 1; j <=  n - 1; j++)
                System.out.print("   ");

            //asteriks

            for(j=1; j <= 2 * i-1; j++)
                System.out.print("* ");

            System.out.println();

            }
        }
    }