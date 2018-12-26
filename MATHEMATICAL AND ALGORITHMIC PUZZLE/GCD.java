/*
GCD of two numbers:
	Given two numbers A and B, find the GCD of those 2 numbers.

Input:
	The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case contains two space separated integers A and B.

Output:
	For each testcase, in a new line, print the GCD of the two numbers.

Constraints:
	1 <= T <= 100
	1 <= A, B <= 1000

Example:
Input:
	2
	98 56
	48 18
Output:
	14
	6
*/

class GCD{
	static Scanner sc = new Scanner(System.in);
	public static int gcd(int dividend, int divisor){
	    if(divisor == 0)return -1;
		if(dividend%divisor == 0) return divisor;
		else{
			return gcd(divisor, dividend%divisor);
		}
	}
	public static void main(String args[]){
		int testCases = sc.nextInt();
		for(int i=0; i<testCases; i++){
			int dividend = sc.nextInt();
			int divisor = sc.nextInt();
			System.out.println(gcd(dividend, divisor));
		}
	}
}