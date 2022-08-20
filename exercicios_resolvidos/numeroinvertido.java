package exercicios_resolvidos;
import java.util.Scanner;

public class numeroinvertido {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe numero: ");
		String num = scan.nextLine();
		String[] list_letters = num.split("(?!^)");
		//inverter sem biblioteca
		int i = 0;
		int j = list_letters.length-1-i;
		while (i<=j) {
			String temp = list_letters[j];
			list_letters[j] = list_letters[i];
			list_letters[i] = temp;
			i += 1;
			j -= 1;
		}
		num = String.join("", list_letters);
		System.out.println(num);
		scan.close();
	}

}
