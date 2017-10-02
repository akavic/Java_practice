class Play
{

	public static void  sort(int [] yoyo)
	{
		
		int x= yoyo.length;
		int tmp=0;
		while(x!=0)
		{
			for(int i=0; i<yoyo.length-1; i++)
			{
				if(yoyo[i]>yoyo[i+1])
				{
					tmp=yoyo[i];
					yoyo[i]=yoyo[i+1];
					yoyo[i+1]=tmp;
				}
			}
			x--;
		}
		//return yoyo;
	
		
	}

	public static void main(String [] args)
	{
		
		
		int [] nums={10,9,8,7,6,5,4,3,2,1};
		
		sort(nums);
		
		
		for(int z: nums)
		{
			System.out.println(z+" ");
		}
		
		
	
		
	}
}
