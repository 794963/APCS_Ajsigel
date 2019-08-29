
/**
 * Write a description of class PumpkinRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PumpkinRunner
{
    // instance variables - replace the example below with your own
    //private int idArray[];
    //idArray[]= new int[20];
;  // allocating memory to array
    public PumpkinRunner()
    {
        // initialise instance variables

    }

    public static void main(){
        
        //for (int i = 0; i < 20; i++) {
  
        //}
        Pumpkin p1 = new Pumpkin(3.5,1);
        System.out.println("Pumpkin's radius: " + p1.getRad() + "   Pumpkin's id: " + p1.getId());

        Pumpkin p2 = new Pumpkin(2.4,2);
        System.out.println("Pumpkin's radius: " + p2.getRad() + "   Pumpkin's id: " + p2.getId());

        Pumpkin p3 = new Pumpkin(8.9,3);
        System.out.println("Pumpkin's radius: " + p3.getRad() + "   Pumpkin's id: " + p3.getId());
    }
}
