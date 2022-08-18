package ListaSequencial;
import java.util.Scanner;

public class exercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe a quantidade de metros quadrados a serem pintados: ");
		double metros = entrada.nextDouble();
		double litros = metros / 6;
		double preçoLitro = 80;
		double QuantidadeLitros = 18;
		double preçoGaloes = 25;
		double quantidadeGaloes = 3.6;
		double latas = (litros / QuantidadeLitros);
		System.out.println("A quantidade de latas que você precisará é: " + latas);
		double totalL = (latas * preçoLitro);
		System.out.println("O valor total gasto em latas será de: " + totalL);

		double gg = (litros / quantidadeGaloes);
		System.out.println("A quantidade de galões que você precisará é: " + gg);
		double totalGaloes = (gg * preçoGaloes);
		System.out.println("O valor total gasto em galões será de: " + totalGaloes);

		entrada.close();
	}
}
