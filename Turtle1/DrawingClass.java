
/**
 * Draws things w/ triangles
 *
 * @author (Jsigel)
 * @version (829)
 */
import java.awt.*;
public class DrawingClass
{


    /**
     * Constructor for objects of class DrawingClass
     */
    public DrawingClass()
    {
        // initialise instance variables
        
    }
    public static void main(){
    Turtle t;
    int size, turn;
    TurtleDrawingWindow canvas = new TurtleDrawingWindow();
    t = new Turtle(Turtle.NO_DEFAULT_WINDOW);
    t.jumpTo(0,0);
    canvas.add(t);
    canvas.setVisible(true);
    
    //first drawing
    t.penSize(5);
    size = 300;
    turn = 93;
    t.penColor(Color.blue);
    for (int i = 0; i < 120; i++){
     t.move(size);
     t.turn(turn);
    }
    
    //second drawing
    t.jumpTo(50.0,47.5);
    t.penSize(5);
    size = 200;
    turn = 93;
    t.penColor(Color.red);
    for (int i = 0; i < 120; i++){
     t.move(size);
     t.turn(turn);
    }
    
    
    //3rd drawing
    t.jumpTo(82.5,79);
    t.penSize(5);
    size = 135;
    turn = 93;
    t.penColor(Color.green);
    for (int i = 0; i < 120; i++){
     t.move(size);
     t.turn(turn);
    }
    
    t.hide();
    }

}
