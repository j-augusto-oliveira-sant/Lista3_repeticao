package exercicios_resolvidos;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("População pais A: ");
		float country_a = scan.nextFloat();
		System.out.println("População pais B: ");
		float country_b = scan.nextFloat();
		System.out.println("Crescimento pais A: ");
		float growth_a = scan.nextFloat();
		System.out.println("Crescimento pais B: ");
		float growth_b = scan.nextFloat();
		int year = 0;
		while(country_a<country_b) {
			country_a += (country_a*growth_a);
			country_b += (country_b*growth_b);
			year += 1;
		}
		System.out.println(country_a);
		System.out.println(country_b);
		System.out.printf("Necessario %d anos para passar Pais B",year);
		scan.close();
	}

}
