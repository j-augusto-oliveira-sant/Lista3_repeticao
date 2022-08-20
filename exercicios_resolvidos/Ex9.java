package exercicios_resolvidos;
import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		for (int i=0;i<=10;i++) {
			System.out.printf("%d X %d = %d \n",num,i,(num*i));
		}
		
		scan.close();
	}

}
