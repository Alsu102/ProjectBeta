
/******************************************************************************
 * File:    Item.java
 * Author:  Alsu Saifetdinova
 * Class:   COP3003; 201809; 80601
 * Purpose: Interface that will force all classes to implement the functions
 *          below.
 * Source:  Code written based on specifications provided in Oracle Academy's
 *          OraclProduction document. All rights for the document and
 *          specifications belong to Oracle.
 *******************************************************************************/
import java.util.Date;

// Interface that contains the functions all items must have.

public interface Item {

  public final String manufacturer = "OracleProduction";

  // Sets the production number of the item.
  public void setProductionNumber(int productionNumber);


  // Sets the name of the item.
  public void setName(String name);

  //Gets the name of the item.
  public String getName();

  //Gets the manufacture date of the item.

  public Date getManufactureDate();


  public int getSerialNumber();

}
