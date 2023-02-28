package ie.tudublin;

import ddf.minim.AudioBuffer;
import ddf.minim.AudioInput;
import ddf.minim.AudioPlayer;
import ddf.minim.Minim;
import processing.core.PApplet;

float lerpedBuffer;

public class Audio2 extends PApplet
{
    Minim minim;
    AudioPlayer ap;
    AudioInput ai;
    AudioBuffer ab;
    lerpedBuffer = new float(width);


    public void settings()
    {
        size(1024, 1024);
    }

    public void setup()
    {
        minim = new Minim(this);  
        ai = minim.getLineIn(Minim.MONO, width, 44100, 16);
        ab = ai.mix;
    }


    public void draw()
    {
        background(0);
        float half = height / 2;
        for (int i = 0; i < ab.size(); i++) 
        {
            stroke(map(i, 0, ab.size(), 0, 255), 255, 255);
            //lerpedBuffer[i] = lerp(lerpedBuffer[i], ab.get(i), 0.05f);
            line(i, half, i, half + ab.get(i) * half);
        }
    }        
    
}
