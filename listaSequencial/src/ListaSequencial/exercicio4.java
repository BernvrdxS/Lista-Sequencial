package ListaSequencial;

import java.util.Scanner;

public class exercicio4 {

	private static Scanner entrada;

	public static void main(String[] args) {

		entrada = new Scanner(System.in);

		System.out.println("Informe sua primeira nota: ");
		int nota1 = entrada.nextInt();

		System.out.println("Informe sua segunda nota: ");
		int nota2 = entrada.nextInt();

		System.out.println("Informe sua terceira nota: ");
		int nota3 = entrada.nextInt();

		System.out.println("Informe sua quarta nota: ");
		int nota4 = entrada.nextInt();

		float media = (nota1 + nota2 + nota3 + nota4) / 4;

		System.out.println("A sua média é: " + media);

	}

}
