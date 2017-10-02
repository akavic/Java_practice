import java.util.*;
class PracMap
{
	public static void main(String [] args)
	{
		HashMap<String,String> map=new HashMap<>();
		while(!Console.EndOfFile())
		{
			String name=Console.readToken();
			String age=Console.readString();
			
			map.put(name,age);
		}
		
		Set <String>pout=map.keySet(); 
		
		for(String s:pout)
		{
			System.out.print(s+"  "+map.get(s));
		}
		
	}
}
