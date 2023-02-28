import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;

public class LogicalProgramming {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        LogicalProgramming logicalProgramming = new LogicalProgramming();

//        logicalProgramming.fibonacciSeries();
//        logicalProgramming.perfectNumber();
//        logicalProgramming.primeNumber();
//        logicalProgramming.reverseNumber();
//        logicalProgramming.couponNumber();
        logicalProgramming.stopwatch();
    }

    void fibonacciSeries() {
        int number = 0;
        System.out.println("Please enter Number -");
        int num = input.nextInt();
        for (int i = 1; i <= num; i++) {
            number = number + i;
            System.out.print(number + " ");
        }
    }

    void perfectNumber() {
        System.out.println("Enter the number -");
        int numb = input.nextInt();
        int a = 1;
        int sum = 0;
        for (int i = 1; i < numb; i++) {
            if (numb % a == 0) {
                System.out.print(a + " ");
                sum = sum + a;
                a = a + 1;
            } else a = a + 1;
        }
        System.out.println(" ");
        if (sum == numb) {
            System.out.println(numb + " is a perfect number ");
        } else System.out.print(numb + " is not a perfect number");
    }

    void primeNumber() {
        System.out.println("Enter the number -");
        int numb = input.nextInt();
        int a = 3;
        if (numb == 0 || numb == 1) {
            System.out.println("Number is not prime");
        } else {
            if (numb > a) {
                for (int i = 2; i < numb; i++) {
                    if (numb % i == 0) {
                        System.out.println("Number is not prime");
                        return;
                    }
                }
            }
            System.out.println("Number is prime ");
        }
    }

    void reverseNumber() {
        System.out.println("Enter the number -");
        int numb = input.nextInt();
        int reverse = 0;
        for (int i = 1; i <= numb; i++) {
            int reminder = numb % 10;
            reverse = reverse * 10 + reminder;
            numb = numb / 10;
        }
        System.out.println(reverse);
    }

    void couponNumber() {

        // asked user for number of coupon then enter distinct coupon no.and store in an array
        // traverse the array till all coupon number are obtained by random and print the count

        System.out.println("Enter no. of Coupon -");
        int numb = input.nextInt();
        System.out.println("Enter different Coupons -");
        int[] array = new int[numb];
        int count = 0;
        for (int i = 0; i < numb; i++) {
            array[i] = input.nextInt();
        }
        int matchCount = 0;
        Random random = new Random();
        System.out.print(" Random values are - ");
        while (matchCount < numb) {
            count += 1;
            int randomCoupon = random.nextInt(10);
            for (int j = 0; j < numb; j++) {
                if (array[j] == randomCoupon) {
                    System.out.print(randomCoupon + " ");
                    matchCount += 1;
                    array[j] = -1;
                }
            }
        }
        System.out.println(" " + "No. of times random values generated are = " + count);
    }

    void stopwatch() {
        long start, end;
        double time;

        System.out.println("Enter s to start-");
        char s = input.next().charAt(0);
        start = System.currentTimeMillis();

        LocalTime startobj = LocalTime.now();
        System.out.println("Start time =" + startobj);

        System.out.println("Enter p to stop -");
        String endd = input.next();
        end = System.currentTimeMillis();

        LocalTime endobj = LocalTime.now();
        System.out.println("Stop time =" + endobj);

        time = (end - start) / 1000.0;
        System.out.println("Duration = " +time);
    }
}