import java.util.*;
public class Start{
    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.print("Enter the year: ");
        int year = sc.nextInt();
        boolean x = (year%4) == 0;
        boolean y = (year%100) !=0;
        boolean z = ((year%100==0) && (year%400==0));
        if(x && (y||z)) {
            System.out.println(year+" is a leap year");
            System.out.println();
        }
        else {
            System.out.println(year+" is not a leap year");
            System.out.println();
        }
        sc.close();
    }
}