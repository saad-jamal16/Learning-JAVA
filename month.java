import java.util.*;
public class month{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num_of_days = 0;
        String monthName = "unknown";
        System.out.println("Input month number: ");
        int month = sc.nextInt();

        System.out.println("input a year: ");
        int year = sc.nextInt();

        switch(month) {
            case 1:
                monthName = "January";
                num_of_days = 31;
                break;
            case 2:
                monthName = "february";
                if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0)) {
                    num_of_days = 28;
                    break;
                }
            case 3:
                monthName = "march";
                num_of_days = 30;
                break;
            case 4:
                monthName = "april";
                num_of_days = 31;
                break;

            case 5:
                monthName = "may";
                num_of_days = 31;
                break;
            case 6:
                monthName = "june";
                num_of_days = 31;
                break;
            case 7:
                monthName = "july";
                num_of_days = 31;
                break;
            case 8:
                monthName = "august";
                num_of_days = 31;
                break;
            case 9:
                monthName = "september";
                num_of_days = 30;
                break;
            case 10:
                monthName = "october";
                num_of_days = 31;
                break;
            case 11:
                monthName = "november";
                num_of_days = 30;
                break;
            case 12:
                monthName = "december";
                num_of_days = 31;
                System.out.println(monthName + " " + year + "has" + num_of_days + "days");
        }

    }

}





