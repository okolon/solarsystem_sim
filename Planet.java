import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import java.util.*;

public class Planet extends AstroBody
{
  //variables for this class and potential sub-classes
  private double orbitalVelocity;
  public Planet parentPlanet;
  //planet constructor
  public Planet(double distance, double angle, double diameter, String col, double orbitalVelocity)
  {
    this.distance = distance;
    this.angle = angle;
    this.diameter = diameter;
    this.col = col;
    this.orbitalVelocity = orbitalVelocity;
  }
  //methods for behaviour and implementation
  public void addPlanet()
  {
    ss.drawSolarObject(distance, angle, diameter, col);
  }

  public void move()
  {
    angle += orbitalVelocity;
  }

  public Planet()
  {
  }

  public void setParentPlanet(Planet parentPlanet)
  {
    this.parentPlanet = parentPlanet;
  }

}
