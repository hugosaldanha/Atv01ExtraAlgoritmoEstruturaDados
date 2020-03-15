package exercicios;

import java.util.Scanner;

public class Fibonacci {

	public static int fibonacci(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);

		}

	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.print("Digite o indice de fibonacci: ");
		int termo = teclado.nextInt();
		
		int teste = fibonacci(termo);
		System.out.println("Resultado: " + teste);
		System.out.println();
		System.out.println("Sequência");
		for (int i = 0; i <= termo; i++) {
			System.out.println(fibonacci(i));
		}
	}
}
