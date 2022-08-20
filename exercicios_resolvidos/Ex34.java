package exercicios_resolvidos;
import java.util.Scanner;

public class Ex34 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num=1,cont25=0,cont50=0,cont75=0,cont100=0;
		while (num>=0) {
			System.out.println("Informe Número: ");
			num = scan.nextInt();
			if (num<=25) {
				cont25 += 1;
			} else {
				if (num<=50) {
					cont50 += 1;
				} else {
					if(num<=75) {
						cont75 += 1;
					} else {
						cont100 += 1;
					}
				}
			}
		}
		//[0-25]
		System.out.println("[0-25]: "+cont25);
		//[26-50]
		System.out.println("[26-50]: "+cont50);
		//[51-75]
		System.out.println("[51-75]: "+cont75);
		//[76-100]
		System.out.println("[76-100]: "+cont100);
		
		scan.close();
	}

}
