package exercicios_resolvidos;
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String nome,senha,sexo,estado_civil;
		int idade;
		float salario;
		boolean valido = true;
		do {
			System.out.println("Nome: ");
			nome = scan.nextLine();
			if (nome.length() < 3) {
				System.out.println("nome errado");
				valido = false;
			}
			System.out.println("Senha: ");
			senha = scan.nextLine();
			System.out.println("Sexo: ");
			sexo = scan.nextLine();
			if (sexo.intern() != "f" && sexo.intern() != "m") {
				System.out.println("sexo invalido");
				valido = false;
			}
			System.out.println("Estado Civil: ");
			estado_civil = scan.nextLine();
			if (estado_civil.intern() != "s" && estado_civil.intern()  != "c" 
				&& estado_civil.intern()  != "v" && estado_civil.intern()  != "d") {
				System.out.println("estado errado");
				valido = false;
			}
			System.out.println("Idade: ");
			idade = scan.nextInt();
			if (idade<0 || idade>150) {
				System.out.println("idade invalida");
				valido = false;
			}
			System.out.println("Salário: ");
			salario = scan.nextFloat();
			if (salario<0) {
				System.out.println("salario invalido");
				valido = false;
			}
			scan.nextLine();
		} while(valido==false);
		System.out.printf("%s %s %s %s %d %f",nome,senha,sexo,
		estado_civil,idade,salario);
		
		scan.close();
	}

}
