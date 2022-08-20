package exercicios_resolvidos;
import java.util.Scanner;

public class Ex35 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double[] precos = {1.20,1.30,1.50,1.20,1.30,1};
		int codigo = 0,qtd;
		double preco=0;
		while (codigo > -1) {
			System.out.println("Codigo:");
			codigo = scan.nextInt();
			if (codigo>-1) {
				System.out.println("Quantidade:");
				qtd = scan.nextInt();
				if (codigo == 100){
					preco += precos[0]*qtd;
				}else if (codigo==101){
					preco += precos[1]*qtd;
				}else if (codigo==102){
					preco += precos[2]*qtd;
				}else if (codigo==103){
					preco += precos[3]*qtd;
				}else if (codigo==104){
					preco += precos[4]*qtd;
				}else if (codigo==105){
					preco += precos[5]*qtd;
				}
			}
		}
		System.out.println("Total: R$"+preco);
		
		
		scan.close();
	}

}
