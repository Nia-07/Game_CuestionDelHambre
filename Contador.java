import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Contador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Contador extends Actor
{
    int contar = 0;
    /**
     * Act - do whatever the Contador wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
    setImage (new GreenfootImage("Quesos Ganados:" + contar, 50, Color.YELLOW, Color.BLUE));// Add your action code here.
    }    
    public void addcontar()
        {

            contar++;

        } 
    
    
}
