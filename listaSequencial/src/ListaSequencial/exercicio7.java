package ListaSequencial;
import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		 
		 double area;
		 System.out.print("Informe o valor do quadrado: ");
		 double altura = entrada.nextDouble();
		 area = altura * altura ;
		 System.out.println("O valor da área do quadrado é: " + area);
		 
		 entrada.close();
	}

}
