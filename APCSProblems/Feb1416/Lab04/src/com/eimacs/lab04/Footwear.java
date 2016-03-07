package com.eimacs.lab04;

public class Footwear
{
    String myStyle = "";
    double mySize = 0;
    String mySKU = "";
    public Footwear(String style, double size, String SKU){
        myStyle = style;
        mySize = size;
        mySKU = SKU;
    }
    public String getStyle(){
        return myStyle;
    }
    public double getSize(){
        return mySize;
    }
    public String getSKU(){
        return mySKU;
    }
    public String getType(){
        return "Unspecified";
    }
    public String printSize(){
        if(getSize()%1 != 0){
            return Integer.toString(((int)getSize())) + "-" + "\u00bd";
        } else {
            return Integer.toString(((int)getSize()));
        }
    }
    public String toString(){
        if(! getType().equals("Unspecified")){
            return getType() + " - " + getStyle() + " (size " + printSize() + ")";
        } else {
            return getStyle() + " (size " + printSize() + ")";
        }
    } 
}