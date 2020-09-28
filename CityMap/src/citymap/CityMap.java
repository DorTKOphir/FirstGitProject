package citymap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CityMap {
	private HashMap<Integer, HashMap<Integer, Integer>> cities;
	
	public CityMap(int nCities) {
		this.cities = new HashMap<Integer, HashMap<Integer, Integer>>(nCities);
	}
	
	public CityMap(CityMap other) {
		this.cities = new HashMap<Integer, HashMap<Integer, Integer>>(other.cities);
	}
	
	public int getDistance(int c1, int c2) {		
		return this.cities.get(c1).get(c2);
	}
	
	public int getSmallDistance() {
		int distance = 0;
		List<Integer> smallPath = new ArrayList<Integer>(); // Gets it from the getSmallPath() function
		for (int i = 0; i < (smallPath.size() - 1); i++) {
			distance += getDistance(smallPath.get(i), smallPath.get(i + 1));
		}
		return distance;
	}
	
}
