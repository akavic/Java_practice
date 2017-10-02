class Recursion
{
	static int power(int m, int n) { // m to the power n where n>=0
		if (n==0) return 1;
		else return m*power(n-1); // recursion!
	}

	public static void main(String [] args)
	{
		System.out.print(power(2,5));
	}
}