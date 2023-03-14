package pilhas;

public class PilhaInt {

	public final int N = 6;
	int dados[] = new int[N];
	int topo;

	public void init() {
		topo = 0;
	}

	public boolean isEmpty() {

		if (topo == 0)
			return true;
		else
			return false;
	}

	public boolean isFull() {
		if (topo == N)
			return true;
		else
			return false;
	}

	public void push(int elem) {
		if (isFull()) {
			System.out.println("Stack Overflow");

		}

		else {
			dados[topo] = elem;
			topo++;
		}
	}

	public int pop() {
		topo--;
		return (dados[topo]);
	}

	public int top() {
		return (dados[topo - 1]);
	}

	public void esvazia() {

		do {
			
			System.out.println("Elemento retirado: " + pop());

		} while (!isEmpty());
		
	}

	public void show() {
		System.out.println("topo ->");
		for(int i = 0; i < topo;i++)
			System.out.println("\t " + dados[i]);
		
		
	}	
	
}
