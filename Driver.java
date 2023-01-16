import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import java.util.*;

public class Driver extends AstroBody
{ 
  //main method
  public static void main(String[] Args)
  {
    //creating the planets using Planet constructor
    Planet mercury = new Planet(140, 90, 15, "MAGENTA", 2.5);
    Planet venus = new Planet(180, 40, 25, "ORANGE", 2);
    Planet earth = new Planet(230, 50, 40, "BLUE", 1.5);
    Planet mars = new Planet(300, 60, 45, "RED", 1.5);
    Planet jupiter = new Planet(390, 60, 70, "GREY", 1);
    Planet saturn = new Planet(460, 30, 80, "ORANGE", 1);
    Planet neptune = new Planet(540, 60, 80, "BLUE", 1);
    Planet uranus = new Planet(600, 40, 60, "WHITE", 1);

    Sun sol = new Sun(0, 0, 200, "YELLOW");

    Moon luna = new Moon(30, 40, 10, "WHITE", 30, 40, 2);
    Moon luna2 = new Moon(30, 10, 10, "WHITE", 30, 10, 2);

    Moon luna3 = new Moon(50, 20, 10, "WHITE", 50, 20, 2);
    Moon luna4 = new Moon(50, 30, 10, "WHITE", 50, 30, 2);
    Moon luna5 = new Moon(50, 70, 10, "WHITE", 50, 70, 2);
    Moon luna6 = new Moon(50, 60, 10, "WHITE", 50, 60, 2);


    while (true)
    {
      sol.addSun();
      //adding planets and applying behaviours to them
      mercury.addPlanet();
      mercury.move();
      venus.addPlanet();
      venus.move();
      earth.addPlanet();
      earth.move();
      mars.addPlanet();
      mars.move();
      saturn.addPlanet();
      saturn.move();
      jupiter.addPlanet();
      jupiter.move();
      neptune.addPlanet();
      neptune.move();
      uranus.addPlanet();
      uranus.move();

      luna.addMoon(earth);

      luna.addMoon(mars);
      luna2.addMoon(mars);
      luna.moveLunar();
      luna2.moveLunar();
      

      luna3.addMoon(jupiter);
      luna4.addMoon(jupiter);
      luna5.addMoon(jupiter);
      luna6.addMoon(jupiter);
      luna3.moveLunar();
      luna4.moveLunar();
      luna5.moveLunar();
      luna6.moveLunar();

      luna3.addMoon(saturn);
      luna4.addMoon(saturn);
      luna5.addMoon(saturn);
      luna3.moveLunar();
      luna4.moveLunar();
      luna5.moveLunar();

      luna3.addMoon(neptune);
      luna4.addMoon(neptune);
      luna3.moveLunar();
      luna4.moveLunar();

      ss.finishedDrawing();
    }
  }
}
