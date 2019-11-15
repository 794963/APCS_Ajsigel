
/**
 * Write a description of class GridTester here.
 *
 * @author (Jaan Sigel
 * @version (1115
 */ 
import java.util.*;
public class GridTester
{
    // instance variables - replace the example below with your own
    int[][] mat = new int[10][10];

    /**
     * Constructor for objects of class GridTester
     */
    public GridTester()
    {
        // initialise instance variables
        loadArray();
        printArray();
        System.out.println("Sum: " + sumAll());
        System.out.println("Greatest Number: " + findGreatest());
        System.out.println("Instances of the Greatest Number: " + numTimes(findGreatest()));
        System.out.println("Average: " + findAvg());
    }

    public static void main(){
        GridTester gt = new GridTester();
    }
    public int length(){
    int length =0;
    for(int i =0; i < mat.length; i++){
        for(int j =0; j < mat[i].length; j++){
            length+=1;
        }
    }
    return length;
    }
    public void loadArray(){
    for(int i =0; i < mat.length; i++){
        for(int j =0; j < mat[i].length; j++){
            mat[i][j]=(int)(Math.random()*100+1);
        }
    }
    }
    public void printArray(){
    for(int i =0; i < mat.length; i++){
        for(int j =0; j < mat[i].length; j++){
            System.out.print(mat[i][j] + ", ");
        }
    }
    System.out.println();
    }
    public int sumAll(){
    int sum =0;
    for(int i =0; i < mat.length; i++){
        for(int j =0; j < mat[i].length; j++){
            sum+=mat[i][j];
        }
    }
    return sum;
    }
    public int findGreatest(){
    int greatest = 0;
    for(int i =0; i < mat.length; i++){
        for(int j =0; j < mat[i].length; j++){
            if(mat[i][j]>greatest){
                greatest = mat[i][j];
            }
        }
    }
    return greatest;
    }
    public int numTimes(int x){
    int times = 0;
    for(int i =0; i < mat.length; i++){
        for(int j =0; j < mat[i].length; j++){
            if(mat[i][j]==x){
                times+=1;
            }
        }
    }
    return times;
    }
    public double findAvg(){
        double avg = 0;
        avg=sumAll()/length();
        return avg;
    }
}
