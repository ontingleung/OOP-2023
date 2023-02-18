package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

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
		
		loadStars();
		printStars();
		displayStars();

	}

	void printStars() {
		for(int i = 0; i < stars.size(); i++){
			println(stars.get(i));
		}
	}

	void displayStars() {
		for(int i = 0; i < stars.size(); i++){
			stars.get(i).render(this);
		}
	}

	public void loadStars() {
		Table table = loadTable("HabHYG15ly.csv", "header");
		for (TableRow row: table.rows()) {
			Star s = new Star(row);
			stars.add(s);
			
		}
	}

	public void drawGrid() {
		stroke(0, 255, 255);
		float border = width * 0.1f;

		for(int i = -5 ; i <= 5 ; i ++)
		{
			float x = map(i, -5, 5, border, width - border);
			line(x, border, x, height - border);
			line(border, x, width - border, x);

			textAlign(CENTER, CENTER);
			text(i, x, border * 0.5f);
			text(i, border * 0.5f, x);
		}
	}

	public void draw() {	
		strokeWeight(2);

		drawGrid();
	}

}
