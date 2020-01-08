
/**
 * Write a description of class CalcRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CalcRunner
{
    // instance variables - replace the example below with your own
    
    public CalcRunner()
    {
        // initialise instance variables
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
  public static void main(){
    Calc c1 = new Calc(50,0);
    System.out.println("Sum: " + c1.add());
    System.out.println("Difference: " + c1.subtract());
    System.out.println("Product: " + c1.multiply());
    System.out.println(c1.divide());
    System.out.println(c1.moduloDivide());

    
    }
}
