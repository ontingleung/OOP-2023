package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;

public class StarMap extends PApplet
{
	ArrayList<Star> stars = new ArrayList<Star>();

	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
		colorMode(RGB);
		background(0);
		stroke(221,160,221);
		smooth();

	}

	public void loadData() {

	}

	public void drawGrid() {
		float border = width * 0.1f;
		float lines = 10.0f;
		float gap = (width - (border*2.0f)) / lines; 


		for(int i = -5; i <= 5; i++) {
			float x = border + (gap * (i+5));
			float y = border;
			line(x, y, x, height - border);
			line(y, x, width - border, x);

			textAlign(CENTER, CENTER);
			text(i, x, gap * 0.5f);
			text(i, gap * 0.5f, x);
		}
	}

	public void draw() {	
		strokeWeight(2);

		drawGrid();
	}

}
