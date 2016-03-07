package com.eimacs.lab04;

public class BinItem 
{ 
      String mySKU = "";
      int myQuantity = 0;
      public BinItem(String SKU, int quantity){
          myQuantity = quantity;
          mySKU = SKU;
      }
      public String getSKU(){
          return mySKU;
      }
      public int getQuantity(){
          return myQuantity;
      }
      public String toString(){
          return "SKU " + getSKU() + ": " + Integer.toString(getQuantity());
      }  
} 