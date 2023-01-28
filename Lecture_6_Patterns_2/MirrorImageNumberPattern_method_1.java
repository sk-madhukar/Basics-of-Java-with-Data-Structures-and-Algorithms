package Lecture_6_Patterns_2;

import java.util.Scanner;

public class MirrorImageNumberPattern_method_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int currentRow = 1;
        while (currentRow <= n) {
            int spaces = 1;
            while (spaces <= n-currentRow) {
                System.out.print(" ");
                spaces++;
            }
            int currentColumn = 1;
            while (currentColumn <= currentRow) {
                System.out.print(currentColumn);
                currentColumn++;
            }
            System.out.println();
            currentRow++;
        }

        in.close();
    }
}
