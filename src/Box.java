
public class Box 
{
	// FIELDS
	public int x;
	public int y;
	public int width;
	public int height;

	// CONSTRUCTORS
	public Box()
	{
		x = 0; y = 0; width = 0; height = 0;
	}
	
	public Box(int x, int y, int width, int height)
	{
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	// METHOD
	public boolean pointIn(int x, int y)
	{
		if (x >= this.x && y >= this.y && x <= this.x + width && y <= this.y + height)
			return true;
		else
			return false;
	}
}
