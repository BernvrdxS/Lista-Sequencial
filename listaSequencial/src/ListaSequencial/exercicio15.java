package ListaSequencial;
import java.util.Scanner;

public class exercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe a quantidade de metros quadrados a serem pintados: ");
		double metros = entrada.nextDouble();

		double litros = metros / 3;
		double pre�o = 80.0;
		double quantidadeL = 18;

		double latas = (litros / quantidadeL);
		System.out.println("A quantidade de latas que voc� precisar� �: " + latas);

		double total = (latas * pre�o);
		System.out.println("O valor total gasto ser� de: " + total);

		entrada.close();
	}

}
