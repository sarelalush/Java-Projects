import java.io.FileNotFoundException;

public class Lab07Test {
	public static void main(String args[]) throws FileNotFoundException  //static method  
	{  
		Cities c = new Cities();
		c.listByDensity();
		c.listByPopulation();
		c.listAlphabetically();
		c.listByCountry("China");
	}  
}
