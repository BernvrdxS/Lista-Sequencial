package ListaSequencial;
import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe sua altura: ");
		float altura = entrada.nextFloat();
		
		double peso = ((72.7*altura) - 58);
		
		System.out.println("Seu peso ideal, baseando-se na altura é:" +peso);
		
		entrada.close();
	}

}
