import java.util.Scanner;

public class exer20 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rows,count=1,i,j;
        System.out.print("input the number of rows: ");
        rows= sc.nextInt();

        for(i=1; i<=rows; i++){
            for(j=1; j<=i; j++){
                System.out.print(count+"     ");
                count++;
            }
            System.out.println();


        }
    }
}
