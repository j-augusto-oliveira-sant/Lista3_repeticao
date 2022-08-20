package exercicios_resolvidos;
import java.util.Scanner;

public class Ex37 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//prova gabarito: (a,a,b,b,c,c,d,d,e,e)
		String[] respostas = new String[10];
		String[] gabarito = new String[10];
		String novamente="s";
		int soma=0,total=0,maior=Integer.MIN_VALUE,menor=Integer.MAX_VALUE;
		//perguntar gabarito
		for (int i=0;i<10;i++) {
			System.out.println("Resposta do Gabarito Q"+(i+1)+": ");
			gabarito[i] = scan.nextLine();
		}
		while (novamente.equals("s")) {
			int nota=0;
			//perguntar
			for (int i = 0;i<10;i++) {
				System.out.println("Resposta Q"+(i+1)+": ");
				respostas[i] = scan.nextLine();
			}
			//checar
			for (int i = 0;i<10;i++) {
				if (gabarito[i].equals(respostas[i])) {
					nota += 1;
				}
			}
			if (nota>maior) {
				maior = nota;
			}
			if (nota<menor) {
				menor = nota;
			}
			soma += nota;
			total += 1;
			//novamente
			System.out.println("Mais um aluno? (s/n): ");
			novamente = scan.nextLine().toLowerCase().strip();
		}
		System.out.println("Media dos Alunos: "+((float)(soma/total)));
		System.out.println("Maior acerto: "+maior);
		System.out.println("Menor acerto: "+menor);
		System.out.println("Total: "+total);
		scan.close();
	}

}
