class Time
{
	private int time_day;
	private int the_time;
	
	
	void getTime()
	{
		time_day=Console.readInt();
		int hour= time_day / 100;
		int mins = time_day % 100;
		the_time = hour*60 + mins;
	
	}
	boolean gt(Time t)
	{
		return the_time>t.the_time;
	}
}
class Period
{
	private Time start_time= new Time();
	private Time end_time= new Time();
	
	void getPeriod()
	{
		start_time.getTime();
		end_time.getTime();
	}
	boolean overlaps(Period p)
	{
		return (end_time.gt(p.start_time) && p.end_time.gt(start_time));
	}
}
	
class timeDemo
{
	public static void main(String[]args)
	{
		Period p1 =new Period();
		Period p2= new Period();
		
		p1.getPeriod();
		p2.getPeriod();
		
		if(p1.overlaps(p2)==true)
		{
			System.out.print("they overlap");
		}
		else
		{
			System.out.print("too bad they don't overlap");
		}
	}
}
