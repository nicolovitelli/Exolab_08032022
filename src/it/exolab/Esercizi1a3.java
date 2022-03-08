package it.exolab;

public class Esercizi1a3 {

	public static void main(String[] args) {
		int[] numeri;
		
	}

	// 1
	public static void scambiaValori(int a, int b, int[] numeri) {
		int tmp;
		tmp = numeri[a];
		numeri[a] = numeri[b];
		numeri[b] = tmp;
	}
	
	// 2
	public static int stampaProdotto(int[] numeri) {
		int prodotto = 1;
		for(int i=0;i<numeri.length;i++) {
			prodotto *= numeri[i];
		}
		return prodotto;
	}
	
	// 3
	public static void stampaPosizioniPari(int[] numeri) {
		for(int i=0;i<numeri.length;i++) {
			if(numeri[i] % 2 == 0) {
				System.out.println(numeri[i]);
			}
		}
	}
	
	
	
}
