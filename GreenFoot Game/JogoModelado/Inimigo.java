import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Inimigo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Inimigo extends Actor
{
    /**
     * Act - do whatever the Inimigo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Chame o método para mover em direção a ObjetoB
        moverEmDirecaoAPersonagem();

        // Verifique a colisão com ObjetoB
        verificarColisaoComPersonagem();
    }
    public void moverEmDirecaoAPersonagem() {
        // Obtém a referência para ObjetoB
        Neymar neymar = (Neymar) getWorld().getObjects(Neymar.class).get(0);

        int deltaX = neymar.getX() - getX();
        int deltaY = neymar.getY() - getY();

        int angulo = (int) Math.toDegrees(Math.atan2(deltaY, deltaX));

        int velocidade = 3;
        setLocation(getX() + (int) (velocidade * Math.cos(Math.toRadians(angulo))),
                    getY() + (int) (velocidade * Math.sin(Math.toRadians(angulo))));
    
        
                }
        
        public void verificarColisaoComPersonagem() {
        // Obtém uma referência para Neymar
        Neymar neymar = (Neymar) getWorld().getObjects(Neymar.class).get(0);

        // Verifica se há colisão com Neymar
        if (Math.abs(getX() - neymar.getX()) < getImage().getWidth() / 2 &&
            Math.abs(getY() - neymar.getY()) < getImage().getHeight() / 2) {
            Greenfoot.stop(); // Encerra o jogo
        }
    }
}
