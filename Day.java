/*
** Bailey Spicer
** bes2725@email.vccs.edu
** 4/27/2016
** this creates a class called Day
*/
public class Day
{
/**These are the variables*/
	private String day;
	private String[] dayOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", 
		"Friday", "Saturday"};
	private int mod=0, x=0;
/**Constructors*/
	public Day()
	{
		day = "Sunday";
	}
	public Day(String day)
	{
		this.day = day;
	}
/**mutators*/
	public void setDay(String day)
	{
		this.day = day;
	}
/**accessors*/
	public String getDay()
	{
		return day;
	}
/**find tomorrow*/
	public String yestDay()
	{
		for (int i=0; i<dayOfWeek.length; i++)
		{
			if (day.equalsIgnoreCase(dayOfWeek[i]))
			{
				x = i;
			}
		}
		mod = (x+6)%7;
		return (dayOfWeek[mod]);
		
	}
/**find yesterday*/
	public String nextDay()
	{
		for (int i=0; i<dayOfWeek.length; i++)
		{
			if (day.equalsIgnoreCase(dayOfWeek[i]))
			{
				x = i;
			}
		}
		mod = (x+1)%7;
		return (dayOfWeek[mod]);
	}
/**x number of days from now*/
	public String daysFrom(int away)
	{
		mod = 0;
		for (int i=0; i<dayOfWeek.length; i++)
		{
			if (day.equalsIgnoreCase(dayOfWeek[i]))
			{
				x = i;
			}
		}
		mod = (x+away)%7;
		return (dayOfWeek[mod]);
	}
/**x number of days ago*/
	public String daysAgo(int ago)
	{
		mod = 0;
		for (int i=0; i<dayOfWeek.length; i++)
		{
			if (day.equalsIgnoreCase(dayOfWeek[i]))
			{
				x = i;
			}
		}
		mod = (x+1+ago)%7;
		return (dayOfWeek[mod]);
	}
/**print*/
	public String toString()
	{
		return "Today is " + this.day + ".";
	}
}




