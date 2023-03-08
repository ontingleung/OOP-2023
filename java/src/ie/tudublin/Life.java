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

	public void keyPressed() {
		switch (key) {
			case 1:

				
				break;
			
			case 2:

				
				break;
			
			case 3:

				
				break;
		
			default:
			
				break;
		}

	}

	public void draw()
	{	
		background(255);
		board.render();
		board.applyRules();
		
	}
}
