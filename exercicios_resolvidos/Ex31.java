package exercicios_resolvidos;
import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero;
		double altura;
		//1=numero,2=altura
		double[] mais_alto = new double[2];
		double[] mais_baixo = new double[2];
		mais_baixo[1] = Double.MAX_VALUE;
		for (int i=0;i<=9;i++) {
			System.out.println("Numero Aluno: ");
			numero = scan.nextInt();
			System.out.println("Altura:");
			altura = scan.nextDouble();
			//mais alto
			if (altura > mais_alto[1]) {
				mais_alto[0] = numero;
				mais_alto[1] = altura;
			}
			//mais baixo
			if (altura < mais_baixo[1]) {
				mais_baixo[0] = numero;
				mais_baixo[1] = altura;
			}
		}
		System.out.println("---------");
		System.out.println("Dados do Mais Baixo: ");
		System.out.printf("Número: %d, Altura: %fm \n",(int)mais_baixo[0],mais_baixo[1]);
		System.out.println("---------");
		System.out.println("Dados do Mais Alto: ");
		System.out.printf("Número: %d, Altura: %fm \n",(int)mais_alto[0],mais_alto[1]);
		scan.close();
	}

}
