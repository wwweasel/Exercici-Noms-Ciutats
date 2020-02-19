
public class Fase4 {

	public static void main(String[] args) {
		// 
		String barcelona = "Barcelona";
		String madrid = "Madrid";
		String valencia = "Valencia";
		String malaga = "Malaga";
		String cadiz = "Cadiz";
		String santander = "Santander";
		
		String[] barcelona_arr = new String[barcelona.length()];
		String[] madrid_arr = new String[madrid.length()];
		String[] valencia_arr = new String[valencia.length()];
		String[] malaga_arr = new String[malaga.length()];
		String[] cadiz_arr = new String[cadiz.length()];
		String[] santander_arr = new String[santander.length()];
		
		// Fill array
		for (int i = 0; i < barcelona_arr.length; i++) {
			barcelona_arr[i] = Character.toString( barcelona.charAt(i) );
		}
		
		// print in reverse
		for (int i = barcelona_arr.length-1; i >= 0 ; i--) {
			System.out.println(barcelona_arr[i]);
		}
		
		

	}

}
