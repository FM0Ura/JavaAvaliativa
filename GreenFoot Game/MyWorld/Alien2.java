import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Alien2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alien2 extends Enemy
{
    GifImage EnemyGif = new GifImage("alien2.gif");
    public void act()
    {
        setImage(EnemyGif.getCurrentImage());
        //mover();
    }
    protected void mover() {
        super.mover();
    }
    public Alien2(){
        this.HP = 2;
    }
}
