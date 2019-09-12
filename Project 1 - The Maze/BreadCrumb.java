
/**
 * Write a description of class BreadCrumb here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BreadCrumb
{
    // instance variables - replace the example below with your own
    private int breadCrumbPos;
    private String breadCrumbName;
    /**
     * Constructor for objects of class BreadCrumb
     */
    public BreadCrumb(String name, int pos)
    {
        breadCrumbPos = pos;
        breadCrumbName = name;
       
    }
    public int getBCPos(){
        return breadCrumbPos;
    }
    public String getBCName(){
        return breadCrumbName;
    }
}
