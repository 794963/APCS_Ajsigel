
/**
 * Write a description of class StringSearcher here.
 *
 * @author (jaan sigel
 * @version (1031
 */
import java.util.*;
public class StringSearcher
{
    // instance variables - replace the example below with your own
    static String[] str = new String[0];
    static ArrayList<String> aL= new ArrayList<String>();
    /**
     * Constructor for objects of class StringSearcher
     */
    public StringSearcher()
    {
        // initialise instance variables
       
    }

    public static void main(){
        Scanner kb = new Scanner(System.in);
        String inputStr = "";
        int x = 0;
        while(!inputStr.equals("1")){
        System.out.println("Enter phrases or words, then when done press 1 to enter keyword");
        
        inputStr = kb.nextLine();
        inputStr = inputStr.toLowerCase();
        inputStr = inputStr.trim();
        str=extendArray(str, 1);
        str[x]=inputStr;
        x++;
    }
    System.out.println("Enter a keyword to search the list for");
    inputStr = kb.nextLine();
    aL = wordChecker(str,inputStr);
    for(int i=0;i<aL.size();i++){
    System.out.print(aL.get(i));
    System.out.print(", ");
    }
    }
    public static ArrayList<String> wordChecker(String[] str, String key){
        ArrayList<String> ret= new ArrayList<String>();
        for(int i=0;i<str.length;i++){
        if(str[i].indexOf(key)>-1){
        ret.add(str[i]);
        }
        }
        return ret;
    }
    public static String[] extendArray(String[] p, int n){
        
        String[] p2 = new String[p.length+n];
        for(int i = 0; i < p.length;i++){
        p2[i] = p[i];
    }
    
        return p2;
    }
}
