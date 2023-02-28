import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {

        int[] ans = new int[20];
        int i = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number - ");
        int a = input.nextInt();

        while (a != 0) {
            ans[i] = a % 2;
            a = a / 2;
            i++;
        }
        System.out.println("Binary no. is ");
        for (int j = i; j > 0; j--) {
            System.out.print(ans[j]);
        }
        System.out.println("\n Swapped Binary no. is ");
        for (int j = i / 2; j > 0; j--) {
            System.out.print(ans[j]);
        }
        for (int j = i; j > i / 2; j--) {
            System.out.print(ans[j]);
        }
        System.out.println(" ");

//        double newDecimal = 0;
//        for (int j = 0; j < i; j++) {
//            System.out.println(ans[j]);
//            newDecimal = newDecimal + Math.pow(2, j) * ans[j];
//        }
//        System.out.print("New number obtained is = " + newDecimal / 2);
    }
}