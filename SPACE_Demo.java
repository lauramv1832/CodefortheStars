import java.util.*;
public class SPACE_Demo
{
    public static void main (String[] args)
    {
        int gameStop = 0;
        Scanner kate = new Scanner(System.in);
        System.out.println("***  YOU'RE STUCK ON YOUR SPACESHIP IN THE MIDDLE OF THE METEOR BELT   ***");
        System.out.println();
        System.out.println("                        WHAT DO YOU DO?");
        System.out.println();
        System.out.println("Please enter your name");
        String name = kate.next();
        System.out.println();
        System.out.println("Hello "+ name +", I am the computer interface on your ship.");
        System.out.println("We're close to Mars, but asteroids are coming towards us!");
        System.out.println();
        System.out.println("You have to use methods to save yourself.");
        System.out.println("These methods include: .dodge(), .shoot(), and .invisible()");
        System.out.println("You will use your name for the object.");
        System.out.println("For example, if you wanted to move right, you'd input "+ name +".dodge()");
        System.out.println();
        for (int i = 0; i < 3; i++){
            try
            {
                Thread.sleep(1000);
            }catch(InterruptedException e){
            }
            System.out.println(".");
            
        }
        System.out.println("BEGIN!");
        
        int lol = 3;
        if (lol ==1)
        {
            System.out.println("Quick, " + (lol) + " asteroid is coming at you!!");
            System.out.println("In order to dodge the asteroid type in the call the correct method " +lol+ " time! Press enter after!"); 
        }
        else
        {
            System.out.println("Quick, " + (lol) + " asteroids are coming at you!!");
            System.out.println("In order to dodge the asteroids type in the call the correct method " +lol+ " times! Press enter after each call!"); 
        }
        String answer = kate.next();
        int die = 0;
        for (int i = 0; i < lol; i++)
        {
            if(!answer.equals(name +".dodge();"))
            {
                die++;
                if((3-die) == 0)
                {
                    System.out.println("You're dead. Mission Failure!!!");
                    
                    System.exit(1);
                }
                System.out.println("You lost a life. You have " + (3-die) + " live(s) left. Please enter the correct method call");
            }
            answer = kate.next();
        }
        System.out.println("Congratulations! You have moved on to level 2!");
    }
    public static void game(Scanner kate, String name)
    {
        System.out.println();
        for (int i = 0; i < 3; i++){
            try
            {
                Thread.sleep(1000);
            }catch(InterruptedException e){
            }
            System.out.println(".");
            
        }
        System.out.println("BEGIN!");
        int methodNum = (int)(Math.random()*2+1);
        for(int i = 0; i < 100; i++)
        {
            if(methodNum ==1)
                asteroids(kate, name);
            else if(methodNum ==2)
                aliens(kate, name);
            else
                System.out.println("lol");//spacePolice();
        }

        

    }

    public static void asteroids(Scanner kate, String name)
    {
        
        int lol = (int)(Math.random()*7+1);

        if (lol ==1){
            System.out.println("Quick, " + (lol+1) + " asteroid is coming at you!!");
            System.out.println("In order to dodge the asteroid type in the call the correct method " +lol+ " time! Press enter after!"); 
        }else{
            System.out.println("Quick, " + (lol+1) + " asteroids are coming at you!!");
            System.out.println("In order to dodge the asteroids type in the call the correct method " +lol+ " times! Press enter after each call!"); 
        }
        String answer = kate.next();
        int die = 0;
        for (int i = 0; i < lol; i++)
        {
            if(!answer.equals(name +".dodge();"))
            {
                die++;
                if((3-die) == 0)
                {
                    System.out.println("You're dead. Game over. Thanks for playing!");
                    
                    System.exit(1);
                }
                System.out.println("You lost a life. You have " + (3-die) + "live(s) left. Please enter the correct method call");
            }
            answer = kate.next();
        }

    }

    public static void aliens(Scanner kate, String name)
    {
        int num = (int)(Math.random()*7+1);

        if(num == 1)
        {
            System.out.println("OH my goodness! an alien spaceship is attacking you!! WHAT MEANIES!");
            System.out.println("In order to live, you must call the correct method " + num+1 + "time! Press enter after");
        }
        else
        {
            System.out.println("OH my goodness! " + num+1 + " alien spaceships are attacking you!! WHAT MEANIES!");
            System.out.println("In order to live, you must call the correct method " + (num+1) + "times! Press enter after each call!"); 
        }
        String answer = kate.next();
        int die = 0;
        for(int i = 0; i < num; i++)
        {
            if(!answer.equals(name + ".shoot();"))
            {
                die++;
                if((3-die) == 0)
                {
                    System.out.println("You're dead. Game over. Thanks for playing!");
                    System.exit(1);
                }
                System.out.println("You lost a life. You have " + (3-die) + "live(s) left. Please enter the correct method call");
            }
            answer = kate.next();
        }
    }

    public static void spacePolice(Scanner kate, String name)
    {
        //String start = kate.next();
    }
    
}
