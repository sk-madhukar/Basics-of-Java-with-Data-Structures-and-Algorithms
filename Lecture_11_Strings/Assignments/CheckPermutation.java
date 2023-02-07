// Check Permutation

// For a given two strings, 'str1' and 'str2', check whether they are a permutation of each other or not.
// Permutations of each other
// Two strings are said to be a permutation of each other when either of the string's characters can be rearranged so that it becomes identical to the other one.

// Example: 
// str1= "sinrtg" 
// str2 = "string"

// The character of the first string(str1) can be rearranged to form str2 and hence we can say that the given strings are a permutation of each other.
// Input Format:
// The first line of input contains a string without any leading and trailing spaces, representing the first string 'str1'.

// The second line of input contains a string without any leading and trailing spaces, representing the second string 'str2'.
// Note:
// All the characters in the input strings would be in lower case.
// Output Format:
// The only line of output prints either 'true' or 'false', denoting whether the two strings are a permutation of each other or not.

// You are not required to print anything. It has already been taken care of. Just implement the function. 
// Constraints:
// 0 <= N <= 10^6
// Where N is the length of the input string.

// Time Limit: 1 second
// Sample Input 1:
// abcde
// baedc
// Sample Output 1:
// true
// Sample Input 2:
// abc
// cbd
// Sample Output 2:
// false

package Lecture_11_Strings.Assignments;

import java.util.Scanner;

public class CheckPermutation {
    public static boolean isPermutation(String str1, String str2) {
		//Your code goes here
        int[] frequencyArray = new int[256];

        //traversing through str1 to set the values in frequency array, increasing each chars value by one
        for(int i=0; i<str1.length(); i++){
            char ch = str1.charAt(i);
            frequencyArray[ch]++;
        }
        //traversing through str2, and decreasing the encountered value by one each time
        for(int i=0; i<str2.length(); i++){
            char ch = str2.charAt(i);
            frequencyArray[ch]--;
        }

        //now we are checking that each value of frequency array is zero or not
        for(int i=0; i<256; i++){
            if(frequencyArray[i] != 0){
                return false;
            }
        }
        return true;
	}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str1 = in.nextLine();
        String str2 = in.nextLine();
        boolean ans = isPermutation(str1, str2);
        System.out.println(ans);

        in.close();
    }
}
