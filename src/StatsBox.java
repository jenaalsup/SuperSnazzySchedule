
public class StatsBox 
{
	// FIELDS
	private float x;
	private float y;
	private float width;
	private float height;
	private int ybegin; // used for drawing the bars
	private int xInterval; 
	private int yInterval; // used for drawing the bars
	String[] colorArray = new String[] {"255,0,0", "254,130,0", "240,240,0", "80,230,80", "100,200,230", "50,50,250", "100,0,150", "255,100,255"}; // not being used yet
	String[] activities = {"Exercise", "Leisure", "Meal", "School", "Sleep", "Work", "Call", "Other"};

	
	// CONSTRUCTOR
	public StatsBox()
	{
		x = 935;
		y = 347;
		width = 310;
		height = 310;
		ybegin = 370;
		xInterval = 35;
		yInterval = 23;		
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
		surface.textSize(11);
		surface.text("Exe.    Lei.    Meal   Sch.    Sle.    Work   Call    Oth.", x + 30, y + 20);
		int xyInterval = 7;
		int ystart = (int)y + 46;
		int yyInterval = 23;
		surface.text("1", x + xyInterval, ystart);
		surface.text("2", x + xyInterval, ystart + yyInterval);
		surface.text("3", x + xyInterval, ystart + 2 * yyInterval);
		surface.text("4", x + xyInterval, ystart + 3 * yyInterval);
		surface.text("5", x + xyInterval, ystart + 4 * yyInterval);
		surface.text("6", x + xyInterval, ystart + 5 * yyInterval);
		surface.text("7", x + xyInterval, ystart + 6 * yyInterval);
		surface.text("8", x + xyInterval, ystart + 7 * yyInterval);
		surface.text("9", x + xyInterval, ystart + 8 * yyInterval);
		surface.text("10", x + xyInterval - 3, ystart + 9 * yyInterval);
		surface.text("11", x + xyInterval - 3, ystart + 10 * yyInterval);
		surface.text("12+", x + xyInterval - 3, ystart + 11 * yyInterval);
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

		String color = "";
		
		for(int i = 0; i < activities.length; i++) { // finds color match for array
			String s = activities[i];
			if(s.equals("Exercise"))
				color = colorArray[i];
		}
		
		int r = Integer.parseInt(color.substring(0, color.indexOf(',')));
		int g = Integer.parseInt(color.substring(color.indexOf(',') + 1, color.lastIndexOf(',')));
		int b = Integer.parseInt(color.substring(color.lastIndexOf(',') + 1));		

		if (count >= 12)
			count = 12;
		surface.fill(r,g,b);
		surface.rect(x + 33, (float)ybegin, 15f, (float)(yInterval * count));
	}
	
	public void drawLeisureBar(DrawingSurface surface)
	{
		double count = 0;
		for (Activity a : surface.getActivityList())
		{
			if (a.getTypeName().equals("Leisure"))
			{
				count += a.getDuration();
			}
		}
		String color = "";
		
		for(int i = 0; i < activities.length; i++) { // finds color match for array
			String s = activities[i];
			if(s.equals("Leisure"))
				color = colorArray[i];
		}
		
		int r = Integer.parseInt(color.substring(0, color.indexOf(',')));
		int g = Integer.parseInt(color.substring(color.indexOf(',') + 1, color.lastIndexOf(',')));
		int b = Integer.parseInt(color.substring(color.lastIndexOf(',') + 1));		

		surface.fill(r,g,b);	
		if (count >= 12)
			count = 12;
		surface.rect(x + xInterval + 33, (float)ybegin, 15f, (float)(yInterval * count));
	}
	
	public void drawMealBar(DrawingSurface surface)
	{
		double count = 0;
		for (Activity a : surface.getActivityList())
		{
			if (a.getTypeName().equals("Meal"))
			{
				count += a.getDuration();
			}
		}
		String color = "";
		
		for(int i = 0; i < activities.length; i++) { // finds color match for array
			String s = activities[i];
			if(s.equals("Meal"))
				color = colorArray[i];
		}
		
		int r = Integer.parseInt(color.substring(0, color.indexOf(',')));
		int g = Integer.parseInt(color.substring(color.indexOf(',') + 1, color.lastIndexOf(',')));
		int b = Integer.parseInt(color.substring(color.lastIndexOf(',') + 1));		

		if (count >= 12)
			count = 12;
		surface.fill(r,g,b);
		surface.rect(x + xInterval * 2 + 33, (float)ybegin, 15f, (float)(yInterval * count));
	}
	
