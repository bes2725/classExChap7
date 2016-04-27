import java.util.Scanner;

public class DayDriver
{
	public static void main (String[] args)
	{
		String day;
		int daysFrom, daysPast;
		
		Scanner in = new Scanner(System.in);
		Day today = new Day();

		System.out.println("What day is today?");
		day = in.next();

		today.setDay(day);

		System.out.println("Okay, so today is " + today.getDay() + ", right?");
		System.out.println("That means yesterday was " + today.yestDay() + ".");
		System.out.println("And tomorrow will be " + today.nextDay() + ".");

		System.out.println("Now, enter a number: ");
		daysFrom = in.nextInt();

		System.out.println("And another, please: ");
		daysPast = in.nextInt();

		System.out.println("Okay, so " + daysFrom + " days from today, it will be " 
			+ today.daysFrom(daysFrom) + ".");
		System.out.println("And " + daysPast + " days ago it was " 
			+ today.daysAgo(daysPast) + ".");

	}
}


		
