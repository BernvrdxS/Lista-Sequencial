package ListaSequencial;
import java.util.Scanner;

public class exercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe quanto você ganha por hora: ");
		int salarioHora = entrada.nextInt();
		System.out.println("Você ganha por hora: " + salarioHora);
		System.out.print("Informe quantas horas você trabalha por mês: ");
		int horaTrabalho = entrada.nextInt();
		System.out.println("Você trabalha por mês: " + horaTrabalho);

		float salarioBruto;
		salarioBruto = (+salarioHora * horaTrabalho);
		System.out.println("Seu salário bruto é:" + salarioBruto);

		double imposto;
		imposto = (salarioBruto * 0.11);
		System.out.println("É descontado de imposto de renda:" + imposto);

		double inss;
		inss = (salarioBruto * 0.08);
		System.out.println("É descontado de INSS: " + inss);

		double sindicato;
		sindicato = (salarioBruto * 0.05);
		System.out.println("É descontado de sindicato:" + sindicato);

		double descontos;
		descontos = (+salarioBruto - imposto - inss - sindicato);
		System.out.println("Seu salário líquido " + descontos);

		double salarioLiquido;
		salarioLiquido = (salarioBruto - descontos);
		System.out.println("É descontado do seu salário:" + salarioLiquido);

		entrada.close();
	}

}
