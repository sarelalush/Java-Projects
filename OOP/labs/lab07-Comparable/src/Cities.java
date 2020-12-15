import java.io.File;
import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;


public class Cities implements Comparator<City>{
	private SortedSet<City> cityList;
	
	public Cities() {
		cityList = new TreeSet<City>();
		try {
			this.init("C:\\Users\\Sarel The Pro\\eclipse-workspace\\ex7\\src\\cities.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void init(String filename) throws FileNotFoundException {
		File f = new File(filename);
		Scanner sc = new Scanner(f).useDelimiter("[\t\n]");
		while(sc.hasNext()) {
			String city = sc.next();
			String country = sc.next();
			int numberOfPopulation = sc.nextInt();
			int areaSize = sc.nextInt();
			this.cityList.add(new City(city,country,numberOfPopulation,areaSize));
		}
		sc.close();
	}
	public void listAlphabetically() {
		System.out.println();
		System.out.println("City list");
		System.out.println();
		for(City c:this.cityList) {
			System.out.print(c);
			System.out.println();
		}
	}
	public void listByPopulation() {
		Comparator <City> comparator = new PopComparator();
		SortedSet<City> byPop = new TreeSet<City>(comparator);
		for(City c:this.cityList) {
			byPop.add(c);
		}
		System.out.println();
		System.out.println("City list by population");
		System.out.println();
		for(City c:byPop) {
			System.out.print(c);
			System.out.println();
		}
	}
	public void listByDensity() {
		Comparator <City> comparator = new DenistyComparator();
		SortedSet<City> byDenisty = new TreeSet<City>(comparator);
		for(City c:this.cityList) {
			byDenisty.add(c);
		}
		System.out.println();
		System.out.println("City list by density");
		System.out.println();
		for(City c:byDenisty) {
			System.out.printf("%s",c);
			System.out.printf(" density: %d\n",c.getnumberOfPopulation()/c.getAreaSize());
		}
	}
	public void listByCountry(String country) {
		SortedSet<City> byCountry = new TreeSet<City>();
		for(City c:this.cityList) {
			if(c.getCountryName().startsWith(country))
				byCountry.add(c);
		}
		System.out.println();
		System.out.printf("Cities in %s:",country);
		System.out.println();
		System.out.println();
		for(City c:byCountry) {
			System.out.print(c);
			System.out.println();
		}
	}
	@Override
	public String toString() {
		return "";
	}
	@Override
	public int compare(City c1, City c2) {
		// TODO Auto-generated method stub
		return c1.getCityName().compareTo(c2.getCityName());
	}
	
}
