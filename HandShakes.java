/*HandShakes.java
 *Computes and displays the total number of handshakes that occur after all guests have arrived*/



package edu.cuny.lehman.cmp326;
import java.util.Scanner;
public class HandShakes {

	public static void main(String[] args) {
		Scanner keyboard= new Scanner(System.in);
		System.out.println("How many guests are invited to the party? "); // Prompts user
		int guests= keyboard.nextInt();
		int totalShakes=0;
		for (int counts= 1; counts<=guests; counts++){
			totalShakes+= counts;
			System.out.println("When Guest " + counts + " arrives, Handshakes="+ counts + ", Total Handshakes="+ totalShakes);
			System.out.println("Hello World");
		}

	}

}
