package ie.tudublin;

import ddf.minim.AudioBuffer;
import ddf.minim.AudioInput;
import ddf.minim.AudioPlayer;
import ddf.minim.Minim;
import processing.core.PApplet;

public class Audio1 extends PApplet
{
	
	Minim minim; 
	AudioInput ai; //microphone
	AudioPlayer ap;
	AudioBuffer ab;
	
	public void settings()
	{
		size(1024, 500);
	}

	int frameSize = 1024;


	public void setup() {
		colorMode(HSB);
		background(0);

		minim = new Minim(this);

		ai = minim.getLineIn(Minim.MONO, frameSize, 44100, 16); // (int type, int bufferSize, float sampleRate, int bitDepth)
 
		ab = ai.mix;

	
		smooth();
		
	}
	
	public void draw()
	{	
		background(0);
		stroke(255);

		float half = height / 2;
		float cgap = 255 / (float)ab.size();

		float total = 0;
		for (int i = 0; i < ab.size(); i++) {

			total += abs(ab.get(i));
			stroke(cgap * i, 255, 255);
			line(i, half, i, half + ab.get(i) * half);
			//circle(height / 2 ,width / 2,abs( half + ab.get(i)));
		}

		float average = total / (float)ab.size();

		float r = average * 200;

		circle(100, 200, r);

		lerpedR = lerp(lerpedR, r, 0.1f);
	}

	float lerp1(float a, float b, float t) {
		return a + (b - a) * t;
	}

	float lerpedR = 0;
}
