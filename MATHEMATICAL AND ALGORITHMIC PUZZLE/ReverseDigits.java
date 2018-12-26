/*
Reverse digits:
	Write a program to reverse digits of a number N.

Input:
	The first line of input contains an integer T, denoting the number of test cases. T testcases follow. Each test case contains an integer N.

Output:
	For each test case, print the reverse digits of number N .

Constraints:
	1 ≤ T ≤ 100
	1 ≤ N ≤ 109

Example:
Input:
	2
	200
	122
Output:
	2
	221
*/

class ReverseDigits{
	static Scanner sc = new Scanner(System.in);
	public static int reverseNumber(int number){
		int sum = 0;
		while(number > 0){
			sum += (number%10);
			sum *= 10;
			number /= 10;
		}
		return sum/10;
	}
	public static void main(String args[]){
		int testCases = sc.nextInt();
		for(int i=0; i<testCases; i++){
			int input = sc.nextInt();
			System.out.println(reverseNumber(input));
		}
	}
}