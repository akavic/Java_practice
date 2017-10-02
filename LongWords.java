import java.util.*;
class LongWords
{
	public static void main(String[] args) 
	{
		HashSet <String> words=new HashSet<>();
		HashSet <String> sorted=new HashSet<>();
		 //ArraySet <String> sorted=new  ArraySet<String>();
		int div=0;
		int sum=0;
		while(!Console.EndOfFile())
		{
			String text=Console.readToken();
			div++;
			words.add(text);
		}
		
		for(String w:words)
		{
			 sum=sum+w.length();
		}
		int avg=sum/div;
		//System.out.print(avg);
		for(String p: words)
		{
			if(p.length()>avg)
			{
				String x =p;
				sorted.add(x);	
			}
		}
		Collections.sort(sorted);
		for(String s: sorted)
		{
			System.out.println(sorted);
		}
		
	}
}

