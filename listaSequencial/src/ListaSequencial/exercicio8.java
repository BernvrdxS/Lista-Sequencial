package ListaSequencial;
import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe quanto voc� ganha por hora: ");
		int salarioHora = entrada.nextInt();
		System.out.println("Voc� ganha por m�s: " + salarioHora);

		System.out.print("Informe quantas horas voc� trabalha por m�s: ");
		int horaTrabalho = entrada.nextInt();
		System.out.println("Voc� trabalha por m�s: " + horaTrabalho);

		System.out.print("Seu sal�rio do m�s referido �: " + salarioHora * +horaTrabalho);

		entrada.close();
	}

}
