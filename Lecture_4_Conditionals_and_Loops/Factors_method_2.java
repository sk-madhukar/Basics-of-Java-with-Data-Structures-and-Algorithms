package Lecture_4_Conditionals_and_Loops;

import java.util.Scanner;

public class Factors_method_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int i = 2;
        while(i <= (n/2)){
            if(n%i==0){
                System.out.println(i+" ");
            }
            i++;
        }

        in.close();
    }
}

//Since all divisors for any number can be found in the range 1 to num/2.
//We need to iterate between [ 1, number/2 ].
// Time Complexity : O(n) 
// Auxiliary Space : O(1)
// This method is better than previous method, even though the time complexity is the same
// it runs half lesser loop than previous method
// ran for loop num times, however, this runs num/2 times