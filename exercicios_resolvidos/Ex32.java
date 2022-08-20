package exercicios_resolvidos;
import java.util.Scanner;

public class Ex32 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double codigo,num_veiculos,num_acidentes,soma_veiculos=0,soma_acidentes=0,total2000=0;
		double indice,maior_indice =Double.MIN_VALUE,menor_indice=Double.MAX_VALUE;
		double[] maior = {0,maior_indice};
		double[] menor = {0,menor_indice};
		for (int i=0;i<=4;i++) {
			System.out.println("Codigo:");
			codigo = scan.nextInt();
			System.out.println("Numero veiculos passeio:");
			num_veiculos = scan.nextDouble();
			System.out.println("Numero acidentes transito:");
			num_acidentes = scan.nextDouble();
			//indice = acidentes/veiculos
			indice = num_acidentes/num_veiculos;
			//maior
			if (indice>maior[1]) {
				maior[0] = codigo;
				maior[1] = indice;
			}
			//menor
			if (indice<menor[1]) {
				menor[0] = codigo;
				menor[1] = indice;
			}
			//media veiculos
			soma_veiculos += num_veiculos;
			//media acidentes < 2000
			if (num_veiculos<2000) {
				total2000 += 1;
				soma_acidentes += num_acidentes;
			}
		}
		//medias
		System.out.println("--------");
		System.out.println("Media Veiculos: "+(soma_veiculos/5));
		System.out.println("Media Acidentes, menores que 2000: "+(soma_acidentes/total2000));
		//
		System.out.println("--------");
		System.out.println("Dados da cidade com menor indice:");
		System.out.printf("codigo: %d,indice: %f \n",(int)menor[0],(float)menor[1]);
		System.out.println("--------");
		System.out.println("Dados da cidade com maior indice:");
		System.out.printf("codigo: %d,indice: %f \n",(int)maior[0],(float)maior[1]);
		scan.close();
	}

}
