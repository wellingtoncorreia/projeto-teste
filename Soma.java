package primeiro_projeto;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		double a,b,som;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o valor 01:");
		a = ler.nextDouble();
		
		System.out.println("Informe o valor 02:");
		b = ler.nextDouble();
		
		som = a+b;
		
		System.out.println("O resultado é:" + som);
		ler.close();

	}

}
