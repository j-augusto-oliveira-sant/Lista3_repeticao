package exercicios_resolvidos;
import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double idade=0;
		double soma=0;
		int total=0;
		while (idade >= 0) {
			idade = scan.nextInt();
			if (idade>=0) {
				soma += idade;
				total += 1;
			}
		}
		double media = soma/total;
		System.out.println("Media:"+media);
		if (media < 25) {
			System.out.println("Turma Jovem");
		} else {
			if (media >= 25 && media < 60) {
				System.out.println("Turma Adulta");
			} else {
				System.out.println("Turma Idosa");
			}
		}
		
		
		scan.close();
	}

}
