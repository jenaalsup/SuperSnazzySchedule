import processing.core.PApplet;

public class RectButton extends Button
{
	// CONSTRUCTOR
	  public RectButton(int ix, int iy, int iwidth, int iheight, int icolor, int ihighlight)
	  {
		  super(ix, iy, iwidth, iheight, icolor, ihighlight);
	  }

	  // METHODS
	  public boolean over(PApplet surface) 
	  {
	    if(overRect(surface, x, y, width, height)) 
	    {
	      over = true;
	      return true;
	    } 
	    else 
	    {
	      over = false;
	      return false;
	    }
	  }

	 public void draw(PApplet surface) 

	  {
	    surface.stroke(255);
	    surface.fill(currentcolor);
	    surface.rect(x, y, width, height);
	  }
	}