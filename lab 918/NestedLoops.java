
/**
 * Write a description of class NestedLoops here.
 *
 * @author (Jaan Sigel)
 * @version (918)
 */
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
        int n = 10;
        probC(n);
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
}
