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
        
        if (enemy != null) {
            
            System.out.println("!!!" + enemy.HP);
            if(enemy.HP != 0){
                
                enemy.HP--;
                shouldRemove = true;
                //System.out.println("" + enemy.HP);
            } else if(enemy.HP==0){
                System.out.println("matou");
                getWorld().removeObject(enemy);
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
