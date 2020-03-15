package exercicios;

import java.util.Scanner;

public class Fatorial {

	public static int fatorial(int n) {
		if (n <= 1) {
			return 1;
		} else
			return n * fatorial(n - 1);

	}

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		System.out.print("Digite o termo fatorial: ");
		int num = teclado.nextInt();
		
		int teste = fatorial(num);
		System.out.println("Resultado: " + teste);
		System.out.println();
		System.out.println("Sequência: ");
		for (int i = 0; i <= num; i++) {
			System.out.println(fatorial(i));
		}
	}
}
