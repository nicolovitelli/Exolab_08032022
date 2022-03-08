package it.exolab;

// Esercizio 10
public class MassimoEMinimoDiDue {

	public static void main(String[] args) {
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		if(n1 > n2) {
			System.out.println(n1 + " e' il più grande.");
			System.out.println(n2 + " e' il più piccolo.");
		} else {
			System.out.println(n2 + " e' il più grande.");
			System.out.println(n2 + " e' il più piccolo.");
		}
	}

}
