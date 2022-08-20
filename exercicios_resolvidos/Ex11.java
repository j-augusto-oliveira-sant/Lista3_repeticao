package exercicios_resolvidos;
import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int pares=0,impares=0;
		for (int i=1;i<=10;i++) {
			if (i%2==0) {
				pares += i;
			} else {
				impares += i;
			}
		}
		System.out.printf("soma pares = %d, soma impares = %d",pares,impares);
		scan.close();
	}

}
