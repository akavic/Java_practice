import java.util.*;
class Threads implements Runnable
{
	String name;
	int time;
	Random  r=new Random();
	
	public Threads(String x)
	{
		name=x;
		time=r.nextInt(999);
	}
	public void run()
	{
		try{
			System.out.printf("%s is sleeping for %d\n",name,time);
			Thread.sleep(time);
			System.out.printf("%s is done\n",name);
		}catch(Exception e){}
	}
	public static void main(String [] args)
	{
		Thread t1=new Thread(new Threads("one"));
		Thread t2=new Thread(new Threads("two"));
		Thread t3=new Thread(new Threads("three"));
		Thread t4=new Thread(new Threads("four"));
		
		t1.start();
		t2.start(); //run a thread
		t3.start();
		t4.start();
		
		
	}
}