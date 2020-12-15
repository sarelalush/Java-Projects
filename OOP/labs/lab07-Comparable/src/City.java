import java.io.FileNotFoundException;

public class City implements Comparable<City>{
	private String cityName;
	private String countryName;
	private int numberOfPopulation;
	private int areaSize;
	
	public City(String cityName,String countryName,int numberOfResidents,int areaSize) {
		this.cityName = cityName;
		this.countryName = countryName;
		this.numberOfPopulation = numberOfResidents;
		this.areaSize = areaSize;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public int getnumberOfPopulation() {
		return numberOfPopulation;
	}
	public void setnumberOfPopulation(int numberOfPopulation) {
		this.numberOfPopulation = numberOfPopulation;
	}
	public int getAreaSize() {
		return areaSize;
	}
	public void setAreaSize(int areaSize) {
		this.areaSize = areaSize;
	}
	@Override
	public int compareTo(City c) {
		// TODO Auto-generated method stub
		return this.cityName.compareTo(c.getCityName());
	}
	public String toString() {
		return String.format("%s(%s) population: %d area: %d",this.cityName,this.countryName,this.numberOfPopulation,this.areaSize,this.numberOfPopulation/this.areaSize);
	}
}
	
	
	

