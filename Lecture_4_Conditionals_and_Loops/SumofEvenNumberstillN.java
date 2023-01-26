// Sum of Even Numbers till N

// Given a number N, print sum of all even numbers from 1 to N.
// Input Format :
// Integer N

// Output Format :
// Required Sum 

// Sample Input 1 :
//  6
// Sample Output 1 :
// 12

package Lecture_4_Conditionals_and_Loops;

import java.util.Scanner;

public class SumofEvenNumberstillN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int sum = 0;
        int i = 2;
        while(i <= n){
            if(i%2 == 0){
                sum += i;
            }
            i++;
        }
        System.out.println(sum);

        in.close();
    }
}
