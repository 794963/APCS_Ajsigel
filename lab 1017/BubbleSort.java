
/**
 * BubbleSorting here.
 *
 * @author (Jaan Sigel)
 * @version (1017)
 */
public class BubbleSort
{
    // instance variables - replace the example below with your own
    private int nums[];

    /**
     * Constructor for objects of class BubbleSort
     */
    public BubbleSort()
    {
        // initialise instance variables
        loadArray(10);
        printArray();
       nums = bubbleSort(nums);
       printArray();
        
    }
    public void printArray(){
        for(int i = 0; i < nums.length; i++){ 
            System.out.print(nums[i] + ", ");//  print all nums
            
        }
        System.out.println();
    }
    public void loadArray(int x){
        nums = new int[x];
        for(int i = 0; i < nums.length; i++){     //  length 10
            nums[i] = (int)(Math.random()*10) + 1;  //  last index = 9
        }
    }
    
    public int[] bubbleSort(int[] z){
        int [] x = z;
        for(int i = x.length-1; i>0; i--){
            for(int j=0; j<i; j++){
                
               if(x[j]>x[j+1]){
                   int temp = x[j];
        x[j]=x[j+1];
        x[j+1]=temp;
                }
              
            }
            
        }
        return x;
    }
   public static void main(){
       BubbleSort bs = new BubbleSort();
    }
}
