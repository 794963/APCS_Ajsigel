
/**
 * Write a description of class StringSearcher here.
 *
 * @author (jaan sigel
 * @version (1031
 */
public class Student
{
    // instance variables - replace the example below with your own

    char someChar = ' ';
     int count = 0;
     String fName = "",mName= "",lName = "",fullName ="";
     String str;
     String gpa="";
     int stuNum = 0;
    
    /**
     * Constructor for objects of class Person
     */
    public Student(String x)
    {
        // initialise instance variables
        str = x;
    }
    public void parseName(String s){
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == someChar) {
                count++;
            }
        }

        if(s.indexOf(",")>-1 && s.indexOf(" ")>-1){
            lName = s.substring(0,s.indexOf(","));
            fName = s.substring(s.indexOf(" ")+1,s.lastIndexOf(" "));
            if(count != 2){
                mName = "";
            }else{
              mName = s.substring(s.lastIndexOf(" ")+1);
            }
        }else if(s.indexOf(" ")>-1){
            fName = s.substring(0,s.indexOf(" "));
            if(count != 2){
                mName = "";
            }else{
                mName = s.substring(s.indexOf(" ")+1,s.lastIndexOf(" "));
            }
            lName = s.substring(s.lastIndexOf(" ")+1);
        }
        fullName= lName +", "+ fName + " " + mName;
}
public String getName(){
    return fullName;
}
public void gpaSetter(String z){
    gpa = z;
}
public String gpaGetter(){
    return gpa;
}
public void stuNumSetter(int x){
stuNum=x;
}
public int stuNumGetter(){
return stuNum;
}
}
