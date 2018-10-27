/******************************************************************************
 * File:    ScreenSpec.java
 * Author:  Alsu Saifetdinova
 * Class:   COP3003; 201809; 80601
 * Purpose: interface ScreenSpec is defined 3 methods and will be 
 *          implemented in Screen class
 * Source:  Code written based on specifications provided in Oracle Academy's
 *          OraclProduction document. All rights for the document and
 *          specifications belong to Oracle.
 *******************************************************************************/

public interface ScreenSpec {

  public String getResolution();

  public int getRefreshRate();

  public int getResponseTime();

}