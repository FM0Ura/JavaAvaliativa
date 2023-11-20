import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MiniAndroid here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MiniAndroid extends Enemy
{
    int HP = 5;
    GifImage EnemyGif = new GifImage("mini-android.gif");

    public void act()
    {
        setImage(EnemyGif.getCurrentImage());
        //mover();
    }
    protected void mover() {
        super.mover();
    }
    public MiniAndroid(){
        this.HP = 4;
    }

}
