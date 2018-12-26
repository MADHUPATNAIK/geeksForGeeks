/*
Series AP : 
	Given the first 2 terms A and B of an Arithmetic Series, 
	tell the Nth term of the series. 

Input:
	First line contains an integer, the number of test cases 'T'. T testcases follow. Each test case in its first line should contain two positive integer A and B(First 2 terms of AP). In the second line of every test case it contains of an integer N.

Output:
	For each testcase, in a new line, print the Nth term of the AP.

Constraints:
	1 <= T <= 30
	-100 <= A <= 100
	-100 <= B <= 100
	1 <= N <= 100

Example:
Input:
	2
	2 3
	4
	1 2
	10
Output:
	5
	10
*/

import java.util.Scanner;

class SeriesAP{
	Scanner sc = new Scanner(System.in);
	public static void main(String args[]){
		int testCases;
		testCases = sc.nextInt();
		
		for(int i=0; i<testCases; i++){
			int firstTerm, secondTerm;
			firstTerm = sc.nextInt();
			secondTerm = sc.nextInt();
			
			int commonDiff = secondTerm - firstTerm;
			int nPos = sc.nextInt();
			
			System.out.println("The Nth term of the series : "+(firstTerm+(nPos - 1)*commonDiff));
		}
	}
}