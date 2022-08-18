package ListaSequencial;
import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner entrada = new Scanner(System.in);
		 
		 double area, raio, pi;
		 pi = 3.14;
		 System.out.print("Informe o valor do raio do círculo: ");
		 raio = entrada.nextDouble();
		 area = pi * (raio * raio);
		 System.out.println("O valor da área do círculo é: " + area);
		 
		 entrada.close();
	}

}