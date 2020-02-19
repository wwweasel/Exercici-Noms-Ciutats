import java.util.Scanner;

public class Fase1 {

	public static void main(String[] args) {
		System.out.println("Enter six cities");
		Scanner scan = new Scanner(System.in);
		
		String barcelona = scan.nextLine();
		String madrid = scan.nextLine();
		String valencia = scan.nextLine();
		String malaga = scan.nextLine();
		String cadiz = scan.nextLine();
		String santander = scan.nextLine();
		
		
		System.out.println("\t" + barcelona+ "\n\t" +  madrid + "\n\t" + valencia + "\n\t" + malaga + "\n\t" + cadiz + "\n\t" + santander );
	}

}
