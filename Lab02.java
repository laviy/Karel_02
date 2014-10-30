/**
*
* Escape the Maze!!!! 
*
* @author <Yoni Lavi>  // replace <...> with your name
* @version <30/10/2014> // replace <...> with the date
*/

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab02 {

     public static void main(String[] args) {
          Display.openWorld("maps/maze.map");
     Display.setSize(8, 8);
     Display.setSpeed(5);
     Athlete bob = new Athlete();
     bob.putBeeper();
     bob.move();
     bob.putBeeper();
     bob.turnRight();
     bob.move();
     bob.putBeeper();
     bob.turnRight();
     bob.move();
     bob.putBeeper();
     bob.turnLeft();
     bob.move();
     bob.putBeeper();
     bob.turnLeft();
     bob.move();
     bob.putBeeper();
     bob.turnRight();
     bob.move();
     bob.putBeeper();
     bob.move();
     bob.putBeeper();
     bob.turnRight();
     bob.move();
     bob.putBeeper();
     bob.turnLeft();
     bob.move();
     bob.putBeeper();
     bob.turnLeft();
     bob.move();
     bob.putBeeper();
     bob.move();
     bob.putBeeper();
     bob.move();
     bob.putBeeper();
     bob.move();
     bob.putBeeper();
     bob.turnRight();
     bob.move();
     bob.putBeeper();
     bob.move();
     
     }
}
