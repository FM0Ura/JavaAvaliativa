import greenfoot.*;  

public class Nave extends Actor {
    
    // ATRIBUTOS
    public int score = 0;
    private SimpleTimer timer = new SimpleTimer();
    private GreenfootImage textImage;
    
    // MÉTODOS
    public void act() {
        if(Greenfoot.isKeyDown("up")) {
            move(3);
        }
        if(Greenfoot.isKeyDown("left")) {
            turn(-3);
        }
        if(Greenfoot.isKeyDown("right")) {
            turn(3);
        }
        if(timer.millisElapsed() > 400 && Greenfoot.isKeyDown("space")) {
            timer.mark();
            Tiro b1 = new Tiro();
            getWorld().addObject(b1, this.getX(), this.getY());
            b1.setRotation(this.getRotation());
            b1.turn(-90);
        } 
        // Exibe o score no canto superior esquerdo da tela
        getWorld().showText("Score: " + score, 100, 30);
    }
    // Atualiza a imagem com o valor atual do score
    private void atualizarTextoScore() {
        getWorld().showText("Score: " + score, 100, 30);
    }
    public void aumentarScore() {
        score++;
        atualizarTextoScore();
    }
}