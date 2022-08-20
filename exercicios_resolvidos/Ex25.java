package exercicios_resolvidos;
import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double valor = 1.99;
		System.out.println("Quantidade de produtos: ");
		int qtd_produtos = scan.nextInt();
		double soma = 0;
		double soma_cliente = 0;
		for (int i=1;i<=50;i++) {
			soma += valor;
			System.out.println(i+". - R$"+((float)soma));
			if (i==qtd_produtos) {
				soma_cliente = soma;
			}
		}
		System.out.println("Valor cliente irá pagar: R$"+((float)soma_cliente));
		scan.close();
	}

}
