package exercicios_resolvidos;
import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int base = scan.nextInt();
		int expoente = scan.nextInt();
		int num = base;
		for (int i=1;i<expoente;i++) {
			num = num*base;
		}
		System.out.println("resultado = "+num);
		scan.close();
	}

}
