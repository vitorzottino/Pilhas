package teste;

import java.util.Random;
import pilhas.PilhaInt;

public class MainTeste {

	public static void main(String[] args) {
		PilhaInt pilha = new PilhaInt();
		Random R = new Random();

		pilha.init();

		pilha.push(R.nextInt(50));
		pilha.push(R.nextInt(50));
		
		
		pilha.show();
		/*if(!pilha.isEmpty())
			System.out.println("Topo: " + pilha.top());
			else
				System.out.println("Pilha Vazia");*/

		//pilha.esvazia();
		/*if (!pilha.isEmpty())
			System.out.println("Valor retirado da pilha: " + pilha.pop());
		else
			System.out.println("Pilha Vazia");*/
		
		

	}

}
