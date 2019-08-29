
/**
 * Write a description of class Student here.
 *
 * @author (Jaan Sigel)
 * @version (821)
 */
public class Pumpkin
{
    // instance variables - replace the example below with your own
    private double rad;
    private int id;

    /**
     * Constructor for objects of class Student
     */
    public Pumpkin(double r, int id)
    {
            rad =r;
            this.id = id;
    }
    
    public double getRad(){
        return rad;
    }

    public int getId(){
        return id;
    }
    
}
