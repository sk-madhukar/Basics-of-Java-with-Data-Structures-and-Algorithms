// Code : Mirror Image Number Pattern

// Print the following pattern for the given N number of rows.
// Pattern for N = 4

// The dots represent spaces.

// Input format :
// Integer N (Total no. of rows)

// Output format :
// Pattern in N lines

// Constraints
// 0 <= N <= 50

// Sample Input 1:
// 3
// Sample Output 1:
//       1 
//     12
//   123
// Sample Input 2:
// 4
// Sample Output 2:
//       1 
//     12
//   123
// 1234

package Lecture_6_Patterns_2;

import java.util.Scanner;

public class MirrorImageNumberPattern_method_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int i = 1;
        while (i <= n) {
            int count = 1;
            int j = 1;
            while (j <= n) {
                if(j <= n-i){
                    System.out.print(" ");
                }else{
                    System.out.print(count);
                    count++;
                }
                j++;
            }
            System.out.println();
            i++;
        }

        in.close();
    }
}
