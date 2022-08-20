package exercicios_resolvidos;
import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Quantidade de cds: ");
		int quantidade_cds = scan.nextInt();
		//valor cada cd
		double soma = 0;
		for (int i=0;i<=quantidade_cds-1;i++) {
			System.out.println("Valor do CD: ");
			soma += scan.nextDouble();
		}
		System.out.println("Media = "+(soma/quantidade_cds));
		scan.close();
	}

}
