package MarsRoverTW;

public class Navigation {
	
	static String Navigation(String dirFacing, char instruction) {
		//Switch statements to determine current facing and left and right cardinal directions
		if (dirFacing.equalsIgnoreCase("N")) {
			switch (instruction) {
			case 'R':
				dirFacing = "E";
				break;
			case 'L':
				dirFacing = "W";
				break; 
			case 'M':
				MarsRoverTW.y++;
				break;
			}
		} else if (dirFacing.equalsIgnoreCase("E")) {
			switch (instruction) {
			case 'R':
				dirFacing = "S";
				break;
			case 'L':
				dirFacing = "N";
				break; 
			case 'M':
				MarsRoverTW.x++;
				break;
			}
		} else if (dirFacing.equalsIgnoreCase("S")) {
			switch (instruction) {
			case 'R':
				dirFacing = "W";
				break;
			case 'L':
				dirFacing = "E";
				break;
			case 'M':
				MarsRoverTW.y--;
				break;
			}
		} else if (dirFacing.equalsIgnoreCase("W")) {
			switch (instruction) {
			case 'R':
				dirFacing = "N";
				break;
			case 'L':
				dirFacing = "S";
				break; 
			case 'M':
				MarsRoverTW.x--;
				break;
			}
		}
		//returns the new direction heading/facing
		return dirFacing;
	}

}
