import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SuperEnemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SuperEnemy extends Enemy
{
    GifImage EnemyGif = new GifImage("super-enemy.gif");
    /**
     * Act - do whatever the SuperEnemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
         setImage(EnemyGif.getCurrentImage());
    }
}
