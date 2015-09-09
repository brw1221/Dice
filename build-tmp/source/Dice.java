import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Dice extends PApplet {

Die one;
public void setup()
{
	size(510,510);
	noLoop();
	textAlign(CENTER);
}
public void draw()
{	
	background(0);
	int numRoll = 0;
	for(int y = 3; y< 470; y=y+23)
	{
		for(int x = 3; x < 490; x=x+23)
		{
			one = new Die(x,y);
			one.show();
			one.roll();
			numRoll = numRoll + one.num;
		}
	}
	fill(255);
	textSize(15);
	 text("Your roll: " + numRoll, 255,499);
}
public void mousePressed()
{
	redraw();
}
class Die
{
	int myX, myY, num;
	Die(int x, int y) //constructor
	{
		myX = x;
		myY =y;
		num = (int)((Math.random()*6)+1);

	}
	public void roll()
	{
		
		if(num == 1)
		{
			fill(0);
			ellipse(myX + 10,myY + 10,3,3);
		}
		else if(num == 2)
		{
			fill(0);
			ellipse(myX+5, myY+5, 3,3);
			ellipse(myX+15, myY+15,3,3);
		}
		else if(num == 3)
		{
			fill(0);
			ellipse(myX + 10,myY + 10,3,3);
			ellipse(myX+5, myY+5, 3,3);
			ellipse(myX+15, myY+15,3,3);
		}
		else if(num == 4)
		{
			fill(0);
			ellipse(myX+5,myY+5,3,3);
			ellipse(myX+5,myY+15,3,3);
			ellipse(myX+15,myY+5,3,3);
			ellipse(myX+15,myY+15,3,3);
		}
		else if(num == 5)
		{
			fill(0);
			ellipse(myX+5,myY+5,3,3);
			ellipse(myX+5,myY+15,3,3);
			ellipse(myX+15,myY+5,3,3);
			ellipse(myX+15,myY+15,3,3);
			ellipse(myX+10,myY+10,3,3);
		}
		else if(num == 6)
		{
			fill(0);
			ellipse(myX+5,myY+5,3,3);
			ellipse(myX+5,myY+10,3,3);
			ellipse(myX+5,myY+15,3,3);
			ellipse(myX+15,myY+5,3,3);
			ellipse(myX+15,myY+10,3,3);
			ellipse(myX+15,myY+15,3,3);

		}
	}
	public void show()
	{
		fill(255);
		rect(myX, myY, 20, 20);
	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Dice" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
