import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

import graphics.ImageLoader;

/**
 * Created by Emily on 2/27/16.
 */
import java.awt.image.BufferedImage;

public class OpeningWindow extends JPanel
{
    private JFrame mS;
    private BufferedImage cover;
    private int screenWidth;
    private int screenHeight;


    public OpeningWindow(JFrame mainScreen)
    {


        mS = mainScreen;
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        screenWidth = (int)(screenSize.getWidth()/3);
        screenHeight = (int)(screenSize.getHeight());
        setSize(screenWidth,screenHeight);


        setVisible(true);
        setKeys();


    }

    public void paint(Graphics g)
    {
        init();
        g.drawImage(cover, 0, 0, screenWidth, screenHeight, this);
    }
    public  void setKeys()
    {
        Action enter = new AbstractAction()
        {
            public void actionPerformed(ActionEvent e)
            {
               // System.out.println("hey");
            }
        };
        getInputMap(WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("ENTER"), "enter");
        getActionMap().put("enter",enter);
    }

    public void init()
    {
        ImageLoader loader = new ImageLoader();
        cover = loader.load("/cover1.png");
    }
}
