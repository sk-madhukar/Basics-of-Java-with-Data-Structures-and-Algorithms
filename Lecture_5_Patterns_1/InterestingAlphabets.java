// Code : Interesting Alphabets

// Print the following pattern for the given number of rows.

// Pattern for N = 5
// E
// DE
// CDE
// BCDE
// ABCDE

// Input format :
// N (Total no. of rows)

// Output format :
// Pattern in N lines

// Constraints
// 0 <= N <= 26

// Sample Input 1:
// 8
// Sample Output 1:
// H
// GH
// FGH
// EFGH
// DEFGH
// CDEFGH
// BCDEFGH
// ABCDEFGH
// Sample Input 2:
// 7
// Sample Output 2:
// G
// FG
// EFG
// DEFG
// CDEFG
// BCDEFG
// ABCDEFG

package Lecture_5_Patterns_1;

import java.util.Scanner;

public class InterestingAlphabets {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        char toPrint = (char)('A'+n);
        int i = 1;
        while(i <= n){
            toPrint = (char)(toPrint-i);
            int j = 1;
            while (j <= i) {
                System.out.print(toPrint);
                toPrint++;
                j++;
            }
            System.out.println();
            i++;
        }

        in.close();
    }
}
