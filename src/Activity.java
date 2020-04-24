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
	
	// CONSTRUCTOR
	public Activity()
	{
		type = Type.Exercise;
		duration = 0;
		description = "";
		cal = null;	
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
		return type.toString();
	}	
}
