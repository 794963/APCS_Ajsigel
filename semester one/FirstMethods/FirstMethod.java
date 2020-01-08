
/**
 * FirstMethods
 *
 * @author (Jaan Sigel)
 * @version (819)
 */
public class FirstMethod
{
    private static double x = 123456789.0;
    private static double y = 1234567890.0;
    //the two #'s that go doubleo the functions

    /**
     * Constructor for objects of class FirstClass
     */
    public FirstMethod()
    {
        // initialise instance variables
    
    }
    //adds
    public static double addEmUp(double a, double b){
        return a+b;
    }
    //subtracts
    public static double subtract(double a, double b){
        return a-b;
    }
    //multiplies
    public static double mult(double a, double b){
        return a*b;
    }
    //divides
    public static String divide(double a, double b){
        if (b!=0){
        String z = "Quotient: " + a/b;
        return z;
    }else{
        return "You cannot divide by 0";
    }
    }
    //greater than function 0 shows they are equal
    public static double greaterThan(double a, double b){
        if(a>b){
            return a;
        } else if(b>a){
            return b;
        }else{
            return 0;
        }
    }
    //main method
    public static void main(){
       double a = addEmUp(x,y);
       double b = subtract(x,y);
       double c = mult(x,y);
       String d = divide(x,y);
       double e = greaterThan(x,y);
       System.out.println("Sum: " + a);
       System.out.println("Difference: " + b);
       System.out.println("Product: " + c);
       System.out.println(d);
       System.out.println(e + " is the greater number");

    }
}
