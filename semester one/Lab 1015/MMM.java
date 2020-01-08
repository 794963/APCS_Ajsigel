
/**
 * Write a description of class MMM here.
 *
 * @author (Jaan Sigel)
 * @version (1015)
 */
import java.util.ArrayList;
import java.util.Collections;
public class MMM
{
    // instance variables - replace the example below with your own
    ArrayList<Integer> nums = new ArrayList<Integer>();
    ArrayList<Integer> maxValue = new ArrayList<Integer>();
    int length = 1000;
    /**
     * Constructor for objects of class MMM
     */
    public MMM()
    {
        loadArray();
    }

    public void loadArray(){
        for(int i = 0; i < length; i++){     //  length 10
            nums.add((int)(Math.random()*10) + 1);  //  last index = 9
        }
    }

    public void printArray(){
        for(int i = 0; i < length; i++){ 
            System.out.print(nums.get(i) + ", ");//  print all nums
        }
    }

    public int getSum(){
        int sum = 0;
        for(int i = 0; i < length; i++){ 
            sum = sum + nums.get(i);  //  add all in nums to values to sum
        }
        return sum;
    }

    public double getMean(){
        return getSum()/length;

    }

    public double getMedian(){
        Collections.sort(nums);
        if (length%2==0){
            return((nums.get((length/2)-1)+nums.get((length/2)+1))/2);
        }else{
            return(nums.get((length/2)));
        }
    }

    public void getMode(){
        Collections.sort(nums);
        int maxCount = 0;
        int pTimes = 0; 
        for (int i = 0; i < length; ++i) {
            int count = 0;
            for (int j = 0; j < length; ++j) {
                if (nums.get(j) == nums.get(i)) ++count;
            }
            if (count >= maxCount && count != 1) {
                
                if(count > maxCount){
                    maxValue.clear();
                    pTimes = 0;
                    maxValue.add(nums.get(i));
                    pTimes++;
                }else{

                    maxValue.add(nums.get(i));
                    pTimes++;

                }
                maxCount = count;
            }
        }
        if (maxCount == 0){
            for(int i = 0; i < length; i++){ 
                System.out.print(nums.get(i) + ", ");//  print all nums
            }
            System.out.print(" (x1)");
        }else{
            for(int i = 0; i < pTimes; i++){
                if (i!=0){
                    if(maxValue.get(i) != maxValue.get(i-1)){
                        System.out.print(maxValue.get(i) + " ");//  print all nums
                    }
                } else{
                    
                    System.out.print(maxValue.get(i) + " ");
                }   
            }
            System.out.print(" (x"+maxCount+")");
        }
        
    }

}
