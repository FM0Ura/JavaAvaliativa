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
            World world = getWorld();
            world.removeObject(enemy);
            shouldRemove = true;
        }
    }

    private void checkEdge() {
        if (isAtEdge()) {
            shouldRemove = true;
        }
    }
}
