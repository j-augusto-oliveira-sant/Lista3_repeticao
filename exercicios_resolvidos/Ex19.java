package exercicios_resolvidos;
import java.util.Scanner;
import java.util.ArrayList;

public class Ex19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> saved_nums = new ArrayList<Integer>();
		System.out.println("primos Até que numero: ");
		int num = scan.nextInt();
		for (int i=0;i<=num;i++) {
			boolean isPrime = true;
			for (int j=2;j<=num;j++) {
				if (i%j==0 && i!=j) {
					isPrime = false;
				}
			}
			if (isPrime == true) {
				saved_nums.add(i);
			}
		}
		
		for (int i=0;i<=saved_nums.size()-1;i++) {
			System.out.println(saved_nums.get(i));
		}
		
		scan.close();
	}

}
