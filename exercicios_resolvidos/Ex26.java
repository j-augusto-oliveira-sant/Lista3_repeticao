package exercicios_resolvidos;
import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Valor do pão: ");
		double valor = scan.nextDouble();
		double soma = 0;
		for (int i=1;i<=50;i++) {
			soma += valor;
			System.out.println(i+". - R$"+((float)soma));
		}
		scan.close();
	}

}
