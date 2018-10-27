/******************************************************************************
 * File:    MoviePlayer.java
 * Author:  Alsu Saifetdinova
 * Class:   COP3003; 201809; 80601
 * Purpose: class MoviePlayer extends Product implements MultimediaControl.
 *          Sets screen size, MonitorTypeand MoviePlayer
 * Source:  Code written based on specifications provided in Oracle Academy's
 *          OraclProduction document. All rights for the document and
 *          specifications belong to Oracle.
 *******************************************************************************/

public class MoviePlayer extends Product implements MultimediaControl{

  private Screen screen;

  private MonitorType montiorType;

  public MoviePlayer(String name)

  {

    super(name);

    screen = new Screen("1024x768", 60, 10);

    montiorType = MonitorType.LCD;



  }



  public MoviePlayer(String name, Screen screen, MonitorType type)

  {

    super(name);

    this.screen = screen;

    this.montiorType = type;

  }



  @Override

  public void play() {

    System.out.println("Playing");

  }

  @Override

  public void stop() {

    System.out.println("Stopped");

  }

  @Override

  public void previous() {

    System.out.println("Previous");

  }

  @Override

  public void next() {

    System.out.println("Next");

  }



  public String toString()

  {

    return super.toString() +"\n" +

        screen.toString() + "\n" +

        "Monitor Type: "+montiorType;

  }



}