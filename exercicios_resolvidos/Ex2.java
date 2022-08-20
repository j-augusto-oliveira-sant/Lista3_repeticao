package exercicios_resolvidos;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String nome,senha;
		do {
			System.out.println("Nome: ");
			nome = scan.nextLine();
			System.out.println("Senha: ");
			senha = scan.nextLine();
			if (nome.equals(senha)) {
				System.out.println("NOME TEM QUE SER DIFERENTE DA SENHA");
			}
		} while(nome.equals(senha));
		
		scan.close();
	}

}
