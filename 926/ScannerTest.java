
/**
 * Write a description of class ScannerRunner here.
 *
 * @author (Jaan Sigel)
 * @version (924)
 */
import java.util.Scanner;
public class ScannerTest{
    //static Person[] Person;
    
    public static void main(){
        Scanner kb = new Scanner(System.in);
        String inputStr = "";
       Person[] Person = new Person[1];
   
        int x=0;
        

        //  if(str1 == str2)
        while(!inputStr.equals("quit")){
            System.out.println("Enter a name or type \"quit\" to quit");
            inputStr = kb.nextLine();
            //System.out.println(inputStr);
            
            inputStr = inputStr.trim();
            if(!inputStr.equals("quit")){
            Person p1 = new Person(inputStr);
            
            Person[x] = p1;
            printNames(Person);
            Person = extendArray(Person,1);
        }
            
            x++;
      
    }
    }
    
    public static Person[] extendArray(Person[] p, int n){
        
        Person[] p2 = new Person[p.length+n];
        for(int i = 0; i < p.length;i++){
        p2[i] = p[i];
    }
    
        return p2;
    }
     public static void printNames(Person[] p){
         for(int i = 0; i < p.length;i++){
             p[i].printName();
             
    }
    System.out.println();
    }

}
