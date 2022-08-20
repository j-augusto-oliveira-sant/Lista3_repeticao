package exercicios_resolvidos;
import java.util.Scanner;
import java.util.ArrayList;

public class Ex18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> saved_nums = new ArrayList<Integer>();
		int num = scan.nextInt();
		boolean isPrime = true;
		for (int i=2;i<=num;i++) {
			if (num%i==0 && num!=i) {
				isPrime = false;
				saved_nums.add(i);
			}
		}
		System.out.println("É primo: "+isPrime);
		if (isPrime==false) {
			for (int i=0;i<=saved_nums.size()-1;i++) {
				System.out.println(saved_nums.get(i));
			}
		}
		scan.close();
	}

}
