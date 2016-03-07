package com.eimacs.lab04;

/**
 *
 * @author |Your name|
 * @version 1.0 |Today's date|
 */
//Define the Shoe class here
public class Shoe extends Footwear{
 public Shoe(String style, double size, String SKU){
     super(style, size, SKU);
 }
 public String getType(){
     return "Shoe";
 }
} 