	public void drawSchoolBar(DrawingSurface surface)
	{
		double count = 0;
		for (Activity a : surface.getActivityList())
		{
			if (a.getTypeName().equals("School"))
			{
				count += a.getDuration();
			}
		}
		String color = "";
		
		for(int i = 0; i < activities.length; i++) { // finds color match for array
			String s = activities[i];
			if(s.equals("School"))
				color = colorArray[i];
		}
		
		int r = Integer.parseInt(color.substring(0, color.indexOf(',')));
		int g = Integer.parseInt(color.substring(color.indexOf(',') + 1, color.lastIndexOf(',')));
		int b = Integer.parseInt(color.substring(color.lastIndexOf(',') + 1));		

		if (count >= 12)
			count = 12;
		surface.fill(r,g,b);
		surface.rect(x + xInterval * 3 + 33, (float)ybegin, 15f, (float)(yInterval * count));
	}
	
	public void drawSleepBar(DrawingSurface surface)
	{
		double count = 0;
		for (Activity a : surface.getActivityList())
		{
			if (a.getTypeName().equals("Sleep"))
			{
				count += a.getDuration();
			}
		}
		String color = "";
		
		for(int i = 0; i < activities.length; i++) { // finds color match for array
			String s = activities[i];
			if(s.equals("Sleep"))
				color = colorArray[i];
		}
		
		int r = Integer.parseInt(color.substring(0, color.indexOf(',')));
		int g = Integer.parseInt(color.substring(color.indexOf(',') + 1, color.lastIndexOf(',')));
		int b = Integer.parseInt(color.substring(color.lastIndexOf(',') + 1));		

		if (count >= 12)
			count = 12;
		surface.fill(r,g,b);
		surface.rect(x + xInterval * 4 + 33, (float)ybegin, 15f, (float)(yInterval * count));
	}
	
	public void drawWorkBar(DrawingSurface surface)
	{
		double count = 0;
		for (Activity a : surface.getActivityList())
		{
			if (a.getTypeName().equals("Work"))
			{
				count += a.getDuration();
			}
		}
		String color = "";
		
		for(int i = 0; i < activities.length; i++) { // finds color match for array
			String s = activities[i];
			if(s.equals("Work"))
				color = colorArray[i];
		}
		
		int r = Integer.parseInt(color.substring(0, color.indexOf(',')));
		int g = Integer.parseInt(color.substring(color.indexOf(',') + 1, color.lastIndexOf(',')));
		int b = Integer.parseInt(color.substring(color.lastIndexOf(',') + 1));		

		if (count >= 12)
			count = 12;
		surface.fill(r,g,b);
		surface.rect(x + xInterval * 5 + 33, (float)ybegin, 15f, (float)(yInterval * count));
	}
	
	public void drawCallBar(DrawingSurface surface)
	{
		double count = 0;
		for (Activity a : surface.getActivityList())
		{
			if (a.getTypeName().equals("Call"))
			{
				count += a.getDuration();
			}
		}
		String color = "";
		
		for(int i = 0; i < activities.length; i++) { // finds color match for array
			String s = activities[i];
			if(s.equals("Call"))
				color = colorArray[i];
		}
		
		int r = Integer.parseInt(color.substring(0, color.indexOf(',')));
		int g = Integer.parseInt(color.substring(color.indexOf(',') + 1, color.lastIndexOf(',')));
		int b = Integer.parseInt(color.substring(color.lastIndexOf(',') + 1));		

		if (count >= 12)
			count = 12;
		surface.fill(r,g,b);
		surface.rect(x + xInterval * 6 + 33, (float)ybegin, 15f, (float)(yInterval * count));
	}
	
	public void drawOtherBar(DrawingSurface surface)
	{
		double count = 0;
		for (Activity a : surface.getActivityList())
		{
			if (a.getTypeName().equals("Other"))
			{
				count += a.getDuration();
			}
		}
		String color = "";
		
		for(int i = 0; i < activities.length; i++) { // finds color match for array
			String s = activities[i];
			if(s.equals("Other"))
				color = colorArray[i];
		}
		
		int r = Integer.parseInt(color.substring(0, color.indexOf(',')));
		int g = Integer.parseInt(color.substring(color.indexOf(',') + 1, color.lastIndexOf(',')));
		int b = Integer.parseInt(color.substring(color.lastIndexOf(',') + 1));		

		if (count >= 12)
			count = 12;
		surface.fill(r,g,b);
		surface.rect(x + xInterval * 7 + 33, (float)ybegin, 15f, (float)(yInterval * count));
	}
}
