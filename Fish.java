/**Fish.java
 *
 * Description: A class which can will a graphical fish
 * Library: wheelsunh, awt
 * Date: Sep 9th, 2018
 *
 * @author: Joseph Chang
 */

import wheelsunh.users.*;
import wheelsunh.users.Rectangle;

import java.awt.Color;

public class Fish
{
    //variable that can be modify by user
    private int xLocation;
    private int yLocation;
    private Color color;

    //The information of the fish's body
    private Ellipse body = new Ellipse();
    private Ellipse tail = new Ellipse();
    private Line line1 = new Line();
    private Rectangle line2 = new Rectangle();
    private Line line3 = new Line();
    private Ellipse upperFin = new Ellipse();
    private Ellipse upperFin2 = new Ellipse();
    private Ellipse lowwerFin = new Ellipse();
    private Ellipse sideFin = new Ellipse();
    private Ellipse sclera = new Ellipse();
    private Ellipse anatomy = new Ellipse();
    private Ellipse pupil = new Ellipse();

    public Fish(int x, int y)
    {
        //constructor with location setting
        //using buildFish method
        xLocation = x;
        yLocation = y;
        color = Color.ORANGE;
        buildFish();
    }
    public Fish()
    {
        //non-parameter constructor
        //using buildFish method
        xLocation = 0;
        yLocation = 0;
        color = Color.ORANGE;
        buildFish();
    }
    public Fish(Color col)
    {
        //constructor with color setting
        //using buildFish method
        xLocation = 0;
        yLocation = 0;
        color = col;
        buildFish();
    }

    public void setLocation(int x, int y)
    {
        //set all fish's body parts to location x and y
        //will be called by buildFish or moveDown
        xLocation = x;
        yLocation = y;
        body.setLocation(27 + xLocation, 45 + yLocation);
        tail.setLocation(7 + xLocation, 50 + yLocation);
        line1.setLocation(12 + xLocation, 57 + yLocation);
        line2.setLocation(7 + xLocation, 63 + yLocation);
        line3.setLocation(5 + xLocation, 70 + yLocation);
        upperFin.setLocation(60 + xLocation, 38 + yLocation);
        upperFin2.setLocation(42 + xLocation, 41 + yLocation);
        lowwerFin.setLocation(47 + xLocation, 84 + yLocation);
        sideFin.setLocation(47 + xLocation, 65 + yLocation);
        sclera.setLocation(77 + xLocation, 55 + yLocation);
        anatomy.setLocation(81 + xLocation, 58 + yLocation);
        pupil.setLocation(87 + xLocation, 59 + yLocation);
    }
    public void setColor(Color col)
    {
        //set fish's body color to col
        //will be called by buildFish
        color = col;
        body.setColor(color);
        tail.setColor(color);
        upperFin.setColor(color);
        upperFin2.setColor(color);
        lowwerFin.setColor(color);
    }
    public void moveDown(int distance)
    {
        //move fish downward if distance is positive
        //using setLocation method
        yLocation += distance;
        setLocation(xLocation, yLocation);
    }

    public Color getColor()
    {
        return color;
    }
    public int getXLocation()
    {
        return xLocation;
    }
    public int getYLocation()
    {
        return yLocation;
    }

    private void buildFish()
    {
        //build the fish when the fish is create
        //will be called by constructor
        //using setLocation method
        //using setColor method

        //fish body
        body.setSize(70, 40);

        //fish tail
        tail.setSize(20, 30);
        tail.setRotation(30);

        //tail lines
        line1.setSize(10, 1);
        line1.setColor(Color.black);
        line1.setRotation(25);

        line2.setSize(13, 1);
        line2.setColor(Color.black);
        line2.setRotation(13);

        line3.setSize(9, 1);
        line3.setColor(Color.black);
        line3.setRotation(0);

        //fish upperFin
        upperFin.setSize(18, 9);
        upperFin.setRotation(15);

        //fish upperFin2
        upperFin2.setSize(14, 7);
        upperFin2.setRotation(-10);

        //fish lowwerFin
        lowwerFin.setSize(18, 9);
        lowwerFin.setRotation(-10);

        //fish sideFin
        sideFin.setSize(26, 13);
        sideFin.setColor(Color.YELLOW);
        sideFin.setRotation(-10);

        //fish sclera
        sclera.setSize(15, 15);
        sclera.setColor(Color.white);

        //fish anatomy
        anatomy.setSize(12, 12);
        anatomy.setColor(Color.black);

        //fish pupil
        pupil.setSize(5, 5);
        pupil.setColor(Color.white);

        //set location
        setLocation(xLocation, yLocation);

        //set color
        setColor(color);
    }

    //Main
    public static void main( String[] args )
    {
        new Frame();
        Fish fish1 = new Fish(100,85); //test constructor
        Fish fish2 = new Fish();             //test constructor

        Utilities.sleep(1000);
        fish2.setLocation(300,130);    //test mutator
        Utilities.sleep(500);
        fish2.setColor(Color.GREEN);         //test mutator
        Utilities.sleep(500);
        fish2.moveDown(65);          //test mutator
        Utilities.sleep(500);
        fish2.moveDown(-80);         //test mutator

        Utilities.sleep(1000);
        Fish fish3 = new Fish(Color.BLUE);   //test constructor

        Utilities.sleep(500);
        //test accessors
        TextBox printingText = new TextBox(300,300);
        printingText.setSize(300,400);
        printingText.setText("Information of fish2\nColor: " + fish2.getColor() +
                             "\nX location: " + fish2.getXLocation() +
                             "\nY location: " + fish2.getYLocation());
    }
}
