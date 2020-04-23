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
		float width = surface.width - 400;
		float height = surface.height - 40;
	 	surface.fill(255);
		surface.rect(20, 20, width, height, 40);	
		surface.stroke(0,0,0);
		for(float x = 20 + (width/7); x < width; x+=(width/7)) { // draws columns
			surface.line(x, 20, x, 20 + height);
		}
		for(float y = 20 + (height/24); y < height; y +=(height/24)) { // draws rows
			surface.line(20, y, 20 + width, y);
		}
		
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
