package ExBinario;

import pilhas.PilhaInt;
import java.util.Scanner;

public class DecBin {

	public static void main(String[] args) {
		PilhaInt pilha = new PilhaInt();
		Scanner input = new Scanner(System.in);
		int aux;
		pilha.init();

		System.out.print("Informe um num: ");
		int decimal = input.nextInt();
		input.close();

		while (decimal != 0) {
			aux = decimal % 2;
			decimal = decimal / 2;
			pilha.push(aux);
		}

		pilha.show();

	}

}
