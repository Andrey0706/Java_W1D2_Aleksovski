package A7;

import java.util.Scanner;

public class A7 {
    public static void main(String[] args) {
        System.out.println("Please enter 3 numbers");
        Scanner in = new Scanner(System.in);
        int first = in.nextInt();
        Scanner inp = new Scanner(System.in);
        int second = inp.nextInt();
        Scanner in2 = new Scanner(System.in);
        int third = in2.nextInt();

        System.out.println("The average value is: " + (first + second + third)/3);
    }
}
