package exercicios_resolvidos;
import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Quantidade de Turmas: ");
		int quantidade_turmas = scan.nextInt();
		int[] qtd_por_turma = new int[quantidade_turmas];
		
		for (int i=0;i<=quantidade_turmas-1;i++) {
			int new_turma = 0;
			System.out.printf("Quantos na Turma %d : ",i+1);
			while (new_turma > 40 || new_turma <= 0) {
				new_turma = scan.nextInt();
			}
			scan.nextLine();
			qtd_por_turma[i] = new_turma;
		}
		//print list
		int soma=0;
		for (int i=0;i<=quantidade_turmas-1;i++) {
			System.out.printf("Turma %d : %d ",i+1,qtd_por_turma[i]);
			soma += qtd_por_turma[i];
		}
		System.out.println("\nMédia por turma é: "+(soma/quantidade_turmas));
		
		scan.close();
	}

}
