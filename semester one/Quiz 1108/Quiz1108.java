
/**
 * Write a description of class Quiz here.
 *
 * @author (Jaan Sigel)
 * @version (1108)
 */
import java.util.*;
public class Quiz1108{
    public Quiz1108(){
        int[] x = {1, 2, 3, 4, 5};
        ArrayList<Integer> n1 = makeList(x);
        int[] y = reverseList(n1);
        printList(n1);
        printArray(y);
    }
 
    public ArrayList<Integer> makeList(int[] nums){ 
        ArrayList<Integer> sample = new ArrayList<Integer>();
        for(int i=0; i<nums.length;i++){
        sample.add(nums[i]);
        }
        return sample;
    }  
    public int[] reverseList(ArrayList<Integer> nums){
        int[] sample = new int[nums.size()];
        int x=0;
        for(int i=nums.size()-1; i>=0;i--){
        sample[x] = nums.get(i);
        x++;
        }
        return sample;
    }
    public void printList(ArrayList<Integer> a){
        for(int i=0; i<a.size();i++){
        System.out.print(a.get(i)+", ");
        }
        System.out.println();
    }
    public void printArray(int[] a){
        for(int i=0; i<a.length;i++){
        System.out.print(a[i]+", ");
        }
        System.out.println();
    }
    public static void main(){
        Quiz1108 q = new Quiz1108();
    }
}
