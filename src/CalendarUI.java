import java.awt.Point;
import processing.core.PApplet;


public class CalendarUI 
{
	// FIELDS
	float x;
	float y;
	float width;
	float height;
	float colWidth;
	float rowHeight;
	// red, orange, yellow, green, light blue, dark blue, purple, pink
	int[] colorArray = new int[] {16711680, 16679424, 15790080, 5301840, 6605030, 3289850, 6553750, 16737535}; // not being used yet

	// CONSTRUCTOR
	public CalendarUI()
	{
		x = 40;
		y = 20;
		width = 0;
		height = 0;
	}
	
	// METHODS
	public void draw(DrawingSurface surface)
	{
		width = surface.width - 400;
		height = surface.height - 40;
	 	surface.fill(255);
	 	surface.stroke(0);
		surface.rect(x, y, width, height, 10);	
		surface.stroke(0,0,0);
		
		// draw columns
		colWidth = width/7;
		for(float x = this.x + colWidth; x < width; x+=colWidth)
		{
			surface.line(x, y, x, y + height);
		}
		// draws rows
		rowHeight = height/24;
		for(float y = this.y + rowHeight; y < height; y +=rowHeight) 
		{
			surface.line(x, y, x + width, y);
		}
		
		drawTimeAxis(surface);
		drawDayAxis(surface);
		
		for (Activity a : surface.getActivityList())
		{
			displayActivity(surface, a);
		}
		
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
		int x = 75; // starting x-position
		int xinterval = (int)width/7; // x-increment
		surface.text("Sunday", x, y);
		surface.text("Monday", x + xinterval, y);
		surface.text("Tuesday", x + 2 * xinterval, y);
		surface.text("Wednesday", x + 3 * xinterval, y);
		surface.text("Thursday", x + 4 * xinterval, y);
		surface.text("Friday", x + 5 * xinterval + 5, y);
		surface.text("Saturday", x + 6 * xinterval, y);
	}
	
	public boolean over(PApplet surface)
	{
		if (surface.mouseX >= x && surface.mouseX <= x + width && surface.mouseY >= y && surface.mouseY <= y + height) 
			return true;
		else 
			return false;
	}
	
	public Point mousePressed(PApplet surface)
	{
		return determineWhichGridWasPressed(surface);
	}

	public Point determineWhichGridWasPressed(PApplet surface)
	{
		System.out.println(surface.mouseX + ", " + surface.mouseY);
		int gridX = (int)((surface.mouseX - x) / colWidth);
		int gridY = (int)((surface.mouseY - y) / rowHeight);
		Point p = new Point(gridX, gridY);
		return p;
	}
	
	public void displayActivity(PApplet surface, Activity a)
	{
		String name = a.getTypeName();
		int day =  a.getDate().getDay(); // these have lines through them because the library is supposedly not supposed to be used
		int hour = a.getDate().getHours();
		int mins = a.getDate().getMinutes();
		//System.out.println("day: " + day + "hour: " + hour);
		surface.text(name, 75 + day * colWidth, 33 + hour * rowHeight + (rowHeight * mins / 60));
	}
}
