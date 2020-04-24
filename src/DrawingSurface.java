import java.awt.Point;

import javax.swing.*;
import processing.core.PApplet;

public class DrawingSurface extends PApplet
{
	// FIELDS
	RectButton r; 
	CalendarUI cal;
	
	// CONSTRUCTOR
	public DrawingSurface()
	{
		r = new RectButton(950, 100, 100, 100, 50, 100);  
		cal = new CalendarUI();
	}
	
	//METHODS
	public void draw()
	{
		if (1 == frameCount)
		{
			surface.setLocation(0,0);  // set window origin on screen to top left corner
		}
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
		ActivityPopUp popup = new ActivityPopUp();
		if (r.over(this))
		{
			popup.pop();
		}	
		else if (cal.over(this))
		{
			Point p = cal.mousePressed(this);
			int x = p.x;
			int y = p.y;
			// the x,y coordinate of of the grid needs to be converted to time and day adn then entered as a parameter to popup somehow
			popup.pop();
		}
	}
}