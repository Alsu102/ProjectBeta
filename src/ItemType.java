
/******************************************************************************
 * File:    ItemType.java
 * Author:  Alsu Saifetdinova
 * Class:   COP3003; 201809; 80601
 * Purpose: Class will store the information about product
 * Source:  Code written based on specifications provided in Oracle Academy's
 *          OraclProduction document. All rights for the document and
 *          specifications belong to Oracle.
 *******************************************************************************/

public enum ItemType {

  AUDIO("AU"),
  VISUAL("VI"),
  AUDIO_MOBILE("AM"),
  VISUAL_MOBILE("VM");

  public final String code;

  //The enum constructor that takes a String and assigns it to a field.

  ItemType(String code) {
    this.code = code;
  }
}

