package exercicios_resolvidos;
import java.util.Scanner;

public class Ex29 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println("Inicio:");
		int inicio = scan.nextInt();
		System.out.println("Fim:");
		int fim = scan.nextInt();
		if (inicio>fim) {
			int temp = fim;
			fim = inicio;
			inicio = temp;
		}
		for (int i=inicio;i<=fim;i++) {
			System.out.printf("%d X %d = %d \n",num,i,(num*i));
		}
		scan.close();
	}

}
