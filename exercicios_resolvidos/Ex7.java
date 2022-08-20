package exercicios_resolvidos;
import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		for (int i=num1;i<=num2;i++) {
			System.out.println(i);
		}
		
		scan.close();
	}

}
