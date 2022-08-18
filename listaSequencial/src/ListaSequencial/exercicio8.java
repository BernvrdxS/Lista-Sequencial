package ListaSequencial;
import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe quanto você ganha por hora: ");
		int salarioHora = entrada.nextInt();
		System.out.println("Você ganha por mês: " + salarioHora);

		System.out.print("Informe quantas horas você trabalha por mês: ");
		int horaTrabalho = entrada.nextInt();
		System.out.println("Você trabalha por mês: " + horaTrabalho);

		System.out.print("Seu salário do mês referido é: " + salarioHora * +horaTrabalho);

		entrada.close();
	}

}
