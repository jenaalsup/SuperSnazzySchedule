import javax.swing.JOptionPane;

public class ActivityPopUp 
{
	Activity a;
	// CONSTRUCTOR
	public ActivityPopUp()
	{	
		a = new Activity();
	}
	
	// for when the user clicks on an existing activity
	public ActivityPopUp(Activity a)
	{
		this.a = a;
	}
	
	// METHODS
	public void pop()
	{
		// Need to set the default popup data to whatever is in the field a
		
		
		
		// need to change duration to a drop down with options like 0.5 hr, 1 hr, 1.5 hr... 12 hr max - this'll make it easier to read in times
	 
		
		
		String[] activities = {"Exercise", "Leisure", "Meal", "School", "Sleep", "Work", "Call", "Other"};
	    String[] times = {"12:00AM", "1:00AM", "2:00AM", "3:00AM", "4:00AM", "5:00AM", "6:00AM", "7:00AM", "8:00AM", "9:00AM", "10:00AM", "11:00AM", "12:00PM", "1:00PM", "2:00PM", "3:00PM", "4:00PM", "5:00PM", "6:00PM", "7:00PM", "8:00PM", "9:00PM", "10:00PM", "11:00PM"};
	    
	    String a = (String) JOptionPane.showInputDialog(null, "Select type of activity, then press OK", "New Activity", JOptionPane.QUESTION_MESSAGE, null, activities, activities[0]);
	    String t = (String) JOptionPane.showInputDialog(null, "Select starting time, then press OK", "Select Start Time", JOptionPane.QUESTION_MESSAGE, null, times, times[0]);
	    String duration = JOptionPane.showInputDialog(null, "Enter duration of activity in hours");
	    String details = JOptionPane.showInputDialog(null, "Enter any specific details of activity");
	    
	    //	    Activity one = new Activity(a, duration, details, t);	
	}
}
