import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Neymar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Neymar extends Actor
{
    /**
     * Act - do whatever the Neymar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int score;
    
    public void act()
    {
        // Add your action code here.
    }
    public void setScore(){
        if(isTouching(Inimigo.class)){
            removeTouching(Inimigo.class);
            score++;
            
            getWorld().addObject(new Inimigo(), 300, 200);
            }
    }
}
