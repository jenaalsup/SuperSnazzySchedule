import java.util.Date;

public class Activity {

	// FIELDS
	private int duration;
	private String description;
	private Date date;	
	public enum Type {Exercise, Leisure, Meal, School, Sleep, Work, Call, Other};
	private Type type;
	
	// CONSTRUCTOR
	public Activity(Type type, int duration, String description, Date date) 
	{
		this.type = type;
		this.duration = duration;
		this.description = description;
		this.date = date;
	}
	
	// METHODS
	public void setDuration(int amount)   
	{
		duration = amount;
	}
	
	public void setStartTime(Date d) 
	{
		date = d;
	}
	
	public int getDuration() 
	{
		return duration;
	}
	
	public Date getDate() 
	{
		return date;
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
