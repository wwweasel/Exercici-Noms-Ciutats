import java.util.Arrays;
import java.util.Scanner;

public class Fase2 {

	public static void main(String[] args) {
		// 
		String barcelona = "Barcelona";
		String madrid = "Madrid";
		String valencia = "Valencia";
		String malaga = "Malaga";
		String cadiz = "Cadiz";
		String santander = "Santander";
		
		// Fill array
		String[] cities = new String[6];
		cities[0] = barcelona;
		cities[1] = madrid;
		cities[2] = valencia;
		cities[3] = malaga;
		cities[4] = cadiz;
		cities[5] = santander;
		
		// Order array
		Arrays.sort(cities);
		
		for (String city : cities) {
			System.out.println(city);
		}

	}

}
