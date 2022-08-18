package ListaSequencial;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero1, numero2, total = 0;
		Scanner soma = new Scanner(System.in);
		System.out.println("Introduce dos números: ");
		numero1 = soma.nextInt();
		numero2 = soma.nextInt();
		total = numero1 + numero2;
		System.out.println("La suma de a y b es: " + total);
		
		soma.close();
	}

}
