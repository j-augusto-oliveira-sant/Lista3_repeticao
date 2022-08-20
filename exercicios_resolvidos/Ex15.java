package exercicios_resolvidos;
import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double l=37,n=38,m=1;
		int num = scan.nextInt();
		double s=0;
		int cont = 0;
		while (cont<num || n>=2) {
			System.out.printf("%d*%d/%d \n",(int) l,(int) n,(int) m);
			s += (n*l)/m;
			n -= 1;
			l -= 1;
			m += 1;
			cont += 1;
		}
		System.out.println(s);
		scan.close();
	}

}
