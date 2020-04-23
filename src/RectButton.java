import processing.core.PApplet;

public class RectButton extends Button
{
	  public RectButton(int ix, int iy, int isize, int icolor, int ihighlight) 

	  {

	    x = ix;

	    y = iy;

	    size = isize;

	    basecolor = icolor;

	    highlightcolor = ihighlight;

	    currentcolor = basecolor;

	  }


	  public boolean over(PApplet surface) 

	  {

	    if(overRect(surface, x, y, size, size) ) {

	      over = true;

	      return true;

	    } 

	    else {

	      over = false;

	      return false;

	    }

	  }



	  void draw(PApplet surface) 

	  {

	    surface.stroke(255);

	    surface.fill(currentcolor);

	    surface.rect(x, y, size, size);

	  }

	}