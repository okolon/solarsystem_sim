import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import java.util.*;
//Sun class
public class Sun extends AstroBody
{
  //Sun constructor
  public Sun(double distance, double angle, double diameter, String col)
  {
    this.distance = distance;
    this.angle = angle;
    this.diameter = diameter;
    this.col = col;
  }
  //one method to add sun
  public void addSun()
  {
    ss.drawSolarObject(distance, angle, diameter, col);
  }
}
