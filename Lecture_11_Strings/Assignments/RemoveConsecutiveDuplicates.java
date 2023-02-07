// Remove Consecutive Duplicates

// For a given string(str), remove all the consecutive duplicate characters.
// Example:
// Input String: "aaaa"
// Expected Output: "a"

// Input String: "aabbbcc"
// Expected Output: "abc"
//  Input Format:
// The first and only line of input contains a string without any leading and trailing spaces. All the characters in the string would be in lower case.
// Output Format:
// The only line of output prints the updated string.
// Note:
// You are not required to print anything. It has already been taken care of.
// Constraints:
// 0 <= N <= 10^6
// Where N is the length of the input string.

// Time Limit: 1 second
// Sample Input 1:
// aabccbaa
// Sample Output 1:
// abcba
// Sample Input 2:
// xxyyzxx
// Sample Output 2:
// xyzx

package Lecture_11_Strings.Assignments;

import java.util.Scanner;

public class RemoveConsecutiveDuplicates {
    public static String removeConsecutiveDuplicates(String str) {
		//Your code goes here
        if(str.length() == 1){
            return str;
        }
        String ans = "";
        int i = 0, j = 0;
        while (j < str.length()) {
            if(str.charAt(i)==str.charAt(j)){
                j++;
            }else{
                ans += str.charAt(i);
                i = j;
            }
        }
        //handling the last consecutive duplicates
        ans+=str.charAt(i);
        return ans;
	}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();
        String ans = removeConsecutiveDuplicates(str);
        System.out.println(ans);

        in.close();
    }
}
