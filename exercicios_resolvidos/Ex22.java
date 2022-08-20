package exercicios_resolvidos;
import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int candidato1 = 0;
		int candidato2 = 0;
		int candidato3 = 0;
		System.out.println("Quantos votantes: ");
		int votantes = scan.nextInt();
		for (int i=1;i<=votantes;i++) {
			System.out.println("digite numero candidato (1,2,3): ");
			int voto = scan.nextInt();
			if (voto == 1) {
				candidato1 += 1;
			} else if (voto == 2) {
				candidato2 += 1;
			} else {
				candidato3 += 1;
			}
		}
		System.out.printf("votos candidato 1 = %d \n",candidato1);
		System.out.printf("votos candidato 2 = %d \n",candidato2);
		System.out.printf("votos candidato 3 = %d \n",candidato3);
		
		scan.close();
	}

}
