package ie.tudublin;

import processing.core.PApplet;

public class Life extends PApplet
{

	LifeBoard board;
	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
		colorMode(RGB);
		background(0);
		board = new LifeBoard(100, this);
		board.randomise();
	}

	boolean paused = false;
	public void keyPressed() {
		if (keyCode == ' ')
        {
            paused = ! paused;
        }

	}

	public void draw()
	{	
		background(255);
		board.render();
		board.applyRules();
		
	}
}
