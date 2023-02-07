// All Prime Numbers

// Given an integer N, print all the prime numbers that lie in the range 2 to N (both inclusive).
// Print the prime numbers in different lines.

// Input Format :
// Integer N

// Output Format :
// Prime numbers in different lines

// Constraints :
// 1 <= N <= 100

// Sample Input 1:
// 9
// Sample Output 1:
// 2
// 3
// 5
// 7
// Sample Input 2:
// 20
// Sample Output 2:
// 2
// 3
// 5
// 7
// 11
// 13
// 17
// 19

package Lecture_7_Operators_and_For_Loop;

import java.util.Scanner;

public class AllPrimeNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        for(int numberToCheck = 2; numberToCheck <=n; numberToCheck++){
            boolean flag = true;
            int div = 2;
            while (div < numberToCheck) {
                if(numberToCheck%div==0){
                    flag = false;
                    break;
                }
                div++;
            }
            if(flag == true){
                System.out.println(numberToCheck);
            }
        }

        in.close();
    }
}
