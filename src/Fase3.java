import java.util.Arrays;

public class Fase3 {

	public static void main(String[] args) {
		// Fill array
		String barcelona = "Barcelona";
		String madrid = "Madrid";
		String valencia = "Valencia";
		String malaga = "Malaga";
		String cadiz = "Cadiz";
		String santander = "Santander";
		
		String[] cities = new String[6];
		cities[0] = barcelona;
		cities[1] = madrid;
		cities[2] = valencia;
		cities[3] = malaga;
		cities[4] = cadiz;
		cities[5] = santander;
		
		// Replace a for 4
		for (int i=0; i < cities.length; i++) {
			cities[i] = cities[i].replace("a","4");
		}
		
		// Order array
		Arrays.sort(cities);
		
		for (String city : cities) {
			System.out.println(city);
		}
		
	}

}
