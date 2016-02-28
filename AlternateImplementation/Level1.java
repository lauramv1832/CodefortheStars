/*new jwindow with new jpanel with the level screen. recognize enter with a key binding then hide this jpanel */
import graphics.ImageLoader;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class Level1 extends JPanel
{
    private BufferedImage level1;
    private int screenWidth;
    private int screenHeight;

    public Level1()
    {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        screenWidth = (int)(screenSize.getWidth()/3);
        screenHeight = (int)(screenSize.getHeight());
        setSize(screenWidth,screenHeight);
        
        setVisible(true);
        setKeys();

// create spaceship with dimensions of frame
    }

    public void paint(Graphics g)
    {
        init();
        g.drawImage(level1, 0, 0, screenWidth, screenHeight, this);
    }
    
    public void setKeys()
    {
        
    }

    public void init()
    {
        ImageLoader loader = new ImageLoader();
        level1 = loader.load("/stars.png");
    }

}