import javax.swing.JOptionPane;

public class ActivityPopUp 
{
	Activity a;		
	String[] acts = {"Exercise", "Leisure", "Meal", "School", "Sleep", "Work", "Call", "Other"};
	String[] times = {"8:00AM", "9:00AM", "10:00AM", "11:00AM", "12:00PM", "1:00PM", "2:00PM", "3:00PM", "4:00PM", "5:00PM", "6:00PM", "7:00PM", "8:00PM", "9:00PM", "10:00PM", "11:00PM", "12:00AM", "1:00AM", "2:00AM", "3:00AM", "4:00AM", "5:00AM", "6:00AM", "7:00AM"};
    String[] durations = {"0.5 hr", "1 hr", "1.5 hr", "2 hr", "2.5 hr", "3 hr", "3.5 hr", "4 hr", "4.5 hr", "5 hr", "5.5 hr", "6 hr", "6.5 hr", "7 hr", "7.5 hr", "8 hr", "8.5 hr", "9 hr", "9.5 hr", "10 hr", "10.5 hr", "11 hr", "11.5 hr", "12 hr"};
    String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    
	// CONSTRUCTORS
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
	// Makes the edit activity questionnaire appear
	public void pop(DrawingSurface surface)
	{
		int indOfDay = matchDay();
	    int indOfAct = matchActivity();
	    int indOfTime = matchTime();
	    int indOfDuration = matchDuration();
	    String description = a.getDescription();
	    String d = null;
	    String act = null;
	    String t = null;
	    String duration = null;
	    String details = null;


	    d = (String) JOptionPane.showInputDialog(null, "Select day, then press OK", "New Activity", 
	    		JOptionPane.QUESTION_MESSAGE, null, days, days[indOfDay]);
	    
	    if ((d != null) && (d.length() > 0)) 
	    {
		   act = (String) JOptionPane.showInputDialog(null, "Select type of activity, then press OK", "New Activity", 
		    		JOptionPane.QUESTION_MESSAGE, null, acts, acts[indOfAct]);
		  
		    if ((act != null) && (act.length() > 0)) 
		    {
		    	t = (String) JOptionPane.showInputDialog(null, "Select starting time, then press OK", "New Activity", 
		    			JOptionPane.QUESTION_MESSAGE, null, times, times[indOfTime]);
			   
		    	if ((t != null) && (t.length() > 0)) 
		    	{
				    duration = (String) JOptionPane.showInputDialog(null, "Select duration of activity, then press OK", 
				    		"New Activity", JOptionPane.QUESTION_MESSAGE, null, durations, durations[indOfDuration]);
				   
				    if ((duration != null) && (duration.length() > 0)) 
				    {	 
				    	details = JOptionPane.showInputDialog(null, "Enter any specific details of activity", description);
				    }
			    }
		    }
	    }   
	    
	    int dayInt = 0;
	    int hourInt = 0;   	

	    // changes day input to index of array
	    for(int i = 0; i < days.length; i++) 
	    {
	    	String s = days[i];
	    	if(d.equals(s)) 
	    		dayInt = i;
    	}
	    
	    // changes time input to index of array
	    for(int i = 0; i < times.length; i++) 
	    {
	    	String s = times[i];
	    	if(t.equals(s)) 
	    		hourInt = i;
	    }	    
	    
	    a.setType(act);
	    a.setDate(dayInt, hourInt);
	    a.setDuration(Double.parseDouble(duration.replace(" hr", "")));	    
	    a.setExists(true);
	    a.setDescription(details);
	    
	    surface.activities.add(a);    
	}
		
	public void edit(DrawingSurface surface)
	{
		int indOfDay = matchDay();
	    int indOfAct = matchActivity();
	    int indOfTime = matchTime();
	    int indOfDuration = matchDuration();
	    String description = a.getDescription();
	    String d = null;
	    String act = null;
	    String t = null;
	    String duration = null;
	    String details = null;
    
	    d = (String) JOptionPane.showInputDialog(null, "Select day, then press OK", "New Activity", 
	    		JOptionPane.QUESTION_MESSAGE, null, days, days[indOfDay]);
	    
	    if ((d != null) && (d.length() > 0)) 
	    {
		   act = (String) JOptionPane.showInputDialog(null, "Select type of activity, then press OK", "New Activity", 
		    		JOptionPane.QUESTION_MESSAGE, null, acts, acts[indOfAct]);
		  
		    if ((act != null) && (act.length() > 0)) 
		    {
		    	t = (String) JOptionPane.showInputDialog(null, "Select starting time, then press OK", "New Activity", 
		    			JOptionPane.QUESTION_MESSAGE, null, times, times[indOfTime]);
			   
		    	if ((t != null) && (t.length() > 0)) 
		    	{
				    duration = (String) JOptionPane.showInputDialog(null, "Select duration of activity, then press OK", 
				    		"New Activity", JOptionPane.QUESTION_MESSAGE, null, durations, durations[indOfDuration]);
				   
				    if ((duration != null) && (duration.length() > 0)) 
				    {	 
				    	details = JOptionPane.showInputDialog(null, "Enter any specific details of activity", description);
				    }
			    }
		    }
	    } 
	       
	    int dayInt = 0;
	    int hourInt = 0;

	    // changes day input to index of array
	    for(int i = 0; i < days.length; i++) 
	    { 
	    	String s = days[i];
	    	if(d.equals(s))  
	    		dayInt = i;
    	}
	 // changes time input to index of array
	    for(int i = 0; i < times.length; i++) 
	    { 
	    	String s = times[i];
	    	if(t.equals(s))  
	    		hourInt = i;
	 }	    
	    
	    a.setType(act);
	    a.setDate(dayInt, hourInt);
	    a.setDuration(Double.parseDouble(duration.replace(" hr", "")));	    
	    a.setExists(true);
	    a.setDescription(details);     
	}
	
	// Makes the delete activity questionnaire appear
    public void popDeletePanel(Activity a, DrawingSurface surface)
    {
    	if (JOptionPane.showConfirmDialog(null, "Delete this activity?", "Select an option", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) 
    	{
    	    // delete the activity
    		surface.deleteActivity(a);
    	}
    }
    
    public int matchDay() 
    {
    	for(int i = 0; i < days.length; i++) 
    	{
	    	String s = days[i];
	    	if(a.getDate().getDay() == i) 
	    		return i;
    	}
		return 0;
    }
	
 // Detects the which String in array matches activity for a
	public int matchActivity() 
	{ 
		for(int i = 0; i < acts.length; i++) 
		{
	    	String s = acts[i];
	    	if(a.getTypeName().equals(s)) 
	    		return i;
		}
		return 0;
	}
	
	// Detects the which String in array matches time for a
	public int matchTime() 
	{
		 for(int i = 0; i < times.length; i++) 
		 { 
		    	String s = times[i];
		    	if(a.getDate().getHours() == i) 
		    		return i;
		 }
		 return 0;
	}

	// Detects the which String in array matches duration for a
	public int matchDuration() 
	{
		for(int i = 0; i < durations.length; i++) 
		{ 
	    	String s = durations[i];
    		if((a.getDuration() == Double.parseDouble(s.replace(" hr", ""))))
    			return i;
	    }
	    return 0;
	}
}
