import processing.core.PApplet;
import processing.event.MouseEvent;

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
		surface.rect(40, 20, width, height, 40);	
		surface.stroke(0,0,0);
		
		// draw columns
		for(float x = 20 + (width/7); x < width; x+=(width/7))
		{
			surface.line(x, 20, x, 20 + height);
		}
		// draws rows
		for(float y = 20 + (height/24); y < height; y +=(height/24)) 
		{
			surface.line(40, y, 40 + width, y);
		}
		
		drawTimeAxis(surface);
		drawDayAxis(surface);
	}

	public void drawTimeAxis(PApplet surface)
	{
		surface.fill(20);
		int x = 5; // constant
		int y = 33; // starting y-position
		int yinterval = 27; // y-increment
		surface.text("8 AM", x, y);
		surface.text("9 AM", x, y + yinterval);
		surface.text("10 AM", x-3, y + 2 * yinterval);
		surface.text("11 AM", x-3, y + 3 * yinterval);
		surface.text("12 PM", x-3, y + 4 * yinterval);
		surface.text("1 PM", x, y + 5 * yinterval);
		surface.text("2 PM", x, y + 6 * yinterval);
		surface.text("3 PM", x, y + 7 * yinterval);
		surface.text("4 PM", x, y + 8 * yinterval);
		surface.text("5 PM", x, y + 9 * yinterval);
		surface.text("6 PM", x, y + 10 * yinterval);
		surface.text("7 PM", x, y + 11 * yinterval);
		surface.text("8 PM", x, y + 12 * yinterval);
		surface.text("9 PM", x, y + 13 * yinterval);
		surface.text("10 PM", x-3, y + 14 * yinterval);
		surface.text("11 PM", x-3, y + 15 * yinterval);
		surface.text("12 AM", x-3, y + 16 * yinterval);
		surface.text("1 AM", x, y + 17 * yinterval);
		surface.text("2 AM", x, y + 18 * yinterval);
		surface.text("3 AM", x, y + 19 * yinterval);
		surface.text("4 AM", x, y + 20 * yinterval);
		surface.text("5 AM", x, y + 21 * yinterval);
		surface.text("6 AM", x, y + 22 * yinterval);
		surface.text("7 AM", x, y + 23 * yinterval);
	}
	
	public void drawDayAxis(PApplet surface)
	{
		surface.fill(20);
		int y = 15; // constant
		int x = 70; // starting x-position
		int xinterval = 120; // x-increment
		surface.text("Sunday", x, y);
		surface.text("Monday", x + xinterval - 5, y);
		surface.text("Tuesday", x + 2 * xinterval - 3, y);
		surface.text("Wednesday", x + 3 * xinterval - 5, y);
		surface.text("Thursday", x + 4 * xinterval, y);
		surface.text("Friday", x + 5 * xinterval + 13, y);
		surface.text("Saturday", x + 6 * xinterval + 13, y);
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
