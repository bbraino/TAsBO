package MarsRoverTW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MarsRoverTW {

	//the variable can only be used by the methods within and outside of this class 
	public static int xPlateau = 0;//x-axis plateau coordinate
	public static int yPlateau = 0;//y-axis plateau coordinate 
	public static int x = 0; //x-axis position
	public static int y = 0; //y-axis position

	static Direction dirFacing;

	public static void main(String[] args)
	{
		String plateau;
		String roverPosition; 
		String instructions; 
		String dirFacing;
		int numberOfCount;

		//Scanner used for user input
		Scanner UserInput = new Scanner(System.in);
		System.out.println("*****************INPUT**************");
		System.out.println(" ");

		//Scanner used for user input
		Scanner robotCount = new Scanner(System.in);
		System.out.println("Number of robots");
		numberOfCount = robotCount.nextInt();
		String output = "*****************OUTPUT**************\n";

		System.out.println("Please enter upper-right coordinates of the plateau e.g 5 5. Press enter to exit the program");
		plateau = UserInput.nextLine();

		for(int i = 1; i< numberOfCount+1; i++)
		{
			System.out.println("Information for Robot" + " " + i);
			
			System.out.println("Please enter starting position e.g 1 2 N");
			roverPosition = UserInput.nextLine();
			
			
			System.out.println("Please enter instructions e.g LMLMLMLMM");
			instructions = UserInput.nextLine();


			//Separates the string '1 2 N' to be on separate lines e.g 1 (enter) 2 (enter) N (enter) 
			//assigns the variables to the values in the string
			String[] RoverStartPosition = roverPosition.split(" "); 
			dirFacing = RoverStartPosition[2];
			x = Integer.valueOf(RoverStartPosition[0]);
			y = Integer.valueOf(RoverStartPosition[1]);
			String[] plateauSize = plateau.split(" "); 
			xPlateau = Integer.valueOf(plateauSize[0]);
			yPlateau = Integer.valueOf(plateauSize[1]); 

			Plateau.Plateau();

			//the string is converted to a new character array 
			//type char is used because we are dealing with characters
			//for each instruction in the instructions character array, apply the Navigation method to get the new dirFacing value
			//this is an advanced for loop

			for (char instruction : instructions.toCharArray()) {

				if (instruction == 'L' || instruction == 'R' || instruction == 'M')
				{
					dirFacing = Navigation.Navigation(dirFacing, instruction);
				}

			}

			//Output
			output +=("New Position for robot" + " " + i + ":" + " " + x + " " + y + " " + dirFacing+"\n");
		}
		System.out.println(output);
	}
	
}
