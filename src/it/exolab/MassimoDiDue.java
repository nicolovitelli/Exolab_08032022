package it.exolab;

// Esercizio 9
public class MassimoDiDue {

	public static void main(String[] args) {
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		if(n1 > n2) {
			System.out.println(n1 + " e' più grande.");
		} else {
			System.out.println(n2 + " e' più grande.");
		}
	}

}
