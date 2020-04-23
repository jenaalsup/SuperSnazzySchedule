import processing.core.PApplet;

public class CalendarUI 
{
	// CONSTRUCTOR
	public CalendarUI()
	{
		
	}
	
	// METHODS
	public void draw(PApplet surface)
	{
	 	surface.fill(255);
		surface.rect(20, 20, surface.width - 400, surface.height - 40, 40);	
		// Draw Lines to represent calendar grid, columns is day of the week, rows is time by the hour
		// Add headings/titles for day of the week and time on both axes
	}

	public void mousePressed()
	{
		int a = determineWhichGridWasPressed(); // ???
	}

	public int determineWhichGridWasPressed() // ???
	{
		return 0;
	}
}
