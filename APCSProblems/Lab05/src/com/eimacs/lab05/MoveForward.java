package com.eimacs.lab05;

import com.eimacs.lab05gui.Turtle;
import java.awt.Graphics;
/**
 *
 * @author |Your name|
 * @version 1.0 |Today's date|
 */
public class MoveForward extends Action{
    int mySteps = 0;
    public MoveForward(int mySteps){
        this.mySteps = mySteps;
    }
    public String toString(){
        return "Forward " + Integer.toString(mySteps);
    }
    public void execute( Turtle t, Graphics g )
    {
      APPoint p = t.getPosition();
      double h = Math.toRadians( t.getHeading() );

      APPoint newPoint = new APPoint( p.getX() + mySteps * Math.sin( h ),
                                      p.getY() - mySteps * Math.cos( h ) );

      t.lineTo( newPoint, g );
    }
} 
