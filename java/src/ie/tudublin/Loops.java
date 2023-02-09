package ie.tudublin;

import processing.core.PApplet;

public class Loops extends PApplet {

	int mode = 0;

	public void settings() {
		size(1000, 1000);
	}

	float width = 1000;
	float height = 1000;

	public void setup() {
		colorMode(HSB);
	}

	public void keyPressed() {

		mode = key - '0';
		println(mode);
	}

	float offset = 0;

	public void draw() {
		background(255);
		noStroke();


		int circles = (int) (mouseX / 100.0f);
		float d = width / (float) circles;
		for (int j = 0; j < circles; j++) {
			for (int i = 0; i < circles; i++) {
				noStroke();
				float c = map((i + j + offset), 0, circles * 2, 0, 255) % 256;
				fill(c, 255, 255);
				float x = map(i, 0, circles - 1, d / 2.0f, width - (d / 2.0f));
				float y = map(j, 0, circles - 1, d / 2.0f, width - (d / 2.0f));
				fill(c + offset, 255, 255);
				circle(x, y, d);
			}
		}

		offset *= (mouseY / 50.0f);

	}
}
