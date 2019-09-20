
/**
 * Write a description of class NestedLoops here.
 *
 * @author (Jaan Sigel)
 * @version (918)
 */
import java.lang.Math;
public class NestedLoops
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class NestedLoops
     */
    public NestedLoops()
    {
        // initialise instance variables
        
    }
    
    public static void main(){
        // int n = 7;
        // probE(n);
        probF();
    }
    public static void probA(){
        for(int i=1;i<=5;i++){
        for(int j=0;j<i;j++){
        System.out.print(i);
        }
        System.out.println();
        }
    }
    public static void probB(){
        for(int i=5;i>=2;i--){
        for(int j=0;j<8;j++){
        System.out.print(i);
        }
        System.out.println();
        }
    }
        public static void probC(int n){
        for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
        System.out.print(n);
        }
        System.out.println();
        }
    }
     public static void probD(int n){
        for(int i=0;i<n;i++){
        for(int j=0;j<n-i;j++){
        System.out.print("-");
        }
        System.out.print(i+1);
        System.out.println();
        }
    }
    public static void probE(int n){
        for(int i=0;i<n;i++){
        for(int j=0;j<n-i;j++){
        System.out.print(" ");
        }
        for(int h=0;h<i;h++){
        System.out.print("*");
        }
        System.out.println();
        }
    }
    public static void probF(){
        int x = 1;
        int y = 0;
        for(int i=0;i<13;i++){
        for(int j=0;j< Math.abs(6-i);j++){
        System.out.print(" ");
        }
        for(int h=0;h<x;h++){
        System.out.print("*");
        }
        if (x<13 && y == 0){
        x+=2;
    } else if (x>=13){
    x-=2;
    y = 1;
    } else{
    x-=2;
    }
        System.out.println();
        }
    }
    public static void probG(){
    
    }
    public static void line(){
    System.out.print("+ - - - - - - - - +");
    }
    public static void topDiamond(){
    System.out.println("|        +        |");
    //System.out.println("|       /+\       |");
    System.out.println("|      //+\\      |");
    
    }
}
