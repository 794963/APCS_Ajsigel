
/**
 * Write a description of class SortTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class SortTester
{
    // instance variables - replace the enumListample below with your own
    ArrayList<Integer> numList = new ArrayList<Integer>();
    ArrayList<Integer> copy = new ArrayList<Integer>();
    /**
     * Constructor for objects of class SortTester
     */
    public SortTester(int x)
    {
        // initialise instance variables
        loadNumbers(x);
        printList();
       bubbleSort();
        printList();
    insertSort();
    printList();
    selectSort();
    printList();
    }
    public void loadNumbers(int n){
    for(int i=0; i<n;i++){
        numList.add((int)(Math.random()*100) + 1);
    }
    copy=numList;
    }
    public void swap(int i,int j){
        int temp = numList.get(i);
                   numList.set(i,numList.get(j));
                   numList.set(j,temp);
    }
    public void bubbleSort(){
       numList=copy; 
    for(int i = numList.size()-1; i>0; i--){
            for(int j=0; j<i; j++){
                
               if(numList.get(j)>numList.get(j+1)){
                   swap(j,j+1);
                }
              
            }
            
        }
    }
    public void insertSort(){
        numList=copy; 
    for(int i = 1; i<numList.size(); i++){
            
                int j = i;
                
               while((j>0) && (numList.get(j)<numList.get(j-1))){
                   swap(j,j-1);
                   j=j-1;
                }
            
        }
    }
    public void selectSort(){
        numList=copy; 
        
        for(int i = 0; i<numList.size(); i++){
            int y=i;
            for(int j=i; j<numList.size()-1; j++){

               if(numList.get(j)>numList.get(j+1)){
                   y=j+1;
                }
              
            }
            swap(i,y);
        }
    }
    public void printList(){
    for(int i = 0; i < numList.size(); i++){ 
            System.out.print(numList.get(i) + ", ");//  print all nums
            
        }
        System.out.println();
    }
}
