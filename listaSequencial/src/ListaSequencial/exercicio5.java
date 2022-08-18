package ListaSequencial;
import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe uma quantidade em metros: ");
		float metros = entrada.nextFloat();
		System.out.println("Sua quantidade em metros é: " + metros);
		System.out.println("Sua quantidade em centimetros é: " + metros * 100);

		entrada.close();
	}

}