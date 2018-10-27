/******************************************************************************
 * File:    AudioPlayer.java
 * Author:  Alsu Saifetdinova
 * Class:   COP3003; 201809; 80601
 * Purpose: class Screen implements ScreenSpec
 * Source:  Code written based on specifications provided in Oracle Academy's
 *          OraclProduction document. All rights for the document and
 *          specifications belong to Oracle.
 *******************************************************************************/

public class Screen implements ScreenSpec {

  protected String resolution;

  protected int refreshrate;

  protected int responsetime;



  public Screen(String resolution, int refreshrate, int responsetime)

  {

    this.resolution = resolution;

    this.refreshrate = refreshrate;

    this.responsetime = responsetime;

  }

  @Override

  public String getResolution() {

    return resolution;

  }

  @Override

  public int getRefreshRate() {

    return refreshrate;

  }

  @Override

  public int getResponseTime() {

    return responsetime;

  }

  public String toString()

  {

    return "Resolution: " + resolution + "\n" +

        "Refresh Rate: " + refreshrate + "\n" +

        "Response Time: " + responsetime ;

  }

}