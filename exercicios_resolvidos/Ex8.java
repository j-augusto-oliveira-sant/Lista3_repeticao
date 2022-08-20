package exercicios_resolvidos;
import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int soma = 0;
		for (int i=num1;i<=num2;i++) {
			System.out.println(i);
			soma += i;
		}
		System.out.println(soma);
		
		scan.close();
	}

}
