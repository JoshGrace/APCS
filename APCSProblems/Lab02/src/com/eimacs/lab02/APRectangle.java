package com.eimacs.lab02;

import java.awt.Graphics;

/**
 *
 * @author |your name|
 * @version 1.0 |today's date|
 */
public class APRectangle { 
    
	  private APPoint myTopLeft; 
	  private double  myWidth; 
	  private double  myHeight; 
	 
	  public APRectangle( APPoint topLeft, double width, double height ) { 
	  myTopLeft = topLeft; 
	  myWidth = width;
	  myHeight = height;
	}
	 public APPoint getTopLeft() { 
	     return myTopLeft;
	 } 
	 public double getWidth() { 
	     return myWidth; } 
	 public void setTopLeft( APPoint x ) { 
	     myTopLeft = x; 
	 } 
	 public void setWidth( double y ) { 
	     myWidth = y; 
	 }
	 public double getHeight() { 
	     return myHeight; 
	 } 
	 public void setHeight( double y ) { 
	     myHeight = y; 
	 }
	 public APPoint getTopRight(){
	      APPoint myTopRight = new APPoint(myTopLeft.getX() + myWidth, myTopLeft.getY());
	      return myTopRight;
	  }
	  public APPoint getBottomLeft(){
	      APPoint myBottomLeft = new APPoint(myTopLeft.getX(), myTopLeft.getY() + myHeight);
	      return myBottomLeft;
	  }
	  public APPoint getBottomRight(){
	         APPoint myBottomRight = new APPoint(myTopLeft.getX() + myWidth, myTopLeft.getY() + myHeight);
	      return myBottomRight;
	  }
	  public void shrink(double n){
	      myWidth = myWidth*n/100;
	      myHeight = myHeight*n/100;
	  } 
	  public void draw( Graphics g ) 
	  { 
	    APPoint topLeft = myTopLeft; 
	    APPoint topRight = getTopRight(); 
	    APPoint bottomLeft = getBottomLeft(); 
	    APPoint bottomRight = getBottomRight(); 

	    g.drawLine( (int)topLeft.getX(), (int)topLeft.getY(), (int)topRight.getX(), (int)topRight.getY() ); 
	    g.drawLine( (int)topRight.getX(), (int)topRight.getY(), (int)bottomRight.getX(), (int)bottomRight.getY() );
	    g.drawLine( (int)bottomRight.getX(), (int)bottomRight.getY(), (int)bottomLeft.getX(), (int)bottomLeft.getY() );
	    g.drawLine( (int)bottomLeft.getX(), (int)bottomLeft.getY(), (int)topLeft.getX(), (int)topLeft.getY() ); 
	  } 
	}