import java.util.*;

public class copy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, n;
        System.out.print("Input number of rows: ");
        n = sc.nextInt();

        // Upper part of the diamond
        for (i = 1; i <= n; i++) {
            // spaces
            for (j = 1; j <= n - i; j++)
                System.out.print("  ");

            // asterisks
            for (j = 1; j <= 2 * i - 1; j++)
                System.out.print("* ");

            System.out.println();
        }

        // Lower part of the diamond
        for (i = n - 1; i >= 1; i--) {
            // spaces
            for (j = 1; j <= n - i; j++)
                System.out.print("  ");

            // asterisks
            for (j = 1; j <= 2 * i - 1; j++)
                System.out.print("* ");

            System.out.println();
        }
    }
}
