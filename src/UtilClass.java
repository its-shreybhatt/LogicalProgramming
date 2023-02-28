import java.util.Scanner;

public class UtilClass {
    public static void main(String[] args) {
        dayOfWeek();
    }
    static void dayOfWeek() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter date -");
        int d = input.nextInt();
        System.out.println("Enter month -");
        int m = input.nextInt();
        System.out.println("Enter year -");
        int y = input.nextInt();
        double newy = y - (14 - m) / 12;
        double x = newy + newy / 4 - newy / 100 + newy / 400;
        double newm = m + 12 * ((14 - m) / 12) - 2;
        int newd = (int) (d + x + 31 * newm / 12) % 7;

        switch (newd){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
        }
    }
}
