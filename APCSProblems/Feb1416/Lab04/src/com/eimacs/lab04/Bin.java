package com.eimacs.lab04;

import java.util.ArrayList;

public class Bin 
{ 
  ArrayList<BinItem> myContents;
  private String myName = "";
  public Bin(String name){
      myName = name;
       myContents = new  ArrayList<BinItem>(5);
  }
  public ArrayList<BinItem> getContents(){ 
      return myContents;
  }
  public String getName(){
      return myName;
  }
  public String toString() {
      String returnVal = "Bin " + myName + ":" + "\n";
  	for (int i = 0; i < myContents.size(); i++) {
  	    if(myContents.size()-1 > i){
  	    returnVal = returnVal + myContents.get(i) + "\n";
  	    } else {
  	        returnVal = returnVal + myContents.get(i);
  	    }
  	}
  	return returnVal;
  } public void remove(int num){
      myContents.remove(num);
  }
  public int totalQuantity(){
      int amount = 0;
      for(BinItem item : myContents){
          amount += item.getQuantity();
      }
      return amount;
  } 
  public void add(BinItem item1){
      int amount = 0;
      for(BinItem item : myContents){
          if(item.getSKU() == item1.getSKU()){
              amount = item.getQuantity();
              myContents.remove(item);
              break;
          }
      }
      myContents.add(new BinItem(item1.getSKU(), item1.getQuantity() + amount));
  }  
} 