import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import java.util.*;
//class for all the bodies in my solar system
public class AstroBody 
{
  public double xPosition;
  public double yPosition;
  public double distance;
  public double angle;
  public double diameter;
  public String col;
  public static SolarSystem ss = new SolarSystem(1700, 900);


  //methods every astral body should be able to use
  public double getXPosition()
	{
		return xPosition;
	}

  public double getYPosition()
	{
		return yPosition;
	}

  public double getAngle()
  {
    return angle;
  }

  public double getDiameter()
  {
    return diameter;
  }

  public double getDistance()
  {
    return distance;
  }

  public void setDistance(double d)
  {
    distance = d;
  }

  public void setAngle(double a)
  {
    angle = a;
  }

  public void setDiameter(double dia)
  {
    diameter = dia;
  }
}
