class TrunkCall
{s
	int duration;
	TrunkCall(int sec)
	{
	duration=sec;
	}
	void charge()
	{
	System.out.println("charge is undefined");
	}
class Ordinary extends TrunkCall
{
	Ordinary(int a)
	{
		super(a);
	}
	double charge()
	{
	System.out.println("the cost of ordinary call is:");
	System.out.println("duration*1.00");
	}
	
}
class Urgent extends TrunkCall
{
	Urgent(int a)
	{
		super(a);
	}
	double charge()
	{
	System.out.println("the cost of urgent call is:");
	System.out.println("duration*2.00");
	}
}
class Lighting extends TrunkCall
{
	Lighting(int a)
	{
		super(a);
	}
	double charge()
	{
	System.out.println("the cost of lighting call is:");
	System.out.println("duration*3.00");
	}
}
class Main
{
	public static void main(String args[]);
	Ordinary o1=new ordinary(12);
	Urgent u1=new urgent(15);
	Lightening l1=new lightening(10);
	o1.charge();
	u1.charge();
	l1.charge();
}
}
		
	


	
