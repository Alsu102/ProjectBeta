publ/******************************************************************************
 * File:    Product.java
 * Author:  Alsu Saifetdinova
 * Class:   COP3003; 201809; 80601
 * Purpose: Abstract class that implements the Item interface. Product
 *          implements the functionality that all items should have
 * Source:  Code written based on specifications provided in Oracle Academy's
 *          OraclProduction document. All rights for the document and
 *          specifications belong to Oracle.
 *******************************************************************************/

import java.util.Date;

// Abstract class that implements the Item interface.

public abstract class Product implements Item, Comparable<Product> {

  private int serialNumber;
  private String manufacturer = Item.manufacturer;
  private Date manufacturedOn;
  private String name;

  private static int currentProductionNumber = 1;


  // Constructor that takes in the name of the product and sets it to the field variable name. It
  //also assigns the variable serialNumber to another variable. Additionally, it increments
  //currentProductionNumber and sets the current date and time to a variable.

  public Product(String paName) {
    name = paName;
    serialNumber = currentProductionNumber; //Picks up as a bug, but was part of the instructions
    currentProductionNumber++;
    manufacturedOn = new Date();
  }


  // Sets the production number of an item.

  public void setProductionNumber(int productionNumber) {
    currentProductionNumber = productionNumber;
  }


  // Sets the name of an item.

  public void setName(String n) {
    name = n;
  }


  //Gets the name of the item.

  public String getName() {

    return name;
  }

  @Override
  public int compareTo(Product o) {
    return name.compareTo(o.getName());
  }


  //Gets the manufacture date of the item.

  public Date getManufactureDate() {

    return manufacturedOn; // Picks up as a bug, but was part of instructions.
  }


  // Gets the serial number of the item.

  public int getSerialNumber() {

    return serialNumber;
  }


  // Provides a list of all information about the item.

  public String toString() {
    return  // Picks up as a bug, but was part of instructions.
        "Manufacturer : " + manufacturer + "\n"
            + "Serial Number : " + serialNumber + "\n"
            + "Date : " + manufacturedOn + "\n"
            + "Name : " + name;
  }


}
