import java.util.Calendar;
import java.util.Date;

import processing.core.PApplet;

public class Activity 
{
	// FIELDS
	private int duration;
	private String description;
	private Calendar cal;	
	public enum Type {Exercise, Leisure, Meal, School, Sleep, Work, Call, Other}; // call this by writing Acitivity.Type.Leisure
	public Type type;
	private boolean exists = true; // this field is only used to help determine whether the delete-activity-popup should appear
	
	// CONSTRUCTOR
	public Activity()
	{
		type = Type.Leisure;
		duration = 0;
		description = "";
		exists = false;
	}
	public Activity(Type type, int duration, String description, Calendar cal) 
	{
		this.type = type;
		this.duration = duration;
		this.description = description;
		this.cal = cal;
	}
	
	// METHODS
	public void setDuration(int amount)   
	{
		duration = amount;
	}
	
	public void setType(String s) {
		type = Type.valueOf(s);
	}
/*	
	public void setDate() 
	{
		
	}
*/	
	public int getDuration() 
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
		try {
			foo = type.toString();
		}
		catch (NullPointerException n) {
			return "<null>";
		}
		return foo;
	}	
	
	public boolean getExists()
	{
		return exists;
	}
}
