/*
 * @author Divyansh Bhardwaj
 * @version 1.0
 * */
package main;

import java.util.Scanner;
// uncomment the above line to use input in your program.


public class Gravity {
	public static void main(String[] args) {
        double speed;
        double time;
        double distance;
        double gravity = 9.8;
        Scanner scan = new Scanner(System.in);
        time = scan.nextDouble();
        speed = gravity * time;
        distance = ((g * time * time) / 2);
        System.out.println("The speed of the object at " + time + " seconds after its release is " + speed + "and the distance the object has travelled in the " + time + " seconds after the relase is " + distance + "");
		 *   c. Calculate the result and print it to the screen.
		 * */
	}
	// P.S: Refer to the README.md file for the problem statement, input & output.
}
