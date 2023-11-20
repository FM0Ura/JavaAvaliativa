import greenfoot.*;

public class Alien extends Enemy
{
    
    GifImage EnemyGif = new GifImage("alien.gif");
    public Alien(int HP){
        this.HP = HP;
    }
    
    public void act()
    {
        setImage(EnemyGif.getCurrentImage());
        mover();
           
    }
    protected void mover() {
        super.mover(); // Chama o método mover da classe pai
    }
}
