
/**
 * Shape Runner
 *
 * @author (Jaan Sigel)
 * @version (827)
 */
public class ShapeWorldRunner
{
    // instance variables - replace the example below with your own
    private static int Cx1;
    private static int Cy1;
    private static int Cr1;

    /**
     * Constructor for objects of class ShapeWorldRunner
     */
    public ShapeWorldRunner()
    {
        // initialise instance variables
       
    }

    public static void main(){
        ShapeWorld sw = new ShapeWorld(800,800);
        
        Cx1 = 200;
        Cy1 = 200;
        Cr1 = 75;
        
        APCSTriangle triangle1 = new APCSTriangle(Cx1 - Cr1/2, Cy1 - (Cr1 - Cr1/5), Cx1 + Cr1/2, Cy1 -  (Cr1 - Cr1/5), Cx1, Cy1 - Cr1*2);
        sw.addTriangle(triangle1);
        
        APCSTriangle triangle2 = new APCSTriangle(Cx1 - Cr1/2, Cy1 + (Cr1 - Cr1/5), Cx1 + Cr1/2, Cy1 + (Cr1 - Cr1/5), Cx1, Cy1 + Cr1*2);
        sw.addTriangle(triangle2);
        
        APCSTriangle triangle3 = new APCSTriangle(Cx1 + (Cr1 - Cr1/5), Cy1 - Cr1/2, Cx1 + (Cr1 - Cr1/5), Cy1 + Cr1/2, Cx1 + Cr1*2, Cy1);
        sw.addTriangle(triangle3);
        
        APCSTriangle triangle4 = new APCSTriangle(Cx1 - (Cr1 - Cr1/5), Cy1 + Cr1/2, Cx1 - (Cr1 - Cr1/5), Cy1 - Cr1/2, Cx1 - Cr1*2, Cy1);
        sw.addTriangle(triangle4);
        
        APCSCircle circle = new APCSCircle(Cx1,Cy1,Cr1);
        sw.addCircle(circle);
        
        
        
        Cx1 = 600;
        Cy1 = 600;
        Cr1 = 50;
        
        APCSTriangle triangle5 = new APCSTriangle(Cx1 - Cr1/2, Cy1 - (Cr1 - Cr1/5), Cx1 + Cr1/2, Cy1 -  (Cr1 - Cr1/5), Cx1, Cy1 - Cr1*2);
        sw.addTriangle(triangle5);
        
        APCSTriangle triangle6 = new APCSTriangle(Cx1 - Cr1/2, Cy1 + (Cr1 - Cr1/5), Cx1 + Cr1/2, Cy1 + (Cr1 - Cr1/5), Cx1, Cy1 + Cr1*2);
        sw.addTriangle(triangle6);
        
        APCSTriangle triangle7 = new APCSTriangle(Cx1 + (Cr1 - Cr1/5), Cy1 - Cr1/2, Cx1 + (Cr1 - Cr1/5), Cy1 + Cr1/2, Cx1 + Cr1*2, Cy1);
        sw.addTriangle(triangle7);
        
        APCSTriangle triangle8 = new APCSTriangle(Cx1 - (Cr1 - Cr1/5), Cy1 + Cr1/2, Cx1 - (Cr1 - Cr1/5), Cy1 - Cr1/2, Cx1 - Cr1*2, Cy1);
        sw.addTriangle(triangle8);
        
        APCSCircle circle1 = new APCSCircle(Cx1,Cy1,Cr1);
        sw.addCircle(circle1);
    }
}
