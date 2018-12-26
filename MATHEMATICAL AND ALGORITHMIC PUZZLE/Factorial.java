/*
Factorial:
	Calculate the factorial for a given number N.

Input:
	The first line contains an integer 'T' denoting the total number of test cases. T testcases follow. In each test cases, it contains an integer 'N'.

Output:
	For each testcase, in a new line, output the answer to the problem.

Constraints:
	1 <= T <= 19
	0 <= N <= 18

Example:
Input:
	1
	1
Output:
	1
*/

class Factorial{
	static Scanner sc = new Scanner(System.in);
	public static long factorial(long input){
	    long sum = 1;
	    while(input >= 1) sum *= input--;  
	    return sum;
	}
	public static void main(String args[]){
		int testCases = sc.nextInt();
		for(int i=0; i<testCases; i++){
			long input = sc.nextInt();
			System.out.println(factorial(input));
		}
	}
}