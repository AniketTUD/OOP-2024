package ie.tudublin;

import processing.core.PApplet;

public class myFirstProcessing extends PApplet
{

	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
		background(255, 0, 0);
	}
	
	public void draw()
	{
		fill(255, 255, 0);
		stroke(255, 255, 0);	
		circle(250, 325, 350);
		fill(0, 255, 255);
		stroke(0, 255, 255);
		triangle(250, 100, 50, 450, 450, 450);
		fill(250);
		stroke(250);
		ellipse(250, 250, 150, 75);
		fill(0);
		stroke(0);
		circle(250, 250, 50);
	}
}
