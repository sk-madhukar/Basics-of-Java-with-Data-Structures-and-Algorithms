// Code : Triangle of Numbers

// Print the following pattern for the given number of rows.
// Pattern for N = 4

// The dots represent spaces.

// Input format :
// Integer N (Total no. of rows)

// Output format :
// Pattern in N lines

// Constraints :
// 0 <= N <= 50

// Sample Input 1:
// 5
// Sample Output 1:
//           1
//          232
//         34543
//        4567654
//       567898765
// Sample Input 2:
// 4
// Sample Output 2:
//            1
//           232
//          34543
//         4567654
package Lecture_6_Patterns_2;

import java.util.Scanner;

public class TriangleofNumbers_method_1 {
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
            //printing first half
            int firstHalf = currentRow;
            while (firstHalf <= (2*currentRow)-1) {
                System.out.print(firstHalf);
                firstHalf++;
            }
            //printing second half
            int secondHalf = (2*currentRow)-2;
            while (secondHalf >= currentRow) {
                System.out.print(secondHalf);
                secondHalf--;
            }
            System.out.println();
            currentRow++;
        }

        in.close();
    }
}
