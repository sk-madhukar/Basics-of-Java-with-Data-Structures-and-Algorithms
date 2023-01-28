package Lecture_6_Patterns_2;

import java.util.Scanner;

public class StarPattern_method_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int currentRow = 1;
        while (currentRow <= n) {
            //printing spaces
            int spaces = 1;
            while (spaces <= n-currentRow) {
                System.out.print(" ");
                spaces++;
            }
            //printing pattern
            int firstHalfPattern = 1;
            while (firstHalfPattern <= currentRow) {
                System.out.print("*");
                firstHalfPattern++;
            }
            int secondHalfPattern = 1;
            while (secondHalfPattern <= currentRow-1) {
                System.out.print("*");
                secondHalfPattern++;
            }
            System.out.println();
            currentRow++;
        }

        in.close();
    }
}
