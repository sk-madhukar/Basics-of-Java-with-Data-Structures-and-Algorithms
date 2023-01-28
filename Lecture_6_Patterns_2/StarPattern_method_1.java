// Code : Star Pattern

// Print the following pattern
// Pattern for N = 4

// The dots represent spaces.

// Input Format :
// N (Total no. of rows)

// Output Format :
// Pattern in N lines

// Constraints :
// 0 <= N <= 50

// Sample Input 1 :
// 3
// Sample Output 1 :
//    *
//   *** 
//  *****
// Sample Input 2 :
// 4
// Sample Output 2 :
//     *
//    *** 
//   *****
//  *******

package Lecture_6_Patterns_2;

import java.util.Scanner;

public class StarPattern_method_1 {
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
            int pattern = (2*currentRow)-1;
            while (currentColumn <= pattern) {
                System.out.print("*");
                currentColumn++;
            }
            System.out.println();
            currentRow++;
        }

        in.close();
    }
}
