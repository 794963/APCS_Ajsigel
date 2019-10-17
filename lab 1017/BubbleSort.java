
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
        bubbleSort(nums);
       printArray();
        
    }
    public void printArray(){
        for(int i = 0; i < nums.length; i++){ 
            System.out.print(nums[i] + ", ");//  print all nums
        }
    }
    public void loadArray(int x){
        nums = new int[x];
        for(int i = 0; i < nums.length; i++){     //  length 10
            nums[i] = (int)(Math.random()*10) + 1;  //  last index = 9
        }
    }
    public void swap(int[] x , int i, int j){
        int temp = x[i];
        x[i]=x[j];
        x[j]=temp;
    }
    public int[] bubbleSort(int[] x){
        int minus = 0;
        int z = 0;
        for(int i = 0; i<x.length; i++){
            for(int j=0; j<x.length-minus; j++){
               if(x[z]>x[z++]){
                   swap(x,z,z++);
                }
                z++;
            }
            minus++;
            z = 0;
        }
        return x;
    }
   public static void main(){
       BubbleSort bs = new BubbleSort();
    }
}
