import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Escoba here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Escoba extends Actor
{
    /**
     * Act - do whatever the Escoba wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         move(6);
        if(Greenfoot.getRandomNumber(100)<10)
        {
           turn (Greenfoot.getRandomNumber(40)-20); 
    } 
    
    if(isAtEdge())
    {   
        turn(7);
    }
       
    }
 
}
