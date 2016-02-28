/**
 * Created by Emily on 2/27/16.
 */

import java.awt.*;
public class spcship
{
    private int x;
    private int y;
    private int xVelocity;
    private int yVelocity;
    private int lives;
    private Rectangle c;
    private String name;
    private int color;
    private int a;
    private int b;
    private int screenWidth;
    private int screenHeight;

    public spcship(int x, int y, String name)
    {
        this.x = x;
        this.y = y;
        this.name = name;
        lives = 3;

        a = x;
        b = y;

        c = new Rectangle(x, y, (55*screenWidth/800), (109*screenHeight/800));
    }
    public int getColor()
    {
        return color;
    }
    public String getName()
    {
        return name;
    }


    public Rectangle getRecta()
    {
        return c;
    }

    public int getLives()
    {
        return lives;
    }

    public void setLives()
    {
        lives--;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public void reset()
    {
        x = a;
        y = b;
    }

    public void updatePosition(){
        x += xVelocity;
        y += yVelocity;
        updateHitbox();
    }

    public void setXVelocity(int i)
    {
        xVelocity = i;
    }

    public void setYVelocity(int i)
    {
        yVelocity = i;
    }

    public int getXVelocity()
    {
        return xVelocity;
    }

    public int getYVelocity()
    {
        return yVelocity;
    }

    public void updateHitbox()
    {
        c = new Rectangle(x, y, (55*screenWidth/800), (109*screenHeight/800));
    }
}

