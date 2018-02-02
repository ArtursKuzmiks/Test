import java.util.Scanner;

public class konkurs111reb779 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year, month, day, x;
        int[] a = {31,28,31,30,31,30,31,31,30,31,30,31};
        System.out.println("Arturs Kuzmiks 12.gr. 111reb779");

        System.out.print("Enter year ");
        if (sc.hasNextInt())
            year = sc.nextInt();
        else {
            System.out.println("input-output error");
            sc.close();
            return;
        }
        System.out.print("Enter month ");
        if (sc.hasNextInt())
            month = sc.nextInt();
        else {
            System.out.println("input-output error");
            sc.close();
            return;
        }
        System.out.print("Enter day ");
        if (sc.hasNextInt())
            day = sc.nextInt();
        else {
            System.out.println("input-output error");
            sc.close();
            return;
        }
        sc.close();
        if (year < 1900 || year > 2100) {
            System.out.println("Enter year from 1900.3.1 to 2100.1.1");
            return;
        }
        if (month <= 0 || month > 12) {
            System.out.println("Enter months number from 1 to 12");
            return;
        }
        if (month<3 && year<=1900) {
            System.out.println("Enter from 1900.3.1");
            return;}
        if (month == 1 && (day <= 0 || day > 31)) {
            System.out.println("Such a date does not exist");
            return;
        }
        if (((month == 2 && (year - 1900) % 4 == 0) && day <= 0)
                || ((month == 2 && (year - 1900) % 4 == 0) && day > 28)) {
            System.out.println("Such a date does not exist");
            return;
        }
        if (((month == 2 && (year - 1900) % 4 != 0) && day <= 0)
                || ((month == 2 && (year - 1900) % 4 != 0) && day > 29)) {
            System.out.println("Such a date does not exist");
            return;
        }
        if (month == 3 && (day <= 0 || day > 31)) {
            System.out.println("Such a date does not exist");
            return;
        }
        if (month == 4 && (day <= 0 || day > 30)) {
            System.out.println("Such a date does not exist");
            return;
        }
        if (month == 5 && (day <= 0 || day > 31)) {
            System.out.println("Such a date does not exist");
            return;
        }
        if (month == 6 && (day <= 0 || day > 30)) {
            System.out.println("Such a date does not exist");
            return;
        }
        if (month == 7 && (day <= 0 || day > 31)) {
            System.out.println("Such a date does not exist");
            return;
        }
        if (month == 8 && (day <= 0 || day > 31)) {
            System.out.println("Such a date does not exist");
            return;
        }
        if (month == 9 && (day <= 0 || day > 30)) {
            System.out.println("Such a date does not exist");
            return;
        }
        if (month == 10 && (day <= 0 || day > 31)) {
            System.out.println("Such a date does not exist");
            return;
        }
        if (month == 11 && (day <= 0 || day > 30)) {
            System.out.println("Such a date does not exist");
            return;
        }
        if (month == 12 && (day <= 0 || day > 31)) {
            System.out.println("Such a date does not exist");
            return;
        }
        x = (year - 1900);
        x = (x * 365) + (x / 4);
        if ((month == 1 || month == 2) && ((year - 1900) % 4) == 0)
            x = x - 1;
        if (month==1)
            x=x+day;
        else {
            for (int i=0;i<month-1;i++)
                x=x+a[i];
            x=x+day;}
        if (x % 7 == 0)
            System.out.println("Sunday");
        if (x % 7 == 1)
            System.out.println("Monday");
        if (x % 7 == 2)
            System.out.println("Tuesday");
        if (x % 7 == 3)
            System.out.println("Wednesday");
        if (x % 7 == 4)
            System.out.println("Thursday");
        if (x % 7 == 5)
            System.out.println("Friday");
        if (x % 7 == 6)
            System.out.println("Saturday");
    }
}
