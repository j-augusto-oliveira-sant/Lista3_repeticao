package exercicios_resolvidos;
import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		boolean isPrime = true;
		for (int i=2;i<=Math.sqrt(num);i++) {
			if (num%i==0 && num!=i) {
				isPrime = false;
			}
		}
		System.out.println("É primo: "+isPrime);
		scan.close();
	}

}
