package ListaSequencial;
import java.util.Scanner;

public class exercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe a quantidade de metros quadrados a serem pintados: ");
		double metros = entrada.nextDouble();

		double litros = metros / 3;
		double preço = 80.0;
		double quantidadeL = 18;

		double latas = (litros / quantidadeL);
		System.out.println("A quantidade de latas que você precisará é: " + latas);

		double total = (latas * preço);
		System.out.println("O valor total gasto será de: " + total);

		entrada.close();
	}

}
