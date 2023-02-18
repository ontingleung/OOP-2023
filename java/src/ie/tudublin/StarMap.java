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
		
		smooth();

	}

	public void draw()
	{	

	}
}
