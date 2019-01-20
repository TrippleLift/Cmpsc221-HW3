import wheelsunh.users.*;
import java.awt.Color;
/** 
 * Puts  a Fish through its paces. 
 * @author CS415  
 */
public class FishDriver
{ 
    //---------------- instance variables ------------------------------
    private Fish     myFish;          
    private TextBox label,  colorLabel, locStartLabel, locEndLabel;   
    
    //--------------- constructor --------------------------------------
    /**
     * 
     *  Construct a Fish and then test it.
     *  TextBox objects are displayed  to show results.
     */
    public FishDriver()
    {
        label = new TextBox( 270, 40 );
        label.setSize( 290, 100 );
        label.setText( "No parameter Constructor" );
        
        myFish = new Fish();
        
        Utilities.sleep( 2000 );
        
        label.setText( "Two parameter Constructor\n ( 20,200 )" );
        Utilities.sleep( 1000 );
        myFish = new Fish( 20, 200 );
        
        Utilities.sleep( 2000 );
        
        label.setText( "One parameter Constructor\n (ORANGE)" );
        Utilities.sleep( 1000 );
        myFish = new Fish( Color.ORANGE );
        
        Utilities.sleep( 2000 );
        
        label.setText( "SetLocation ( 40, 350 ) " );
        Utilities.sleep( 1000 );
        myFish.setLocation( 40, 350 );
        
        Utilities.sleep( 2000 );
        label.setText( "SetColor (PINK) " );
        Utilities.sleep( 1000 );
        myFish.setColor( Color.pink );
        
        
        Utilities.sleep( 2000 );
        colorLabel = new TextBox( 270, 140 );
        colorLabel.setSize( 290, 100 );
        
        colorLabel.setText( "getColor =  " + myFish.getColor() +
                           "\n ( 225, 175, 175 )" );
        
        Utilities.sleep( 2000 );
        
        locStartLabel = new TextBox( 270, 240 );
        locStartLabel.setSize( 290, 100 );      
        locStartLabel.setText( "Start Location" +
                              "\ngetXlocation =  " +
                              myFish.getXLocation() +
                              "\ngetYLocation = " + 
                              myFish.getYLocation() +
                              "\n (40, 350)\n" );     
        Utilities.sleep( 1000 );
        
        label.setText( "moveDown " );
        Utilities.sleep( 1000 );
        
        for( int i = 0; i < 60; i++ )
        {
            myFish.moveDown( 5 );
            Utilities.sleep( 20 );
        }
        
        locEndLabel = new TextBox( 270, 340 );
        locEndLabel.setSize( 290, 100 ); 
        locEndLabel.setText( "End Location" +
                            "\ngetXlocation = " +
                            myFish.getXLocation() +
                            "\ngetYLocation = " + 
                            myFish.getYLocation() +
                            "\n (40, 50)\n" );
    }
    
    //-------------------- main ----------------------------------------
    /**
     * Just create a FishDriver object.
     * @param args String
     */
    public static void main( String[] args )
    {
        new Frame();
        new FishDriver();
    }
}
