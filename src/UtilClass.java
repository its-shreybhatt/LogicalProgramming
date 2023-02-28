import java.util.Scanner;

public class UtilClass {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        dayOfWeek();
        temperatureConversion();
        monthlyPayment();
        sqrt();
        toBinary();
    }

    static void dayOfWeek() {

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

        switch (newd) {
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

    static void temperatureConversion() {
        System.out.println("Enter the temperature -");
        int temp = input.nextInt();
        System.out.println("Enter the conversion -");
        System.out.println("Press 1: for Celsius to Fahrenheit // 2 for Fahrenheit to Celsius -");
        int value = input.nextInt();
        switch (value) {
            case 1:
                double fahrenheit = (temp * 9 / 5) + 32;
                System.out.println(fahrenheit + " F");
                break;
            case 2:
                double celsius = (temp - 32) * 5 / 9;
                System.out.println(celsius + " C");
                break;
        }
    }

    static void monthlyPayment() {
        System.out.println("Enter number of Years -");
        int Y = input.nextInt();
        System.out.println("Enter the Amount -");
        int P = input.nextInt();
        System.out.println("Enter the rate -");
        double R = input.nextInt();
        double n = 12 * Y;
        double r = R / (12 * 100);
        double payment = ((P * r) / (1 - Math.pow(1 + r, -n)));
        System.out.println(payment);
    }

    static void sqrt() {
        System.out.println("Enter number -");
        int c = input.nextInt();
        double t = c;
        double epsilon = 1e-15;
        while (Math.abs(t - (c / t)) > epsilon * t) {
            t = ((c / t) + t) / 2;
        }
        System.out.println("Square root = " + t);
    }
    static void toBinary(){
        int[] ans = new int[20] ;
        int i=1;
        System.out.println("Enter the number - ");
        int a = input.nextInt();

        while (a!=0) {
            ans[i] = a % 2;
            a = a / 2;
            i++;
        }
        System.out.println("Binary no. is ");
        for (int j=i;j>0;j--){
            System.out.print(ans[j]);
        }
    }
}