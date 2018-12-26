/*
Prime Number:
	For a given number N check if it is prime or not. A prime number is a number which is only divisible by 1 and itself.

Input:
	First line contains an integer, the number of test cases 'T'. T testcases follow. Each test case should contain a positive integer N.

Output:
	For each testcase, in a new line, print "Yes" if it is a prime number else print "No".

Constraints:
	1 <= T <= 30
	1 <= N <= 100

Example: 
Input:
	1
	5
Output:
	Yes
*/

class PrimeNumber{
	static Scanner sc = new Scanner(System.in);
	public static String primeNumber(long input){
	    if(input%2 == 0) return "No";
		else{
			for(int i=3; i<= Math.sqrt(input); i+=2){
				if(input%i == 0)return "No";
			}
		}
		return "Yes";
	}
	public static void main(String args[]){
		int testCases = sc.nextInt();
		for(int i=0; i<testCases; i++){
			long input = sc.nextInt();
			System.out.println(primeNumber(input));
		}
	}
}