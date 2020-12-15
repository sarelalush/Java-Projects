import java.util.Comparator;

public class DenistyComparator implements Comparator<City> {

	@Override
	public int compare(City c1, City c2) {
		double density1 = (double)c1.getnumberOfPopulation() / (double) c1.getAreaSize();
		double density2 = (double)c2.getnumberOfPopulation() / (double) c2.getAreaSize();
		if (density1<density2)
			return -1;
		else if(density1>density2)
			return 1;
		else
			return 0;
	}

}
