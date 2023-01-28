// Code : Diamond of stars

// Print the following pattern for the given number of rows.
// Note: N is always odd.

// Pattern for N = 5

// The dots represent spaces.

// Input format :
// N (Total no. of rows and can only be odd)

// Output format :
// Pattern in N lines

// Constraints :
// 1 <= N <= 49

// Sample Input 1:
// 5
// Sample Output 1:
//   *
//  ***
// *****
//  ***
//   *
// Sample Input 2:
// 3
// Sample Output 2:
//   *
//  ***
//   *

package Lecture_6_Patterns_2;

import java.util.Scanner;

public class Diamondofstars {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(), n1 = (n + 1) / 2, n2 = n1 - 1;
        int i = 1;
        // dealing with first half
        while (i <= n1) {
            // printing space
            int spaces = 1;
            while (spaces <= n1 - i) {
                System.out.print(" ");
                spaces++;
            }
            int pattern = 1;
            while (pattern <= (2 * i) - 1) {
                System.out.print("*");
                pattern++;
            }
            System.out.println();

            i++;
        }

        // dealing with second half
        // printing spaces
        int j = n2;
        while (j >= 1) {
            int spaces2 = 1;
            while (spaces2 <= (n2 - j + 1)) {
                System.out.print(" ");
                spaces2++;
            }
            // printing pattern
            int pattern2 = (2 * j) - 1;
            while (pattern2 >= 1) {
                System.out.print("*");
                pattern2--;
            }
            j--;
            System.out.println();
        }

        in.close();
    }
}
