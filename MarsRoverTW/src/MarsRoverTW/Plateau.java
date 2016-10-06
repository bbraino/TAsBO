package MarsRoverTW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Plateau {
	
	//Comparing the area of the plateau size to the current rover position coordinates
		static void Plateau()
		{
			if(MarsRoverTW.xPlateau*MarsRoverTW.yPlateau < MarsRoverTW.x*MarsRoverTW.y)
			{
				System.out.println("Sorry the plateau size is too small for these instructions!! Please press enter to exit the application");
				EnterButtonPress();
			}
		}

		//quits the application
		private static void EnterButtonPress() {

			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

			String s = null;
			try {
				s = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			if((s == null)||(s.length() == 0)||(s.trim().equals("")))
			{ 
				System.exit(0); 
			}
		}
		

}
