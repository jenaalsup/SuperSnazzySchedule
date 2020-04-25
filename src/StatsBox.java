
public class StatsBox 
{
	// FIELDS
	private float x;
	private float y;
	private float width;
	private float height;
	private int ybegin; // used for drawing the bars
	private int interval; // used for drawing the bars
	
	// CONSTRUCTOR
	public StatsBox()
	{
		x = 935;
		y = 347;
		width = 310;
		height = 310;
		ybegin = 370;
		interval = 23;		
	}
	
	// METHODS
	public void draw(DrawingSurface surface)
	{
	 	surface.fill(255);
	 	surface.stroke(0);
		surface.rect(x, y, width, height, 10);
		surface.line(940, 370, 1240, 370);
		drawHeadings(surface);
		drawExerciseBar(surface);
		drawLeisureBar(surface);
		drawMealBar(surface);
		drawSchoolBar(surface);
		drawSleepBar(surface);
		drawWorkBar(surface);
		drawCallBar(surface);
		drawOtherBar(surface);
	}
	
	// this maxes out at 12 hours so if some activities go for longer than 12 hours then they will just stop at the bottom of the box
	public void drawHeadings(DrawingSurface surface)
	{
		surface.fill(0);
		surface.textSize(12);
		surface.text("Exer.  Leis.  Meal  School  Sleep  Work  Call  Other", x + 20, y + 20);
		int xinterval = 7;
		int ystart = (int)y + 46;
		int yinterval = 23;
		surface.text("1", x + xinterval, ystart);
		surface.text("2", x + xinterval, ystart + yinterval);
		surface.text("3", x + xinterval, ystart + 2 * yinterval);
		surface.text("4", x + xinterval, ystart + 3 * yinterval);
		surface.text("5", x + xinterval, ystart + 4 * yinterval);
		surface.text("6", x + xinterval, ystart + 5 * yinterval);
		surface.text("7", x + xinterval, ystart + 6 * yinterval);
		surface.text("8", x + xinterval, ystart + 7 * yinterval);
		surface.text("9", x + xinterval, ystart + 8 * yinterval);
		surface.text("10", x + xinterval - 3, ystart + 9 * yinterval);
		surface.text("11", x + xinterval - 3, ystart + 10 * yinterval);
		surface.text("12", x + xinterval - 3, ystart + 11 * yinterval);
	}
	
	public void drawExerciseBar(DrawingSurface surface)
	{
		double count = 0;
		for (Activity a : surface.getActivityList())
		{
			if (a.getTypeName().equals("Exercise"))
			{
				count += a.getDuration();
			}
		}
		// need to set fill color to red
		surface.rect(950f, (float)ybegin, 15f, (float)(ybegin + interval * count));
	}
	
	public void drawLeisureBar(DrawingSurface surface)
	{
		
	}
	
	public void drawMealBar(DrawingSurface surface)
	{
		
	}
	
	public void drawSchoolBar(DrawingSurface surface)
	{
		
	}
	
	public void drawSleepBar(DrawingSurface surface)
	{
		
	}
	
	public void drawWorkBar(DrawingSurface surface)
	{
		
	}
	
	public void drawCallBar(DrawingSurface surface)
	{
		
	}
	
	public void drawOtherBar(DrawingSurface surface)
	{
		
	}
}
