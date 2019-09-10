
/**
 * Write a description of class MMM here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Arrays;
public class MMM
{
    // instance variables - replace the example below with your own
    int nums[]; 
    /**
     * Constructor for objects of class MMM
     */
    public MMM()
    {
     loadArray();
    }
    
    public void loadArray(){
    nums = new int[10];
          for(int i = 0; i < nums.length; i++){     //  length 10
        nums[i] = (int)(Math.random()*10) + 1;  //  last index = 9
    }
    }
    public void printArray(){
        for(int i = 0; i < nums.length; i++){ 
            System.out.print(nums[i] + ", ");//  print all nums
        }
    }
    public int getSum(){
     int sum = 0;
     for(int i = 0; i < nums.length; i++){ 
         sum = sum + nums[i];  //  add all in nums to values to sum
        }
       return sum;
    }
    public double getMean(){
        return getSum()/nums.length;
        
    }
    public double getMedian(){
        Arrays.sort(nums);
        if (nums.length%2==0){
            return((nums[(nums.length/2)-1]+nums[(nums.length/2)+1])/2);
        }else{
            return(nums[(nums.length/2)]);
        }
    }
}
