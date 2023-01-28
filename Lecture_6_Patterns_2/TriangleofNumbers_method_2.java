package Lecture_6_Patterns_2;

import java.util.Scanner;

public class TriangleofNumbers_method_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int i = 1;
        while (i <= n) {
            
            int j = 1;
            while( j <= n-i){
                System.out.print(" ");   
                j++;
            }

            j = 1;
            int k = i;
            while(j<=i){
                System.out.print(k);
                k++;
                j++;
            }

            k=k-2;
            int l = 1 ;
            while(l<=i-1){
                System.out.print(k);
                k--;
                l++;
            }

            System.out.println();
            i++;
        }

        in.close();
    }
}
