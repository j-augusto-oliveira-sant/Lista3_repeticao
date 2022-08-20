package exercicios_resolvidos;
import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int a=1,b=1,c;
		System.out.println(1);
		if (num > 1) {
			System.out.println(1);
		}
		if (num>2) {
			num = num-2;
			for (int i=1;i<=num;i++) {
				c = a+b;
				a = b;
				b = c;
				System.out.println(c);
			}
		}
		scan.close();
	}

}
