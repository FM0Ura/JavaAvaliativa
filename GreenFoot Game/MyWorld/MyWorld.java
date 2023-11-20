import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Nave nave = new Nave();
        /*Alien2 alien2 = new Alien2();
        alien2.HP = 2;
        addObject(alien2,451,123);
        alien2.setLocation(525,122);
        Alien alien = new Alien(2);
        addObject(alien,481,56);
        MiniAndroid miniAndroid = new MiniAndroid();
        miniAndroid.HP = 3;
        addObject(miniAndroid,503,213);
        SuperEnemy superEnemy = new SuperEnemy();
        superEnemy.HP = 8;
        addObject(superEnemy,231,168);
        
        addObject(nave,307,336);
        removeObject(superEnemy);
        removeObject(miniAndroid);
        alien.setLocation(158,132);
        alien2.setLocation(485,116);*/
        while(this.getObjects(Nave.class).contains(nave)){
            System.out.println("acabou");
        }
    }
}
