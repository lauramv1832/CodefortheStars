import java.awt.*;
import javafx.scene.shape.Circle;
public class Asteroid {
    //velocity
    //position
    private int x;
    private int y;
    private int yVelocity;
    private int color;
    private int screenWidth;
    private int screenHeight;
    private Circle meteor;

    public Asteroid()
    {
        this.x = x;
        this.y = y;
        meteor = new Circle();

    }

    public static void drawCircle(Graphics g, int x, int y, int radius) {

        int diameter = radius * 2;

        //shift x and y by the radius of the circle in order to correctly center it
        g.fillOval(x - radius, y - radius, diameter, diameter);

    }


}