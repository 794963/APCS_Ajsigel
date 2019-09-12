
/**
 * Write a description of class DigitArray here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DigitArray
{
    // instance variables - replace the example below with your own
    private int num,y;
    private int[] digits;
    private int i = 0;
    


    /**
     * Constructor for objects of class DigitArray
     */
    public DigitArray(int x)
    {
        // initialise instance variables
        num = x;
        
        while (num > 0){
            
            y=num%10;
            i++;
            num=num/10;
            
        }
        digits = new int[i];
        num = x;
    }

    public void loadArray(){
        while (num > 0){
            
            digits[i]=num%10;
            i++;
            num=num/10;
            
        }
    }
    public void getDigits(){
     for(int j = 0; j < digits.length; j++){ 
             System.out.print(digits[i] + ", ");
        }
    }
}
