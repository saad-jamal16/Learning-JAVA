import java.util.*;
public class rightangletriangle {

    public static void main(String[] args){
        Scanner sc =  new Scanner (System.in);
        System.out.print("The patter like: ");
        int n = sc.nextInt();

        int i,j,k=1;

        for(i = 1; i<=n; i++){
            for(j = 1; j<=i; j++)
                System.out.print(k++);
                System.out.println();


        }
    }

}
