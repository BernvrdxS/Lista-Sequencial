package ListaSequencial;
import java.util.Scanner;

public class exercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		int pesoLimite = 50;
		System.out.print("Insira o peso total dos peixes: ");
		int peso = entrada.nextInt();
		if (peso > pesoLimite);
		int excesso = (peso - pesoLimite);
		double multa = (excesso * 4.00);
		System.out.println("O valor da multa que Jo�o dever� pagar �: " + multa);
		if (peso == pesoLimite);
		System.out.println("Jo�o n�o dever� pagar nenhuma multa, pois n�o est� com excesso de peixes. ");
		entrada.close();
	}

}
