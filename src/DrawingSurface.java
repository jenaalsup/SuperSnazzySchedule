import processing.core.PApplet;

public class DrawingSurface extends PApplet
{
	// FIELDS
	RectButton r; 
	CalendarUI cal;
	
	// CONSTRUCTOR
	public DrawingSurface()
	{
		r = new RectButton(900, 100, 100, 50, 100);  
		cal = new CalendarUI();
	}
	
	//METHODS
	public void draw()
	{
		if (1 == frameCount)
			surface.setLocation(10,10);  // set window origin on screen to top left corner
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
			// needs to be implemented
		}
		
	}


}


