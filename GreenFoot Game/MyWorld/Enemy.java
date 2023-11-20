import greenfoot.*;

public class Enemy extends Actor {
    int HP=0;
    public void act() {
        mover();
        verificarColisaoNave();
    }

    protected void mover() {
        Nave nave = (Nave) getWorld().getObjects(Nave.class).get(0);
        turnTowards(nave.getX(), nave.getY());
        move(1);
    }

    private void verificarColisaoNave() {
        Nave nave = (Nave) getOneIntersectingObject(Nave.class);
        if (nave != null) {
            Greenfoot.stop(); // Jogo acaba se Enemy colidir com a Nave
        }
    }
}
