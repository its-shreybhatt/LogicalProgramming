import java.util.Scanner;

public class VendingMachine {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount -");
        int value = input.nextInt();
        int count = 0;
        while (value >= 1) {
            count += 1;
            if (value - 1000 >= 0) {
                System.out.print("1000" + " ");
                value = value - 1000;
            } else if (value - 500 >= 0) {
                System.out.print("500" + " ");
                value = value - 500;
            } else if (value - 100 >= 0) {
                System.out.print("100" + " ");
                value = value - 100;
            } else if (value - 50 >= 0) {
                System.out.print("50" + " ");
                value = value - 50;
            } else if (value - 10 >= 0) {
                System.out.print("10" + " ");
                value = value - 10;
            } else if (value - 5 >= 0) {
                System.out.print("5" + " ");
                value = value - 5;
            } else if (value - 2 >= 0) {
                System.out.print("2" + " ");
                value = value - 2;
            } else {
                System.out.print("1");
                value -= 1;
            }
        }
        System.out.println(" " + " total notes = " + count);
    }
}