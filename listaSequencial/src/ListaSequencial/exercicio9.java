package ListaSequencial;
import java.util.Scanner;

public class exercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		double farenheit, celsius;

		System.out.print("Informe uma temperatura em Farenheit: ");
		farenheit = entrada.nextDouble();
		celsius = (5 * (+farenheit - 32)) / 9;
		System.out.println("Temperatura em Celsius:" + celsius + "ºC");

		entrada.close();

	}

}
