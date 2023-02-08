import java.util.Scanner;
public class programm2 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int year = in.nextInt();    
        in.close(); 

        boolean LeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));

        if (LeapYear)
        {
            System.out.println(year + " is a leap year.");
        } else
            System.out.println(year + " is not a leap year.");
    }
        
}
    

