
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
        mat = sort(mat);
        printArray();
        System.out.println("Sum: " + sumAll());
        System.out.println();
        //mode no work yet
        System.out.println("Greatest Number: " + modeList());
        System.out.println();
        printArrayList( median(), "Median");
        System.out.println();
        printArrayList( findAvgRows(), "Mean");
        System.out.println();
        System.out.println("Average of the 2D Array: " + findAvg2D());
    }

    public static void main(){
        GridTester gt = new GridTester();
    }
    public int length2D(){
    int length =0;
    for(int i =0; i < mat.length; i++){
        for(int j =0; j < mat[i].length; j++){
            length+=1;
        }
    }
    return length;
    }
    public void printMode(ArrayList<Integer> x, String iden){
        int y =1;
        System.out.println();
        for(int i = 0; i <x.size(); i++){
        if(x.get(i)!=-1){
        System.out.print( y +" Array " +iden+ ": " + x.get(i)); 
    }else{
    System.out.println();
    y++;
    }
        }
    }
    public void printArrayList(ArrayList<Double> x, String iden){
        for(int i = 0; i <x.size(); i++){
        System.out.println((i+1) +" Array " +iden+ ": " + x.get(i)); 
        }
    }
    public int[][] sort(int[][] x){
for(int h =0; h < mat.length; h++){
        for (int i = x[h].length-1;i > 0; i--){
   for (int j = 0; j < i; j++){
     if (x[h][j] > x[h][j+1]) {
           swap(x, j, j+1, h);
     }         
   }
}
}
        return x;
    }
    public void loadArray(){
    for(int i =0; i < mat.length; i++){
        for(int j =0; j < mat[i].length; j++){
            mat[i][j]=(int)(Math.random()*10+1);
        }
    }
    }
    public void printArray(){
    for(int i =0; i < mat.length; i++){
        for(int j =0; j < mat[i].length; j++){
            System.out.print(mat[i][j] + ", ");
        }
        System.out.println();
    }
    System.out.println();
    }
     public ArrayList<Integer> sumRows(){
    ArrayList<Integer> sumRow = new ArrayList<Integer>(); 
    int sum =0;
    for(int i =0; i < mat.length; i++){
        for(int j =0; j < mat[i].length; j++){
            sum+=mat[i][j];
        }
        sumRow.add(sum);
        sum =0;
    }
    return sumRow;
    }
    public ArrayList<Double> findAvgRows(){
        double avg = 0;
        ArrayList<Double> avgList = new ArrayList<Double>();
        for(int i=0; i<mat.length; i++){
        avg=sumRows().get(i)/mat[i].length;
        avgList.add(avg);
    }
        return avgList;
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
    public ArrayList<Double> median(){
    ArrayList<Double> medianList = new ArrayList<Double>();
    double median = 0;
    for(int i =0; i < mat.length; i++){
        
            if (mat[i].length%2==0){
            median =(mat[i][(mat.length/2)-1]+mat[i][(mat.length/2)+1])/2;
            medianList.add(median);
        }else{
            medianList.add(Double.valueOf(mat[i][(mat.length/2)]));
        }
        
    }
    return medianList;
    }
    public ArrayList<Integer> modeList(){
    ArrayList<Integer> mode = new ArrayList<Integer>();
    
    
    
    int maxCount = 0;
    int pTimes = 0; 
    for(int h =0; h < mat.length; h++){
        for (int i = 0; i < mat[h].length; ++i) {
            int count = 0;
            for (int j = 0; j < mat[h].length; ++j) {
                if (mat[h][j] == mat[h][i]) ++count;
            }
            if (count >= maxCount && count > 1) {
                
                if(count > maxCount){
                    mode.clear();
                    pTimes = 0;
                    mode.add(mat[h][i]);
                    pTimes++;
                }else{

                    mode.add(mat[h][i]);
                    pTimes++;

                }
                maxCount = count;
            }
        }
        mode.add(-1);
    }
    return mode;
    }
    
    public double findAvg2D(){
        double avg = 0;
        avg=sumAll()/length2D();
        return avg;
    }
    public void swap(int[][] list, int i, int j, int h){
        int temp      =   list[h][i];
      list[h][i]   =   list[h][j]; 
      list[h][j]   =   temp;
  }
}

