import java.awt.Point;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.*;
import processing.core.PApplet;

public class DrawingSurface extends PApplet
{
	// FIELDS
	RectButton r; 
	CalendarUI cal; // the year must always be 3 and the month must always be 0
	public ArrayList<Activity> activities;
	
	// CONSTRUCTOR
	public DrawingSurface()
	{
		r = new RectButton(930, 20, 320, 300, 50, 100);  
		cal = new CalendarUI();
		
		// These are test activities being entered - remove c1 and c2 in final version
		Calendar c1  = Calendar.getInstance();
		c1.set(3, 0, 4, 8, 30); // Monday at 4:30 PM
		Calendar c2 = Calendar.getInstance();
		c2.set(3, 0, 4, 20, 0); // Wednesday at 4 AM
		Activity a = new Activity(Activity.Type.Other , 4, "2 mile run", c1);  
		Activity b = new Activity(Activity.Type.Call, 1, "facetime with coder gorls", c2);
		activities = new ArrayList<Activity>();
		activities.add(a);
		activities.add(b);		
	}
	
	//METHODS
	public void draw()
	{
		if (1 == frameCount)
			surface.setLocation(0,0);  // set window origin on screen to top left corner
	 	this.background(200);
	 	this.fill(255);
		cal.draw(this);
		r.draw(this);
	}
	
	public void mouseMoved()
	{
		r.update(this);
	}
	
	public void mousePressed()
	{
		if (r.over(this))
		{
			ActivityPopUp popup = new ActivityPopUp();
			popup.pop();
		}	
		else if (cal.over(this))
		{
	//		Point p = cal.mousePressed(this);
	//		int x = p.x;
	//		int y = p.y;
			// the x,y coordinate of the grid needs to be converted to time and day and then entered as a parameter to popup
			ActivityPopUp popup = new ActivityPopUp(cal.getActivityFromGridLoc(this, mouseX, mouseY));
			popup.pop();
			
		}
	}
	
	public ArrayList<Activity> getActivityList()
	{
		return activities;
	}
}