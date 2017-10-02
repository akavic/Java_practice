class Time1
{
	private int hours;
	private int mins;
	
	Time1(int hours,int mins)
	{
		this.hours=hours;
		this.mins=mins;
	}
	void put()
	{
		System.out.printf("%02d:%02d",hours,mins);
	}

}
class PreciseTime extends Time1
{
	private int secs;
	
	PreciseTime(int h0,int m0,int secs)
	{
		super(h0,m0);
		this.secs=secs;
		
	}
	void put()
	{
		super.put();
		System.out.print(":"+secs);
	}
}
class TimeDemo2
{
	public static void main(String [] args)
	{
		PreciseTime t1=new PreciseTime(2,3,6);
		t1.put();
	}
}