import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import java.util.*;

public class Moon extends Planet
{
  //variables for moon class
  private double centreOfRotationDistance;
  private double centreOfRotationAngle;
  private double orbitalVelocity;

  public Moon(double distance, double angle, double diameter, String col, double centreOfRotationDistance, double centreOfRotationAngle, double orbitalVelocity)
  {
    this.setDistance(distance);
    this.setAngle(angle);
    this.setDiameter(diameter);
    this.col = col;
    this.centreOfRotationDistance = centreOfRotationDistance;
    this.centreOfRotationAngle = centreOfRotationAngle;
    this.orbitalVelocity = orbitalVelocity;
    this.parentPlanet = parentPlanet;
  }
  //methods for moon implementatiion and behaviour
  public void addMoon(Planet p)
  {
    ss.drawSolarObjectAbout(p.getDistance(), p.getAngle(), diameter, col, centreOfRotationDistance, centreOfRotationAngle);
  }

  public void moveLunar()
  {
    centreOfRotationAngle += orbitalVelocity;
  }

}
