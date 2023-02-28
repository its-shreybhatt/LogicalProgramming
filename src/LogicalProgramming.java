import java.util.Scanner;

public class LogicalProgramming {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        LogicalProgramming logicalProgramming=new LogicalProgramming();
        logicalProgramming.fibonacciSeries();
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
}