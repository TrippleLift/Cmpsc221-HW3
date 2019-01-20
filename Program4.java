/**Program4.java
 *
 * Description: A class built above Fish.java, the class will create
 *              a fish and move it downward smoothly and print the
 *              text in TextBox.
 * Library: wheelsunh, awt, Fish.java
 * Date: Sep 9th, 2018
 *
 * @author: Joseph Chang
 */

import wheelsunh.users.*;
import wheelsunh.users.Frame;

import java.awt.*;

public class Program4
{
    private Fish fish;
    private TextBox text;

    public Program4()
    {
        fish = new Fish(100,20);
        fish.setColor(Color.GREEN);
        text = new TextBox(300,50);
        text.setSize(100,100);
        text.setText("y-Location: " + fish.getYLocation());
    }

    public void moveDownSmoothly(int distance)
    {
        for (int i = 0; i < distance; i++)
        {
            Utilities.sleep(2);
            fish.moveDown(1);
            text.setText("y-Location: " + fish.getYLocation());
        }
    }

    public static void main( String[] args )
    {
        new Frame();
        Program4 animate = new Program4();
        Utilities.sleep(500);
        animate.moveDownSmoothly(350);

    }

}
