package exercicios_resolvidos;
import java.util.Scanner;

public class Ex33 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int qtd_parcel;
		double divida,juros=0,val_parcel;
		//valor da dívida
		System.out.println("Valor Divida: ");
		divida = scan.nextDouble();
		//quantidade de parcelas
		System.out.println("Quantidade de Parcelas: ");
		qtd_parcel = scan.nextInt();
		if (qtd_parcel==1) {
			juros = 0;
		} else if (qtd_parcel==3) {
			juros = (divida*0.10);
		} else if (qtd_parcel==6) {
			juros = (divida*0.15);
		} else if (qtd_parcel==9) {
			juros = (divida*0.20);
		} else if (qtd_parcel==12) {
			juros = (divida*0.25);
		}
		//valor da parcela.
		val_parcel = (divida+juros)/qtd_parcel;
		//
		System.out.println("|Valor da Dívida|Valor dos Juros|Quantidade de Parcelas|Valor da Parcela|");
		System.out.printf("|R$ %f|R$ %f|%d|R$ %f|"
				,(float)divida,(float)juros,qtd_parcel,(float)val_parcel);
		scan.close();
	}

}
