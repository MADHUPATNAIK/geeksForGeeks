/*
nPr:
	Write a program to calculate nPr. nPr represents n permutation r and value of nPr is (n!) / (n-r)!.

Input: 
	The first line of the input contains T denoting the number of testcases. T testcases follow. First line of the test case will be the value of n and r respectively.

Output:
	For each test case, in a new line, output will be the value of nPr.

Constraints:
	1 <= T <= 100
	1 <= n,r <= 20
	n >= r

Example:
Input:
	2
	2 1
	10 4
Output:
	2
	5040
*/

class nPr{
	static Scanner sc = new Scanner(System.in);
	
	public static long factorial(long input, long r){
	    long sum = 1;
		while(input > r){
		    sum *= input--;
		}
		return sum;
	}
	
	public static void main(String args[]){
		int testCases = sc.nextInt();
		for(int i=0; i<testCases; i++){
			long n = sc.nextLong();
			long r = sc.nextLong();
			long val = factorial(n,n-r);
			System.out.println(val);
		}
	}
}