import java.util.*;
public class atdressof {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Input the number: ");
        int n = sc.nextInt();

        int i,j;

        for(i= 1; i<=n; i++){
            //space
            for(j=n-i; j>0; j--){
                System.out.print(" ");
            }
            for(j = 0; j<=i; j++){
                System.out.print("@");
            }
            System.out.println();
        }

    }
}
