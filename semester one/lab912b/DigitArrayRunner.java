
/**
 * Write a description of class DigitArrayRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DigitArrayRunner
{
    // instance variables - replace the example below with your own
    
    /**
     * Constructor for objects of class DigitArrayRunner
     */
    public DigitArrayRunner()
    {
        // initialise instance variables
     
    }
    public static void main(){
    DigitArray ar1 = new DigitArray(123456789);
    ar1.loadArray();
    System.out.print("Digits: ");
    ar1.getDigits();
    }
  
}
