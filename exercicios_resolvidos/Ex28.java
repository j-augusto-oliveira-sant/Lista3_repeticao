package exercicios_resolvidos;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex28 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num=1;
		int soma =0;
		int i =0;
		Integer menor = Integer.MAX_VALUE;
		Integer maior = Integer.MIN_VALUE;
		while (true) {
			System.out.printf("Temperatura (digite letra para sair): ");
			try {
				num = scan.nextInt();
				i += 1;
				soma += num;
				if (num<menor) {
					menor = num;
				}
				if (num>maior) {
					maior = num;
				}
			} catch (InputMismatchException e) {
				break;
			}
		}
		//media
		System.out.println("Media: "+(soma/i));
		//maior
		System.out.println("Maior: "+maior);
		//menor
		System.out.println("Menor: "+menor);
		scan.close();
	}

}
