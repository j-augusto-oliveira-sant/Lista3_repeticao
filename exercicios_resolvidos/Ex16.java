package exercicios_resolvidos;
import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int soma=0,num;
		Integer menor = Integer.MAX_VALUE;
		Integer maior = Integer.MIN_VALUE;
		do {
			System.out.println("INFORME NUMERO (0 para sair): ");
			num = scan.nextInt();
			soma += num;
			if (num < menor) {
				menor = num;
			}
			if (num > maior) {
				maior = num;
			}
		} while(num!=0);
		System.out.println("menor: "+menor);
		System.out.println("maior: "+maior);
		System.out.println("Soma: "+soma);
		
		
		scan.close();
	}

}
