package ie.tudublin;

import processing.core.PApplet;

public class Loops extends PApplet {

	int mode = 0;
	public void settings() {
		size(1000, 1000);
	}

	public void setup() {
		background(255, 0, 0);
	}



	public void keyPressed() {
		
		mode = key - '0';
		println(mode);
	}

	public void draw() {
		background(255);
		fill(255);
		
		for(int i = 10; i < 10; i++) {
			for(int j = 10; j < 10; j++) {
				colorMode(HSB);
				circle((10*i), (10*j), 100);
			}
		}
		

	}
}
