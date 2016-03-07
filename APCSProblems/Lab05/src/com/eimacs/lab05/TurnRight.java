package com.eimacs.lab05;

import com.eimacs.lab05gui.Turtle;
import java.awt.Graphics;

/**
 *
 * @author |Your name|
 * @version 1.0 |Today's date|
 */
public class TurnRight extends Action{
    double myAngle = 0;
    public TurnRight(double myAngle){
        this.myAngle= myAngle;
    }
    public String toString(){
        return "Right " + Double.toString(myAngle);
    }
    public void execute( Turtle t, Graphics g )
    {
      t.setHeading( t.getHeading() + myAngle );
    }
}
