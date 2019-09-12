
/**
 * Write a description of class MazeWalker here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MazeWalker
{
    // instance variables - replace the example below with your own
    private int i = 0;

    /**
     * Constructor for objects of class MazeWalker
     */
    public MazeWalker()
    {
    } // initialise instance variables
        
    public static void run(){
        Maze maze = new Maze(2);
        MazeWalker mazeWalker = new MazeWalker();
        mazeWalker.walkMaze(maze, maze.getMazeBot());
    }

    
    public void walkMaze(Maze maze, MazeBot mazeBot) {
        while(mazeBot.didNotReachGoal() == true){
            if(mazeBot.canMoveForward() == true ){
            mazeBot.moveForward();
            if(mazeBot.getBreadCrumbObject() == null){
            BreadCrumb BC = new BreadCrumb("i"+"b",i);
            mazeBot.setBreadCrumbObject (BC);
            System.out.println(BC.getBCPos());
            i++;
        }
            }else if(mazeBot.canMoveForward() == false){
            mazeBot.turnRight();
            if(mazeBot.canMoveForward() == false){
            mazeBot.turnLeft();
            mazeBot.turnLeft();
        }
        }
        }
        if(mazeBot.didReachGoal() == true){
            mazeBot.signalSuccess();
        }else{
        mazeBot.signalError();
        }
    
    }
}
