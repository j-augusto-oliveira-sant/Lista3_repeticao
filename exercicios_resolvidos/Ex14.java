package exercicios_resolvidos;
import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double n=1,m=1;
		int num = scan.nextInt();
		double s=0;
		for (int i = 1;i<=num;i++) {
			System.out.printf("%d/%d \n",(int) n,(int) m);
			s += n/m;
			n += 1;
			m += 2;
		}
		System.out.println(s);
		scan.close();
	}

}
