/**
 * Created by Emily on 2/27/16.
 */

    /*Main.java is used to show the title screen, create a JWindow and  JPanel to do so. It will also contain KeyBinding
 *used to recognize when the user wants to continue to the level screen. At that point it will close the
*JWindow and create a new Level1 object. Should also contain a GUI to have the user input their "spaceship" name*/

    import javax.swing.*;
    import java.awt.*;
    public class Main
    {

        public static boolean waiting = true;
        public static void main(String[] args)
        {
            JFrame mainScreen = new JFrame();
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            int screenWidth = (int)(screenSize.getWidth()/3);
            int screenHeight = (int)(screenSize.getHeight());
            //System.out.println(screenWidth + " " + screenHeight);
            mainScreen.setSize(screenWidth, screenHeight);
            mainScreen.setResizable(false);
            mainScreen.setLocation(((int)(screenSize.getWidth())/2)-(screenWidth/2), 0);


            mainScreen.setVisible(true);
            OpeningWindow img = new OpeningWindow(mainScreen);
            mainScreen.add(img);

           /* if(!waiting)
            {

                JFrame frame = new JFrame();
                frame.setSize(screenWidth, screenHeight);
                frame.setResizable(false);
                frame.setLocation(((int)(screenSize.getWidth())/2)-(screenWidth/2), 0);
                frame.setVisible(true);

                Level1 lvl = new Level1();
                frame.add(lvl);


            }*/


        }


    }




