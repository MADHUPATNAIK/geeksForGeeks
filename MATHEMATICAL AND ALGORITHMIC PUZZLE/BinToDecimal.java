/*
Binary number to decimal number:
	Given a Binary Number B, Print its decimal equivalent.

Input:
	The first line of input contains an integer T denoting the number of test cases. The description of T test cases follow. Each test case contains a single Binary number B. 

Output: 
	For each testcase, in a new line, print each Decimal number in new line.

Constraints:
	1 < T < 100
	1 <= Digits in Binary <= 16

Example:
Input:
	2
	10001000
	101100
Output:
	136
	44
*/

class BinToDecimal{
	static Scanner sc = new Scanner(System.in);
	
	public static int binaryToDecimal(String input){
		int lengthOfString = input.length();
		int sum = 0, i =0;
		while(--lengthOfString >= 0){
		    int val = input.charAt(i++) - '0';
			sum+= (val* Math.pow(2,lengthOfString));
		}
		return sum;
	}
	
	public static void main(String args[]){
		int testCases = sc.nextInt();
		for(int i=0; i<testCases; i++){
			String input = sc.next();
			int value = binaryToDecimal(input);
			System.out.println(value);
		}
	}
}