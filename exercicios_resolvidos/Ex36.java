package exercicios_resolvidos;
import java.util.Scanner;

public class Ex36 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//1=Pedro,2=Will,3=Donald,4=Joe,5=nulo,6=branco
		int[] candidatos = {0,0,0,0,0,0};
		int voto=1;
		while (voto>0) {
			System.out.println("1=Pedro,2=Will,3=Donald"
					+ ",4=Joe,5=nulo,6=branco");
			voto = scan.nextInt();
			if (voto>0) {
				candidatos[voto-1] += 1;
			}
		}
		System.out.println("-------");
		System.out.println("1.Pedro total: "+candidatos[0]);
		System.out.println("2.Will total: "+candidatos[1]);
		System.out.println("3.Donald total: "+candidatos[2]);
		System.out.println("4.Joe total: "+candidatos[3]);
		System.out.println("5.Nulo total: "+candidatos[4]);
		System.out.println("6.Branco total: "+candidatos[5]);
		
		
		scan.close();
	}

}
