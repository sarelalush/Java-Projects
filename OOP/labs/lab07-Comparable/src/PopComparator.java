import java.util.Comparator;

public class PopComparator implements Comparator<City>{
	
	@Override
	public int compare(City c1, City c2) {
		return c2.getnumberOfPopulation() - c1.getnumberOfPopulation();
	}
}
