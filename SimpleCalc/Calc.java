
/**
 * Write a description of class Calc here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Calc
{
    // instance variables - replace the example below with your own
    private int num1,num2;

    /**
     * Constructor for objects of class Calc
     */
    public Calc(int x,int y)
    {
        // initialise instance variables
        num1 = x;
        num2 = y;
    }


    public int add()
    {
        // put your code here
        return num1 + num2;
    }
    
    public int subtract()
    {
        // put your code here
        return num1 - num2;
    }
    
    public int multiply()
    {
        // put your code here
        return num1 * num2;
    }
    public String divide()
    {
        // put your code here
        if (num2 != 0){
        return "Quotient: " + (num1 / num2);
    }else{
            return "Cannot divide by zero";
        }
    }
      public String moduloDivide()
    {
        // put your code here
         if (num2 != 0){
        return "Remainder: " + (num1 % num2);
    }else{
            return "Cannot mod by zero";
        }
    }
}
