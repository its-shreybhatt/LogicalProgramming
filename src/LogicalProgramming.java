import java.util.Scanner;

public class LogicalProgramming {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        LogicalProgramming logicalProgramming=new LogicalProgramming();
        logicalProgramming.fibonacciSeries();
        logicalProgramming.perfectNumber();

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

}