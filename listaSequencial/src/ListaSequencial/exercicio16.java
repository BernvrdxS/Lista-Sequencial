package ListaSequencial;
import java.util.Scanner;

public class exercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe a quantidade de metros quadrados a serem pintados: ");
		double metros = entrada.nextDouble();
		double litros = metros / 6;
		double pre�oLitro = 80;
		double QuantidadeLitros = 18;
		double pre�oGaloes = 25;
		double quantidadeGaloes = 3.6;
		double latas = (litros / QuantidadeLitros);
		System.out.println("A quantidade de latas que voc� precisar� �: " + latas);
		double totalL = (latas * pre�oLitro);
		System.out.println("O valor total gasto em latas ser� de: " + totalL);

		double gg = (litros / quantidadeGaloes);
		System.out.println("A quantidade de gal�es que voc� precisar� �: " + gg);
		double totalGaloes = (gg * pre�oGaloes);
		System.out.println("O valor total gasto em gal�es ser� de: " + totalGaloes);

		entrada.close();
	}
}
