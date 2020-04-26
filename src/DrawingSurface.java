import java.awt.Point;
import java.awt.event.InputEvent;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.*;
import processing.core.PApplet;
import processing.event.MouseEvent;

public class DrawingSurface extends PApplet
{
	// FIELDS
	RectButton r; 
	CalendarUI cal; // the year must always be 3 and the month must always be 0
	StatsBox s;
	public static ArrayList<Activity> activities;
	
	// CONSTRUCTOR
	public DrawingSurface()
	{
		r = new RectButton(935, 20, 310, 310, 50, 100);  
		cal = new CalendarUI();
		s = new StatsBox();
		
		activities = new ArrayList<Activity>();

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
		this.fill(255);
		textSize(150);
		this.text("+", r.getX() + 100, r.getY() + 195);
		textSize(12);
		s.draw(this);
	}
	
	public void mouseMoved()
	{
		r.update(this);
	}
	
	public void mousePressed(MouseEvent e)
	{
		if (e.getModifiers() == InputEvent.BUTTON3_MASK) // right click
		{
			Activity a = cal.getActivityFromGridLoc(this, mouseX, mouseY);
			if (a.getExists())
			{
				ActivityPopUp deletepopup = new ActivityPopUp(a);
				deletepopup.popDeletePanel(a, this);
			}
		}
		else // left click
		{
			if (r.over(this))
			{
				ActivityPopUp popup = new ActivityPopUp();
				popup.pop(this);
			}	
			else if (cal.over(this))
			{
				//		Point p = cal.mousePressed(this);
				//		int x = p.x;
				//		int y = p.y;
				// the x,y coordinate of the grid needs to be converted to time and day and then entered as a parameter to popup
				ActivityPopUp popup = new ActivityPopUp(cal.getActivityFromGridLoc(this, mouseX, mouseY));
				popup.edit(this);		
			}
		}
	}
	
	// Returns an ArrayList of all the activities
	public static ArrayList<Activity> getActivityList()
	{
		return activities;
	}
	
	// This deletes the first activity in the ArrayList with those aspects but if we have two of the same 
	// activity and they try to delete the second one in the list then the first one will get deleted :/
	public void deleteActivity(Activity a)
	{
		activities.remove(a);
	}
	
	public void addActivity(Activity a) {
		activities.add(a);
	}
}