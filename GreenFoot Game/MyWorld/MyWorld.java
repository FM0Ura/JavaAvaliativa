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
        // DEFAULT 600x400 size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    private void prepare()
    {
        Alien2 alien2 = new Alien2();
        addObject(alien2,476,84);
        Alien alien = new Alien();
        addObject(alien,254,84);
        Alien alien3 = new Alien();
        addObject(alien3,101,80);
        Nave nave = new Nave();
        addObject(nave,288,338);
        /*while(this.getObjects(Nave.class).contains(nave)){
        System.out.println("acabou");
        }*/ // ESTÁ FUNCIONANDO O LOOP
        
        
        if(nave.score % 15 == 0){
            // CRIAR SUPERENEMY AQUI!
        }
    }
}
