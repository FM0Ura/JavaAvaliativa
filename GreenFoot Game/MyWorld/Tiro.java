import greenfoot.*;

public class Tiro extends Actor {
    private boolean shouldRemove = false;
    public void act() {
        move(10);
        checkCollision();
        checkEdge();
        if (shouldRemove) {
            getWorld().removeObject(this);
        }
    }

    private void checkCollision() {
        Enemy enemy = (Enemy) getOneIntersectingObject(Enemy.class);
        Nave jogador = (Nave) getOneIntersectingObject(Nave.class);
        
        if (enemy != null) {
            enemy.HP--;
            shouldRemove = true;
            if(enemy.HP == 0){
                getWorld().removeObject(enemy);
                jogador.score++;
                jogador.aumentarScore();
                shouldRemove = true;
            }
        }
    }

    private void checkEdge() {
        if (isAtEdge()) {
            shouldRemove = true;
        }
    }
}
