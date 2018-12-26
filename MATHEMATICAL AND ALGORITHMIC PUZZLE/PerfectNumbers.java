/*
Perfect Numbers:
	Given a number N, check if a number is perfect or not. A number is said to be perfect if sum of all its factors excluding the number itself is equal to the number.

Input:
	First line consists of T test cases. Then T test cases follow .Each test case consists of a number N.

Output:
	For each testcase, in a new line, output in a single line 1 if a number is a perfect number else print 0.

Constraints:
	1 <= T <= 300
	1 <= N <= 104

Example:
Input:
	2
	6
	21
Output:
	1
	0
*/

class PerfectNumbers{
	static Scanner sc = new Scanner(System.in);
	public static long perfectNumbers(long input){
		long sum = 1;
		for(long i=2; i<=Math.sqrt(input); i++){
			if(input%i == 0){
				if(input/i == i) sum+=i;
				else sum+= i+(input/i);
			}
		}
		if(sum == input) return 1;
		else return 0;
	}
	
	public static void main(String args[]){
		int testCases = sc.nextInt();
		while(testCases-- > 0){
			long input = sc.nextLong();
			System.out.println(perfectNumbers(input));
		}
	}
}