package exercicios_resolvidos;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		//Fa�a um programa que imprima na tela os n�meros de 1 a 20, um abaixo do outro.
		//modifique o programa para que ele mostre os n�meros um ao lado do outro.
		Scanner scan = new Scanner(System.in);
		for (int i=1;i<=20;i++) {
			System.out.print(i+" ");
		}
		scan.close();
	}

}
