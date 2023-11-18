import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Alien here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alien extends Enemy
{
    GifImage EnemyGif = new GifImage("alien.gif");
    public void act()
    {
        setImage(EnemyGif.getCurrentImage());
        mover();
    }
    protected void mover() {
        super.mover(); // Chama o método mover da classe pai
    }
}
