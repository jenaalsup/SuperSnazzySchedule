import javax.swing.JOptionPane;

public class ActivityPopUp 
{
	Activity a;		
	String[] activities = {"Exercise", "Leisure", "Meal", "School", "Sleep", "Work", "Call", "Other"};
	String[] times = {"12:00AM", "1:00AM", "2:00AM", "3:00AM", "4:00AM", "5:00AM", "6:00AM", "7:00AM", "8:00AM", "9:00AM", "10:00AM", "11:00AM", "12:00PM", "1:00PM", "2:00PM", "3:00PM", "4:00PM", "5:00PM", "6:00PM", "7:00PM", "8:00PM", "9:00PM", "10:00PM", "11:00PM"};
    String[] durations = {"0.5 hr", "1 hr", "1.5 hr", "2 hr", "2.5 hr", "3 hr", "3.5 hr", "4 hr", "4.5 hr", "5 hr", "5.5 hr", "6 hr", "6.5 hr", "7 hr", "7.5 hr", "8 hr", "8.5 hr", "9 hr", "9.5 hr", "10 hr", "10.5 hr", "11 hr", "11.5 hr", "12 hr"};

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
	    int indOfAct = matchActivity();
	    int indOfTime = 0;
//	    int indOfTime = matchTime();
	    int indOfDuration = matchDuration();
	    String description = a.getDescription();
		
		System.out.println(">> " + indOfAct);
	    String a = (String) JOptionPane.showInputDialog(null, "Select type of activity, then press OK", "New Activity", 
	    		JOptionPane.QUESTION_MESSAGE, null, activities, activities[indOfAct]);
	  
	    if ((a != null) && (a.length() > 0)) {
	    	String t = (String) JOptionPane.showInputDialog(null, "Select starting time, then press OK", "Select Start Time", 
	    			JOptionPane.QUESTION_MESSAGE, null, times, times[indOfTime]);
		   
	    	if ((t != null) && (t.length() > 0)) {
			    String duration = (String) JOptionPane.showInputDialog(null, "Select duration of activity, then press OK", 
			    		"Select Duration", JOptionPane.QUESTION_MESSAGE, null, durations, durations[indOfDuration]);
			   
			    if ((duration != null) && (duration.length() > 0)) {	 
			    	String details = JOptionPane.showInputDialog(null, "Enter any specific details of activity", description);
			    }
		    }
	    }
	    
	    //	    Activity one = new Activity(a, duration, details, t);	
	}
	
	
	public int matchActivity() { // detects the which String in array matches activity for a
		for(int i = 0; i < activities.length; i++) {
	    	String s = activities[i];
	    	if(a.getTypeName().equals(s)) {
	    		return i;
	    	}
		}
		return 0;
	}
	
	public int matchTime() { // detects the which String in array matches time for a
		 for(int i = 0; i < times.length; i++) { 
		    	String s = times[i];
		    	if(a.getDate().equals(s)) { //!!! idk how to properly compare the date object have to fix, gives null pointer exception right now
		    		return i;
		    	}
		 }
		 return 0;
	}

	public int matchDuration() { // detects the which String in array matches duration for a
	    for(int i = 0; i < durations.length; i++) { 
	    	String s = durations[i];
	    	String copy = "";
	    	for(int j = 0; j < s.length(); j++) {
	    		if(Character.isDigit(s.charAt(j)) || s.charAt(j) == '.')
	    			copy += s.charAt(j);
	    	}
    	
    		if(a.getDuration() == Double.parseDouble(copy))
    			return i;
	    }
	    return 0;
	}
}
