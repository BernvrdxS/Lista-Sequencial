package ListaSequencial;
import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		System.out.print("Insira um número inteiro");
		int numero1 = entrada.nextInt();
		System.out.print("Insira outro número inteiro");
		int numero2 = entrada.nextInt();
		System.out.print("Insira um número real");
		float numero3 = entrada.nextFloat();

		float produto = ((numero1 * 2) * (numero2 / 2));
		System.out.println("O produto do dobro do primeiro com a metade do segundo é: " + produto);

		float soma = ((numero1 * 3) + numero3);
		System.out.println("A soma do triplo do primeiro com o terceiro é:" + soma);

		float cubo = (numero3 * numero3 * numero3);
		System.out.println("Esse número elevado ao cubo é: " + cubo);

		entrada.close();

	}

}
