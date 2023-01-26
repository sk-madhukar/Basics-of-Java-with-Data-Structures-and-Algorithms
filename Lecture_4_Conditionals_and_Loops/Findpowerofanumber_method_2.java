package Lecture_4_Conditionals_and_Loops;

import java.util.Scanner;

public class Findpowerofanumber_method_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt(), n = in.nextInt();
        double product = Math.pow(x, n);
        System.out.println((int)product);

        in.close();
    }
}
