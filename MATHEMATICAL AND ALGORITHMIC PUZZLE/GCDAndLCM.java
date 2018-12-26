/*
LCM And GCD:
	For 2 given numbers A and B, find out their LCM and GCD.

Input:
The first line contains an integer 'T' denoting the total number of test cases. T testcases follow. In each test cases, there are two numbers A and B.

Output:
For each testcase, in a new line, find LCM and HCF.

Constraints:
1 <= T <= 30
1 <= a <= 1000
1 <= b <= 1000

Example:
Input:
2
5 10
14 8
Output:
10 5
56 2
*/

class GCDAndLCM{
	static Scanner sc = new Scanner(System.in);
	public static int gcd(int input1, int input2){
	    if(input1 < input2){
	        int temp = input1;
	        input1 = input2;
	        input2 = temp;
	    }
		if(input2 == 0)return -1;
		if(input1%input2 == 0) return input2;
		else{
			return gcd(input2, input1%input2);
		}
	}
	public static int lcm(int input1, int input2){
		int val = gcd(input1, input2);
		return (input1*input2 / val);
	}
	public static void main(String args[]){
		int testCases = sc.nextInt();
		for(int i=0; i<testCases; i++){
			int input1 = sc.nextInt();
			int input2 = sc.nextInt();
			System.out.println(lcm(input1,input2)+" "+gcd(input1, input2));
		}
	}
}