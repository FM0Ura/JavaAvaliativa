import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Nave extends Actor
{
    private SimpleTimer timer = new SimpleTimer();
    public void act()
    {
        if(Greenfoot.isKeyDown("up")){
            move(3);
        }
        if(Greenfoot.isKeyDown("left")) {
            turn(-3);
        }
        if(Greenfoot.isKeyDown("right")){
            turn(3);
        }
        if(timer.millisElapsed() > 400 && Greenfoot.isKeyDown("space")){
            timer.mark();
            Tiro b1 = new Tiro();
            getWorld().addObject(b1, this.getX(), this.getY());
            b1.setRotation(this.getRotation());
        }
        removeBolaSeTocarInimigo();
    }
        private void removeBolaSeTocarInimigo() {
        Actor inimigo = getOneIntersectingObject(Enemy.class);
        if (inimigo != null) {
            // A bola está tocando em um inimigo, remova a bola
            getWorld().removeObject(this);
        }
    }
}
