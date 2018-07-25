package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {
		int x = 50;
		int y = 600;
		int seperation = 150;

		// 2. create an array of 5 robots.
		Robot[] cc = new Robot[5];
		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < cc.length; i++) {
			x = i * seperation + 50;
			cc[i] = new Robot(x, y);
			cc[i].miniaturize();
			cc[i].setSpeed(10);

		}
		// 4. make each robot start at the bottom of the screen, side by side, facing up

		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.
		int smallestY = 600;
		int winner = 0;
		Random r = new Random();
		while (smallestY > 0) {
			for (int i = 0; i < cc.length; i++) {
				cc[i].move(r.nextInt(50));
				if (cc[i].getY() < smallestY) {
					winner= i;
					smallestY = cc[i].getY();
				}
			}
		}

		// 7. declare that robot the winner and throw it a party!
System.out.println("the winner is " + winner + " robot");
		// 8. try different races with different amounts of robots.

		// 9. make the robots race around a circular track.
	}
}