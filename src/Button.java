import processing.core.PApplet;

public class Button {
	// FIELDS
	int x, y;
	int width, height;
	int basecolor, highlightcolor;
	int currentcolor;
	boolean over = false;
	boolean pressed = false;

	public Button(int ix, int iy, int iwidth, int iheight, int icolor, int ihighlight) {
		x = ix;
		y = iy;
		width = iwidth;
		height = iheight;
		basecolor = icolor;
		highlightcolor = ihighlight;
		currentcolor = basecolor;
	}

	// METHODS
	public void draw(PApplet surface) {
	}
	
	
	public void update(PApplet surface) {
		if (over(surface)) {
			currentcolor = highlightcolor;
		}

		else {
			currentcolor = basecolor;
		}
	}

	public boolean pressed() {
		if (over) {
			// locked = true;
			return true;
		}

		else {
			// locked = false;
			return false;
		}
	}

	public boolean over(PApplet surface) {
		return true;
	}

	boolean overRect(PApplet surface, int x, int y, int width, int height)

	{

		if (surface.mouseX >= x && surface.mouseX <= x + width &&

				surface.mouseY >= y && surface.mouseY <= y + height) {

			return true;

		}

		else {

			return false;

		}

	}

	boolean overCircle(PApplet surface, int x, int y, int diameter)

	{

		float disX = x - surface.mouseX;

		float disY = y - surface.mouseY;

		if (Math.sqrt(PApplet.sq(disX) + PApplet.sq(disY)) < diameter / 2) {

			return true;

		}

		else {

			return false;
		}
	}



}
