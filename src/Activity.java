import java.util.Calendar;
import java.util.Date;

public class Activity 
{
	// FIELDS
	private double duration;
	private String description;
	private Calendar cal;	
	public enum Type {Exercise, Leisure, Meal, School, Sleep, Work, Call, Other};
	public Type type;
	private boolean exists = true; // this field is only used to help determine whether the delete-activity-popup should appear
	
	// CONSTRUCTORS
	public Activity() // default activity
	{
		type = Type.Exercise;
		duration = 0.5;
		description = "";
		exists = false;
		cal = Calendar.getInstance();
		cal.set(3,0,0,0,0); // default is sunday at 8 AM
	}
	
	public Activity(Type type, double duration, String description, Calendar cal) 
	{
		this.type = type;
		this.duration = duration;
		this.description = description;
		this.cal = cal;
	}
	
	// METHODS
	public void setDuration(double amount)   
	{
		duration = amount;
	}
	
	public void setType(String s) 
	{
		type = Type.valueOf(s);
	}
	
	public void setDate(int day, int hour) // takes in day of week and hour values to make less complicated
	{
		cal.set(3, 0, day, hour, 0);
	}
	
	public void setExists(boolean b) 
	{
		exists = b;
	}
	
	public void setDescription(String s) 
	{
		description = s;
	}
	
	public double getDuration() 
	{
		return duration;
	}
		
	public Date getDate() 
	{
		return cal.getTime();
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public String getTypeName()
	{
		String foo = "";
		try 
		{
			foo = type.toString();
		}
		catch (NullPointerException n) 
		{
			return "<null>";
		}
		return foo;
	}	
	
	public boolean getExists()
	{
		return exists;
	}
}
