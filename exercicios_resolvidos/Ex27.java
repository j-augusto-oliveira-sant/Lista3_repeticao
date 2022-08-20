package exercicios_resolvidos;
import java.util.Scanner;

public class Ex27 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double num=1;
		int i = 0;
		double soma =0;
		while (num != 0) {
			i += 1;
			System.out.printf("Valor Produto %d: \n",i);
			num = scan.nextDouble();
			soma += num;
		}
		System.out.println("Total: R$"+soma);
		System.out.println("Dinheiro entregue pelo cliente: ");
		double dinheiro = scan.nextDouble();
		System.out.println("Troco: R$"+(dinheiro-soma));
		scan.close();
	}

}
