import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Raton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Raton extends Movers
{

    /**
     * Act - do whatever the Raton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
      public Raton () 
    {
     getImage().scale(getImage().getWidth()/2,getImage().getHeight()/2);
        
    } 
  
    public void act() 
    {
     
        slideAround();
        
         }

   
            public void comer()
        {
            Actor pan;
            pan=getOneObjectAtOffset(0,0,Pan.class);
            if(pan!=null)
            {
                World escena2;
                escena2=getWorld();
                escena2.removeObject(pan);
            }
            Actor salchicha;
            salchicha=getOneObjectAtOffset(0,0,Salchicha.class);
            if(salchicha!=null)
            {
                World escena2;
                escena2=getWorld();
                escena2.removeObject(salchicha);
                //speed = speed * 2;
            }     
            Actor Queso;
            Queso=getOneObjectAtOffset(0,0,Queso.class);
            if(Queso!=null)
            {
                World escena2;
                escena2=getWorld();
                escena2.removeObject(Queso);
               MazeWorld game =( MazeWorld)escena2;
               //Contador cont = getContador();
               //cont.addcontar();
            }  
            Actor Veneno;
            Veneno=getOneObjectAtOffset(0,0,Veneno.class);
            if(Veneno!=null)
            {
                World escena2;
                escena2=getWorld();
                escena2.removeObject(Veneno);
                //speed = speed * 0;
            } 
         
      
        }
         public boolean validarPared() {
        int x = getX();
        int y = getY();
        
        // x 100, y 90
        //if ((x >= 90 && x < 200) && (y >= 75 && y < 100)) {
            //return false;
        //} else {
            return true;
        //}
    }  
        
        
  
}
