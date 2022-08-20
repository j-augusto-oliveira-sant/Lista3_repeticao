package exercicios_resolvidos;
import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int result=num;
		while (num>1) {
			result *= num-1;
			num = num-1;
		}
		System.out.println(result);
		scan.close();
	}

}
