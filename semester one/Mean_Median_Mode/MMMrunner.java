
/**
 * Write a description of class MMMrunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MMMrunner
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class MMMrunner
     */
    public MMMrunner()
    {
        // initialise instance variables

    }

    public static void main(){
        MMM meanFinder = new MMM();
        System.out.print("Array: ");
        meanFinder.printArray();
        System.out.println();
        System.out.println(" Sum: " + meanFinder.getSum());
        System.out.println(" Mean: " + meanFinder.getMean());
        System.out.println(" Median: " + meanFinder.getMedian());
        System.out.print(" Mode(s): ");
        meanFinder.getMode();
    }
}
