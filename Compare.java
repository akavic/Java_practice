import java.util.*;
import java.lang.*;
class Equality implements  Comparable<Equality>
{
	String name;
	
	Equality(String name)
	{
		this.name=name;
		
	}
	public int compareTo(Equality a)
	{
		if(name.compareTo(a.name)>0)
		{
			return 1;
		}
		else if(name.compareTo(a.name)<0)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
}
class Compare
{
	public static void main(String [] args)
	{
		Equality obj1 = new Equality("e");
		Equality obj2 = new Equality("b");
		   int retval =  obj1.compareTo(obj2);
			
		   if(retval > 0) {
		   System.out.println(retval+"e");
		   }
		   else if(retval < 0) {
		   System.out.println("b");
		   }
		   else {
		   System.out.println("obj1 is equal to obj2");
			}
			//System.out.print("bye bye");
	}
}