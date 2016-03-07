package com.eimacs.lab04;

import java.util.ArrayList;
/**
 *
 * @author IMACS Curriculum Development Group
 * @version 2.0 January 14, 2015
 */
public class Lab04Runner
{
    public static void main( String[] args )
    {
        
    	Warehouse w = new Warehouse( 10 ); 
    	Footwear d0 = new DressShoe( "Loafer", 10.5, "1234-13" ); 
    	Footwear b = new Boot( "Riding", 8, "1234-5" ); 
    	Footwear c = new CasualShoe( "Sandal", 9.5, "1234-0" ); 
    	Footwear d1 = new DressShoe( "Wing-tip", 10, "1234-3" ); 
    	w.receive( d0, 4 ); 
    	w.receive( b, 25 ); 
    	w.receive( c, 18 ); 
    	w.receive( d1, 5 ); 
    	System.out.println( w );
    }
    public static int random( int n )
    {
      return (int)( n * Math.random() );
    }
    public static ArrayList<Footwear> makeCatalog( int n ) 
    { 
      String[][] styles = 
      { 
        //Boot styles 
        { "Cowboy", "Hiking", "Rain", "Riding" }, 
        // Dress shoe styles 
        { "Loafer", "Oxford", "Pump", "Sling-back", "Wing-tip" }, 
        // Casual shoe styles 
        { "Athletic", "Hightop", "Moccasin", "Sandal" } 
      }; 

      double[] sizes = { 5, 5.5, 6, 6.5, 7, 7.5, 8, 8.5, 9, 9.5, 
                         10, 10.5, 11, 11.5, 12, 12.5, 13, 13.5, 14 }; 

      ArrayList<Footwear>  catalog = new ArrayList<Footwear>(); 
      Footwear fw; 

      for ( int i = 0; i < n; i++ ) 
      { 
        int fwType = random( styles.length ); 
        String[] styleList = styles[ fwType ]; 
        String style = styleList[ random( styleList.length ) ]; 
        double size = sizes[ random( sizes.length ) ]; 
        String sku = "1234-" + i; 

        if ( fwType == 0 ) 
          fw = new Boot( style, size, sku ); 
        else if ( fwType == 1 ) 
          fw = new DressShoe( style, size, sku ); 
        else 
          fw = new CasualShoe( style, size, sku ); 

        catalog.add( fw ); 
      } 

      return catalog; 
    }
    public static String lookupFootwear( ArrayList<Footwear> catalog, String sku )
    {
      for ( Footwear fw : catalog )
      {
        if ( fw.getSKU().equals(sku) )
          return fw.toString();
      }

      return "SKU " + sku + " not in catalog";
    }
}
