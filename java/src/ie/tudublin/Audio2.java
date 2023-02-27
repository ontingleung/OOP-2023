package ie.tudublin;

import ddf.minim.AudioBuffer;
import ddf.minim.AudioInput;
import ddf.minim.AudioPlayer;
import ddf.minim.Minim;
import processing.core.PApplet;

public class Audio2 extends PApplet
{
    Minim m;
    AudioPlayer ap;
    AudioInput ai;
    AudioBuffer ab;


    public void settings()
    {
        size(1024, 1024, PSD);
    }

    public void setup()
    {
        m = new Minim(this);  
        ai = m.getLineIn(Minim.MONO, width, 44100, 16);
        ab = ai.mix;
    }


    public void draw()
    {
        background(0);
        float half = height / 2;
        for (int i = 0; i < ab.size(); i++) 
        {
            line(i, half, i, half + ab.get(i) * half);
        }
    }        
    static public final float map(float value, float istart, float istop, float ostart, float ostop) {
        return ostart + (ostop - ostart) * ((value - istart) / (istop - istart));
  }
}
