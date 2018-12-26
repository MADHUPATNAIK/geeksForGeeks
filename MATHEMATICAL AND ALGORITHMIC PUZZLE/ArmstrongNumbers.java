/*
Armstrong Numbers:
	For a given 3 digit number, find whether it is armstrong number or not. An Armstrong number of three digits is an integer such that the sum of the cubes of its digits is equal to the number itself. For example, 371 is an Armstrong number since 33 + 73 + 13 = 371

Input:
	First line contains an integer, the number of test cases 'T'.
	T testcases follow. Each test case contains a positive integer N.

Output:
	For each testcase, in a new line, print "Yes" if it is a armstrong number else print "No".

Constraints:
	1 <= T <= 31
	100 <= N < 1000

Example:
Input:
	1
	371
Output:
	Yes
*/

import java.util.Scanner;

class ArmstrongNumbers{
	Scanner sc = new Scanner(System.in);
	
	public static int armstrongNumber(int input){
		int sum = 0;
		int input_0 = input;
		while(input > 0){
			sum += (Math.pow((input%10),3));
			input = input/10;
		}
		if (sum == input_0) return 1;
		else return 0;
	}
	public static void main(String args[]){
		int testCases = sc.nextInt();
	    for(int i=0; i<testCases; i++){
    		int input = sc.nextInt();
    		int result = armstrongNumber(input);
    		if(result == 0) System.out.println("No");
    		else System.out.println("Yes");
	    }
	}
}