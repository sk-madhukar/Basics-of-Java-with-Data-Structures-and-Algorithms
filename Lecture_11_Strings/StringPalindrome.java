package Lecture_11_Strings;

import java.util.Scanner;

public class StringPalindrome {
    public static boolean isPalindrome(String str) {
		//Your code goes here
        int i = 0;
        int j = str.length()-1;
        while (i <= j) {
            if(str.charAt(i)==str.charAt(j)){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;
	}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();
        System.out.println(isPalindrome(str));

        in.close();
    }
}
