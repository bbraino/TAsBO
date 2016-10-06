package MarsRoverTW;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class NavigationTest {

	@Test
	public void NewDirectionFacingWithRespectToNorth(){

		String result1 = Navigation.Navigation("N",'R');
		String expected1 ="E";
		Assert.assertEquals(result1,expected1);

		String result2 = Navigation.Navigation("N",'L');
		String expected2 ="W";
		Assert.assertEquals(result2,expected2);
	}

	@Test
	public void NewDirectionFacingWithRespectToEast(){

		String result1 = Navigation.Navigation("E",'R');
		String expected1 = "S";
		Assert.assertEquals(result1,expected1);

		String result2 = Navigation.Navigation("E",'L');
		String expected2 = "N";
		Assert.assertEquals(result2,expected2);
	}

	@Test
	public void NewDirectionFacingWithRespectToSouth(){

		String result1 = Navigation.Navigation("S",'R');
		String expected1 = "W";
		Assert.assertEquals(result1,expected1);

		String result2 = Navigation.Navigation("S",'L');
		String expected2 = "E";
		Assert.assertEquals(result2,expected2);

	}

	public void NewDirectionFacingWithRespectToWest(){

		String result1 = Navigation.Navigation("W",'R');
		String expected1 = "N";
		Assert.assertEquals(result1,expected1);

		String result2 = Navigation.Navigation("W",'L');
		String expected2 = "S";
		Assert.assertEquals(result2,expected2);
	}	

	@Test
	public void NorthUnitMovement(){

		String result = Navigation.Navigation("N",'M');
		String expected = "N";
		Assert.assertEquals(result,expected);
	}
	
	@Test
	public void EastUnitMovement(){

		String result = Navigation.Navigation("E",'M');
		String expected = "E";
		Assert.assertEquals(result,expected);
	}
	
	@Test
	public void SouthUnitMovement(){
		
		String result = Navigation.Navigation("S",'M');
		String expected = "S";
		Assert.assertEquals(result,expected);
	}
	
	@Test
	public void WestUnitMovement(){
		
		String result = Navigation.Navigation("W",'M');
		String expected = "W";
		Assert.assertEquals(result,expected);
	}


}
