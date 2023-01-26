// Check the output for finding the divisors of 100: 1, 2, 3, 4, 5, 10, 20, 25, 50

// All divisors come in pairs (1, 100), (2, 50), (4, 25), (5, 20), (10, 10)
// If you multiple any pair the result will be 100 e.g. : 2 * 50 = 100 or 4 * 25 = 100
// If the first pair is ‘i’ then we can find the other pair by doing num/i

//Although, this method will give error or wrong answer in Coding Ninja's Compliler as the
//output will not be in the ascending order.
//You will have to short the output after the while loop in order to get the required result.

package Lecture_4_Conditionals_and_Loops;

import java.util.Scanner;

public class Factors_method_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int i = 2;
        while(i<=Math.sqrt(n)){
            if (n % i == 0){
                // If both pair of factors are equal then we just print
                // once, example for 100 : (a, b) : (10, 10)
                // 10 should be printed just once
                if(i == n/i){
                    System.out.print(i + " ");
                }
                // else print both the pairs
                else{
                    System.out.print(i + " " + n/i + " ");
                }
            }
            i++;
        }
        in.close();
    }
}

// Time Complexity : O(sqrt(N))
// Space Complexity : O(1)