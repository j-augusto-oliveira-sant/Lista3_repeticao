package exercicios_resolvidos;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		//Faça um programa que peça uma nota, entre zero e dez.
		Scanner scan = new Scanner(System.in);
		int num;
		do {
			num = scan.nextInt();
			if (num<0 || num>10) {
				System.out.println("Numero Invalido");
			}
		} while(num<0 || num>10);
		
		scan.close();
	}

}
