package ListaSequencial;
import java.util.Scanner;

public class exercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe quanto voc� ganha por hora: ");
		int salarioHora = entrada.nextInt();
		System.out.println("Voc� ganha por hora: " + salarioHora);
		System.out.print("Informe quantas horas voc� trabalha por m�s: ");
		int horaTrabalho = entrada.nextInt();
		System.out.println("Voc� trabalha por m�s: " + horaTrabalho);

		float salarioBruto;
		salarioBruto = (+salarioHora * horaTrabalho);
		System.out.println("Seu sal�rio bruto �:" + salarioBruto);

		double imposto;
		imposto = (salarioBruto * 0.11);
		System.out.println("� descontado de imposto de renda:" + imposto);

		double inss;
		inss = (salarioBruto * 0.08);
		System.out.println("� descontado de INSS: " + inss);

		double sindicato;
		sindicato = (salarioBruto * 0.05);
		System.out.println("� descontado de sindicato:" + sindicato);

		double descontos;
		descontos = (+salarioBruto - imposto - inss - sindicato);
		System.out.println("Seu sal�rio l�quido " + descontos);

		double salarioLiquido;
		salarioLiquido = (salarioBruto - descontos);
		System.out.println("� descontado do seu sal�rio:" + salarioLiquido);

		entrada.close();
	}

}
