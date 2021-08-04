import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MazeWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MazeWorld extends World
{
    Contador cont = new Contador();
    /**
     * Constructor for objects of class MazeWorld.
     * 
     */
    public MazeWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        addObject(new Raton(), 90, 70);
        addObject(new Escoba(), 650, 550);
        addObject(new Gato(), 300, 550);
        addObject(new Vida(), 50, 20);
        addObject(new Vida(), 100, 20);
        addObject(new Vida(), 150, 20);
        addObject(new Pan(), 190, 80);
        addObject(new Pan(), 355, 550);
        addObject(new Pan(), 500, 300);
        addObject(new Salchicha(), 550, 80);
        addObject(new Salchicha(), 200, 300);
        addObject(new Salchicha(), 570, 545);
        addObject(new Salchicha(), 100, 400);
        addObject(new Veneno(), 350, 70);
        addObject(new Veneno(), 400, 300);
        addObject(new Veneno(), 100, 500);
        addObject(new Queso(), 100, 150);
        addObject(new Queso(), 100, 350);
        addObject(new Queso(), 390, 380);
        addObject(new Queso(), 330, 200);
        addObject(new Queso(), 500, 200);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        MazeBlock mazeBlock = new MazeBlock();
        addObject(mazeBlock,2*50,9*50);
        MazeBlock mazeBlock2 = new MazeBlock();
        addObject(mazeBlock2,11*50,6*50);
        MazeBlock mazeBlock3 = new MazeBlock();
        addObject(mazeBlock3,8*50,7*50);
        MazeBlock mazeBlock4 = new MazeBlock();
        addObject(mazeBlock4,10*50,4*50);
        MazeBlock mazeBlock5 = new MazeBlock();
        addObject(mazeBlock5,8*50,4*50);
        MazeBlock mazeBlock6 = new MazeBlock();
        addObject(mazeBlock6,10*50,2*50);
        MazeBlock mazeBlock7 = new MazeBlock();
        addObject(mazeBlock7,5*50,3*50);
        MazeBlock mazeBlock8 = new MazeBlock();
        addObject(mazeBlock8,4*50,6*50);
        MazeBlock mazeBlock9 = new MazeBlock();
        addObject(mazeBlock9,8*50,9*50);
        MazeBlock mazeBlock10 = new MazeBlock();
        addObject(mazeBlock10,4*50,9*50);
        mazeBlock.setLocation(2*50,11*50);
        mazeBlock10.setLocation(2*50,10*50);
        mazeBlock8.setLocation(0,10*50);
        mazeBlock9.setLocation(0,9*50);
        mazeBlock3.setLocation(0,8*50);
        mazeBlock2.setLocation(1*50,8*50);
        mazeBlock5.setLocation(2*50,8*50);
        mazeBlock7.setLocation(3*50,8*50);
        mazeBlock4.setLocation(4*50,8*50);
        mazeBlock6.setLocation(4*50,10*50);
        MazeBlock mazeBlock11 = new MazeBlock();
        addObject(mazeBlock11,9*50,5*50);
        MazeBlock mazeBlock12 = new MazeBlock();
        addObject(mazeBlock12,9*50,3*50);
        MazeBlock mazeBlock13 = new MazeBlock();
        addObject(mazeBlock13,7*50,6*50);
        MazeBlock mazeBlock14 = new MazeBlock();
        addObject(mazeBlock14,10*50,8*50);
        MazeBlock mazeBlock15 = new MazeBlock();
        addObject(mazeBlock15,8*50,9*50);
        MazeBlock mazeBlock16 = new MazeBlock();
        addObject(mazeBlock16,6*50,4*50);
        MazeBlock mazeBlock17 = new MazeBlock();
        addObject(mazeBlock17,9*50,2*50);
        MazeBlock mazeBlock18 = new MazeBlock();
        addObject(mazeBlock18,6*50,2*50);
        mazeBlock18.setLocation(0,0);
        mazeBlock16.setLocation(1*50,6*50);
        mazeBlock13.setLocation(1*50,5*50);
        mazeBlock11.setLocation(1*50,4*50);
        mazeBlock12.setLocation(1*50,3*50);
        mazeBlock17.setLocation(1*50,2*50);
        mazeBlock15.setLocation(2*50,2*50);
        mazeBlock14.setLocation(3*50,2*50);
        MazeBlock mazeBlock19 = new MazeBlock();
        addObject(mazeBlock19,8*50,6*50);
        MazeBlock mazeBlock20 = new MazeBlock();
        addObject(mazeBlock20,8*50,4*50);
        MazeBlock mazeBlock21 = new MazeBlock();
        addObject(mazeBlock21,9*50,7*50);
        MazeBlock mazeBlock22 = new MazeBlock();
        addObject(mazeBlock22,10*50,5*50);
        MazeBlock mazeBlock23 = new MazeBlock();
        addObject(mazeBlock23,10*50,3*50);
        MazeBlock mazeBlock24 = new MazeBlock();
        addObject(mazeBlock24,7*50,2*50);
        MazeBlock mazeBlock25 = new MazeBlock();
        addObject(mazeBlock25,10*50,8*50);
        MazeBlock mazeBlock26 = new MazeBlock();
        addObject(mazeBlock26,9*50,10*50);
        MazeBlock mazeBlock27 = new MazeBlock();
        addObject(mazeBlock27,7*50,9*50);
        MazeBlock mazeBlock28 = new MazeBlock();
        addObject(mazeBlock28,10*50,1*50);
        mazeBlock24.setLocation(3*50,3*50);
        mazeBlock20.setLocation(2*50,1*50);
        mazeBlock28.setLocation(4*50,1*50);
        mazeBlock23.setLocation(5*50,1*50);
        mazeBlock22.setLocation(6*50,1*50);
        mazeBlock19.setLocation(6*50,2*50);
        mazeBlock21.setLocation(7*50,2*50);
        mazeBlock25.setLocation(5*50,3*50);
        mazeBlock27.setLocation(5*50,4*50);
        mazeBlock26.setLocation(5*50,5*50);
        MazeBlock mazeBlock29 = new MazeBlock();
        addObject(mazeBlock29,9*50,6*50);
        MazeBlock mazeBlock30 = new MazeBlock();
        addObject(mazeBlock30,9*50,5*50);
        MazeBlock mazeBlock31 = new MazeBlock();
        addObject(mazeBlock31,9*50,9*50);
        MazeBlock mazeBlock32 = new MazeBlock();
        addObject(mazeBlock32,9*50,7*50);
        MazeBlock mazeBlock33 = new MazeBlock();
        addObject(mazeBlock33,9*50,3*50);
        MazeBlock mazeBlock34 = new MazeBlock();
        addObject(mazeBlock34,10*50,6*50);
        mazeBlock33.setLocation(8*50,0);
        mazeBlock30.setLocation(9*50,1*50);
        mazeBlock29.setLocation(9*50,2*50);
        mazeBlock34.setLocation(9*50,3*50);
        mazeBlock32.setLocation(10*50,2*50);
        mazeBlock31.setLocation(10*50,0);
        MazeBlock mazeBlock35 = new MazeBlock();
        addObject(mazeBlock35,9*50,7*50);
        mazeBlock35.setLocation(5*50,6*50);
        MazeBlock mazeBlock36 = new MazeBlock();
        addObject(mazeBlock36,9*50,7*50);
        MazeBlock mazeBlock37 = new MazeBlock();
        addObject(mazeBlock37,10*50,5*50);
        MazeBlock mazeBlock38 = new MazeBlock();
        addObject(mazeBlock38,11*50,8*50);
        MazeBlock mazeBlock39 = new MazeBlock();
        addObject(mazeBlock39,7*50,10*50);
        MazeBlock mazeBlock40 = new MazeBlock();
        addObject(mazeBlock40,8*50,5*50);
        MazeBlock mazeBlock41 = new MazeBlock();
        addObject(mazeBlock41,6*50,8*50);
        MazeBlock mazeBlock42 = new MazeBlock();
        addObject(mazeBlock42,9*50,10*50);
        MazeBlock mazeBlock43 = new MazeBlock();
        addObject(mazeBlock43,7*50,6*50);
        mazeBlock43.setLocation(6*50,6*50);
        mazeBlock41.setLocation(7*50,6*50);
        mazeBlock39.setLocation(6*50,7*50);
        mazeBlock42.setLocation(6*50,8*50);
        mazeBlock36.setLocation(6*50,9*50);
        mazeBlock38.setLocation(6*50,10*50);
        MazeBlock mazeBlock44 = new MazeBlock();
        addObject(mazeBlock44,8*50,8*50);
        mazeBlock44.setLocation(6*50,11*50);
        MazeBlock mazeBlock45 = new MazeBlock();
        addObject(mazeBlock45,10*50,7*50);
        MazeBlock mazeBlock46 = new MazeBlock();
        addObject(mazeBlock46,10*50,9*50);
        MazeBlock mazeBlock47 = new MazeBlock();
        addObject(mazeBlock47,8*50,9*50);
        mazeBlock40.setLocation(7*50,4*50);
        mazeBlock37.setLocation(8*50,4*50);
        mazeBlock45.setLocation(10*50,4*50);
        mazeBlock46.setLocation(10*50,5*50);
        mazeBlock47.setLocation(10*50,6*50);
        MazeBlock mazeBlock48 = new MazeBlock();
        addObject(mazeBlock48,8*50,9*50);
        MazeBlock mazeBlock49 = new MazeBlock();
        addObject(mazeBlock49,10*50,8*50);
        MazeBlock mazeBlock50 = new MazeBlock();
        addObject(mazeBlock50,11*50,10*50);
        mazeBlock49.setLocation(10*50,7*50);
        mazeBlock48.setLocation(9*50,6*50);
        mazeBlock50.setLocation(9*50,8*50);
        MazeBlock mazeBlock51 = new MazeBlock();
        addObject(mazeBlock51,10*50,10*50);
        MazeBlock mazeBlock52 = new MazeBlock();
        addObject(mazeBlock52,9*50,10*50);
        mazeBlock51.setLocation(8*50,8*50);
        mazeBlock52.setLocation(9*50,10*50);
        mazeBlock52.setLocation(8*50,9*50);
        MazeBlock mazeBlock53 = new MazeBlock();
        addObject(mazeBlock53,10*50,10*50);
        mazeBlock53.setLocation(8*50,10*50);
        MazeBlock mazeBlock54 = new MazeBlock();
        addObject(mazeBlock54,10*50,11*50);
        MazeBlock mazeBlock55 = new MazeBlock();
        addObject(mazeBlock55,10*50,10*50);
    }
    
    public Contador getContador()
    {
       return cont;
    }
    
    
    
}
