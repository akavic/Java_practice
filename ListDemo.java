import java.util.*;
class ListDemo
{
	public static void main(String [] args)
	{
		ArrayList<Integer> nums =new ArrayList<Integer>();
		int numbers=Console.readInt();
		while(!Console.endOfFile()) 
		{
			nums.add(numbers);
		}
		for(int i=0; i<nums.size();i++)
		{
			if(nums.get(i)%2==0)
			{
				System.out.print("even numbers :"+i);
			}
			else
			{
				System.out.println("odd numbers: "+i);
			}
		}
		
	}
}