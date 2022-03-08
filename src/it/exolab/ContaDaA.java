package it.exolab;

// Esercizio 7
public class ContaDaA {

	public static void main(String[] args) {
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		while(n1 < n2) {
			System.out.println(n1);
			n1++;
		}
	}

}
