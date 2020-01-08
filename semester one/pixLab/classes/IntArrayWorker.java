package classes;

public class IntArrayWorker
{
  /** two dimensional matrix */
  private int[][] matrix = null;
  private int[][] evenOdd = new int[10][10];
  
  /** set the matrix to the passed one
    * @param theMatrix the one to use
    */
  public void setMatrix(int[][] theMatrix)
  {
    matrix = theMatrix;
  }
  
  /**
   * Method to return the total 
   * @return the total of the values in the array
   */
  public int getTotal()
  {
    int total = 0;
    for (int row = 0; row < matrix.length; row++)
    {
      for (int col = 0; col < matrix[0].length; col++)
      {
        total = total + matrix[row][col];
      }
    }
    return total;
  }
  
  /**
   * Method to return the total using a nested for-each loop
   * @return the total of the values in the array
   */
  public int getTotalNested()
  {
    int total = 0;
    for (int[] rowArray : matrix)
    {
      for (int item : rowArray)
      {
        total = total + item;
      }
    }
    return total;
  }
  
  /**
   * Method to fill with an increasing count
   */
  public void fillCount()
  {
    int numCols = matrix[0].length;
    int count = 1;
    for (int row = 0; row < matrix.length; row++)
    {
      for (int col = 0; col < numCols; col++)
      {
        matrix[row][col] = count;
        count++;
      }
    }
  }
  
  /**
   * print the values in the array in rows and columns
   */
  public void print()
  {
    for (int row = 0; row < matrix.length; row++)
    {
      for (int col = 0; col < matrix[0].length; col++)
      {
        System.out.print( matrix[row][col] + " " );
      }
      System.out.println();
    }
    System.out.println();
  }
  
  
  /** 
   * fill the array with a pattern
   */
  public void fillPattern1()
  {
    for (int row = 0; row < matrix.length; row++)
    {
      for (int col = 0; col < matrix[0].length; 
           col++)
      {
        if (row < col)
          matrix[row][col] = 1;
        else if (row == col)
          matrix[row][col] = 2;
        else
          matrix[row][col] = 3;
      }
    }
  }
  public int getCount(int val)
 {
   int times = 0;
   for(int i = 0; i<matrix.length;i++){
    for(int j=0; j<matrix[i].length;j++){
    if(matrix[i][j]==val)times++;
    }
    }
    return times;
 }
 public void loadEvensOdds(){
     int rand = 0;
     for(int i=0; i<evenOdd.length;i++){
        for(int j=0; j<evenOdd.length;j++){
            rand = (int)Math.random()*10+1;
            if(j<evenOdd.length/2){
                if(rand%2==0){
                    evenOdd[i][j]=rand;
                }else{
                    evenOdd[i][j]=rand+1;
                }
            }else{
                if(rand%2==1){
                    evenOdd[i][j]=rand;
                }else{
                    evenOdd[i][j]=rand+1;
                }
            }
        }
        }
    }
 public void printArr(){
     System.out.println();
     for(int i=0; i<evenOdd.length;i++){
        for(int j=0; j<evenOdd.length;j++){
            System.out.print(evenOdd[i][j] + " ");
        }
        System.out.println();
        }
     System.out.println();
    }
 public void flipVertical(){
     loadEvensOdds();
     printArr();
     for(int i=0; i<evenOdd.length;i++){
        for(int j=0; j<evenOdd.length/2;j++){
            swap(evenOdd,i,j,evenOdd.length-1-j);
        }
        }
     printArr();
 }
 public void swap(int[][] a, int r, int i1, int i2){
     int temp=a[r][i1];
     a[r][i1]=a[r][i2];
     a[r][i2]=temp;
    }
 public  int getLargest()
 { // test when largest is last
   int most = 0;
   for(int i = 0; i<matrix.length;i++){
    for(int j=0; j<matrix[i].length;j++){
    if(matrix[i][j]>most)most=matrix[i][j];
    }
    }
    return most;
 }
 public int getColTotal(int c)
 {
     int sum = 0;
   for(int i = 0; i<matrix.length;i++){
    if(c<matrix[i].length){
    sum+=matrix[i][c];
}
    }
    return sum;
 }
}