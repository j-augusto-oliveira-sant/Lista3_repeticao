package exercicios_resolvidos;
import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double nota=0;
		double soma=0;
		int total=0;
		while (nota >= 0) {
			nota = scan.nextDouble();
			if (nota>=0) {
				soma += nota;
				total += 1;
			}
		}
		System.out.println((soma)/(total));
		
		
		scan.close();
	}

}
