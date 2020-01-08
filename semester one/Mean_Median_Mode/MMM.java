
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
    int maxValue[];
    /**
     * Constructor for objects of class MMM
     */
    public MMM()
    {
        loadArray();
    }

    public void loadArray(){
        nums = new int[1000];
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

    public void getMode(){
        Arrays.sort(nums);
        maxValue = new int[nums.length];
        int maxCount = 0;
        int pTimes = 0; 
        for (int i = 0; i < nums.length; ++i) {
            int count = 0;
            for (int j = 0; j < nums.length; ++j) {
                if (nums[j] == nums[i]) ++count;
            }
            if (count >= maxCount && count != 1) {
                
                if(count > maxCount){
                    maxValue = new int[nums.length];
                    pTimes = 0;
                    maxValue[pTimes] = nums[i];
                    pTimes++;
                }else{

                    maxValue[pTimes] = nums[i];
                    pTimes++;

                }
                maxCount = count;
            }
        }
        if (maxCount == 0){
            for(int i = 0; i < nums.length; i++){ 
                System.out.print(nums[i] + ", ");//  print all nums
            }
            System.out.print(" (x1)");
        }else{
            for(int i = 0; i < pTimes; i++){
                if (i!=0){
                    if(maxValue[i] != maxValue[i-1]){
                        System.out.print(maxValue[i] + " ");//  print all nums
                    }
                } else{
                    
                    System.out.print(maxValue[i] + " ");
                }   
            }
            System.out.print(" (x"+maxCount+")");
        }
        
    }

}
