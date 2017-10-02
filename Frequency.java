import java.util.*;
class Frequency
{
	public static void main(String [] args)
	{
		HashMap<Integer,Integer> wordcount= new HashMap<String,Integer> ();
		
		while(!Console.EndOfFile())
		{
			String word =Console.readString();
			int wordlength=word.length();
			
			if(wordcount.containsKey(word))
			{
				wordcount.put(word,numoccur+1);
				
			}
			else
			{
				wordcount.put(word,1);
			}
			
		}
		
		for(String x: wordcount)
		{
			
			System.out.printf("%-20s%-20s\n","word length","frequency");
			System.out.println();
			System.out.printf("%-20d%-20\n",len,wordcount.get(x));
		}
	}
}