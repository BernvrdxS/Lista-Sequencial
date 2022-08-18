package ListaSequencial;
import java.util.Scanner;

public class exercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe sua altura: ");
		double altura = entrada.nextDouble();
		System.out.println("Sua altura é: "+altura);
		double pesoHomem = ((72.7 * altura ) - 58);
		double pesoMulher = ((62.1 *altura ) - 44.7);
		System.out.println("Seu peso ideal, caso homem, baseando-se na altura é:" +pesoHomem);
		System.out.println("Seu peso ideal, caso mulher, baseando-se na altura é:" +pesoMulher);

		entrada.close();
	}

}
