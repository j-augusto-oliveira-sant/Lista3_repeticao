package exercicios_resolvidos;
import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int codigo = 1,total=0;
		double peso,altura,soma_alturas=0,soma_pesos=0;
		double mais_alto,mais_gordo;
		double[] valores_mais_alto = new double[3];
		double[] valores_mais_gordo = new double[3];
		mais_alto = mais_gordo = Double.MIN_VALUE;
		double mais_baixo,mais_magro;
		double[] valores_mais_magro = new double[3];
		double[] valores_mais_baixo = new double[3];
		mais_baixo = mais_magro = Double.MAX_VALUE;
		double[][] todas_as_listas = {valores_mais_alto,valores_mais_gordo,
				valores_mais_magro,valores_mais_baixo};
		//--
		while (codigo!=0) {
			System.out.println("----------");
			//codigo
			System.out.println("Informe Codigo:");
			codigo = scan.nextInt();
			if (codigo!=0) {
				total += 1;
				//peso
				System.out.println("Informe Peso:");
				peso = scan.nextDouble();
				soma_pesos += peso;
				//altura
				System.out.println("Informe Altura:");
				altura = scan.nextDouble();
				
				soma_alturas += altura;
				//mais alto
				if (altura > mais_alto) {
					mais_alto = altura;
					valores_mais_alto[0] = codigo;
					valores_mais_alto[1] = peso;
					valores_mais_alto[2] = altura;
				}
				//mais baixo
				if (altura < mais_baixo) {
					mais_baixo = altura;
					valores_mais_baixo[0] = codigo;
					valores_mais_baixo[1] = peso;
					valores_mais_baixo[2] = altura;
				}
				//mais gordo
				if (peso > mais_gordo) {
					mais_gordo = peso;
					valores_mais_gordo[0] = codigo;
					valores_mais_gordo[1] = peso;
					valores_mais_gordo[2] = altura;
				}
				//mais magro
				if (peso < mais_magro) {
					mais_magro = peso;
					valores_mais_magro[0] = codigo;
					valores_mais_magro[1] = peso;
					valores_mais_magro[2] = altura;
				}
			}
		}
		//medias
		System.out.println("Media Alturas: "+(soma_alturas/total));
		System.out.println("Media Pesos: "+(soma_pesos/total));
		//mostrar o conteudo de todos os salvos
		for (int i=0;i<=3;i++) {
			System.out.println("----------");
			//mais alto
			if (i==0) {
				System.out.println("Valores do mais alto:");
			}
			//mais gordo
			if (i==1) {
				System.out.println("Valores do mais gordo:");
			}
			//mais magro
			if (i==2) {
				System.out.println("Valores do mais magro:");
			}
			//mais baixo
			if (i==3) {
				System.out.println("Valores do mais baixo:");
			}
			for (int j=0;j<=2;j++) {
				//codigo
				if (j==0) {
					System.out.println("codigo: "+todas_as_listas[i][j]);
				}
				//altura
				if (j==1) {
					System.out.println("peso: "+todas_as_listas[i][j]);
				}
				//peso
				if (j==2) {
					System.out.println("altura: "+todas_as_listas[i][j]);
				}
			}
		}
		
		scan.close();
	}

}
