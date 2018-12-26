/*
Sum of Digit is Pallindrome or not:
	Write a program to check if the sum of digits of a given number N is a palindrome number or not.

Input:
	The first line of the input contains T denoting the number of testcases. T testcases follow. Then each of the T lines contains single positive integer N denoting the value of number.	

Output:
	For each testcase, in a new line, output "YES" if pallindrome else "NO". (without the quotes)

Constraints:
	1 <= T <= 200
	1 <= N <= 1000

Example:
Input:
	2
	56
	98
Output:
	YES
	NO
*/

import java.util.Scanner;

class IsSumPalindrome{
	static Scanner sc = new Scanner(System.in);
	public static String palindrome(int input){
        int input_0 = input,sum=0;
        while(input > 0){
            sum += input%10;
            sum*=10;
            input/=10;
        }
        if(sum/10 == input_0) return "YES";
        else return "NO";
    }
    
    public static String sumOfDigits(int input){
        int sum = 0;
        while(input > 0){
            sum += input%10;
            input/=10;
        }
        String palin = palindrome(sum);
        return palin;
    }
    
	public static void main (String[] args) {
		int testCases = sc.nextInt();
		for(int i=0; i<testCases; i++){
		    int input = sc.nextInt();
		    String output = sumOfDigits(input);
		    System.out.println(output);
		}
	}
}