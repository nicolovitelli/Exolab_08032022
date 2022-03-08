package it.exolab;

public class Main {

	public static void main(String[] args) {
		
		int[] numeri = {1, 2, 3, 4, 5};
		System.out.println("Somma degli indici di posizione Pari: " + sommaIndiciPari(numeri)); // 1
		System.out.println("Somma degli indici di posizione Dispari: " + sommaIndiciDispari(numeri)); // 2
		System.out.println("Prodotto dei Numeri divisibili per 10: " + prodottoDivisibile10(numeri)); // 3
		System.out.println("I numeri compresi tra 5 e 12 compaiono " + contaTra5e12(numeri) + " volte."); // 4
		System.out.println("La somma dei numeri compresi tra 5 e 12 è: " + sommaTra5e12(numeri)); // 5
		sommaProdottoTra5e12(numeri); // 6
		System.out.println("In questo vettore ci sono " + contaNegativi(numeri) + " numeri negativi."); // 7
		System.out.println("In questo vettore ci sono " + contaPositiviEMinori(numeri) + " numeri postivi o minori di -5."); // 8

	}

	
	// 1
	public static int sommaIndiciPari(int[] numeri) {
		int somma = 0;
		for(int i=0; i<numeri.length; i++) {
			if(numeri[i] % 2 == 0) {
				somma += numeri[i];
			}
		}
		return somma;
	}
	
	// 2
	public static int sommaIndiciDispari(int[] numeri) {
		int somma = 0;
		for(int i=0; i<numeri.length; i++) {
			if(numeri[i] % 2 != 0) {
				somma += numeri[i];
			}
		}
		return somma;
	}
	
	// 3
	public static int prodottoDivisibile10(int[] numeri) {
		int prodotto = 1;
		for(int i=0; i<numeri.length; i++) {
			if(numeri[i] % 10 == 0) {
				prodotto *= numeri[i];
			}
		}
		return prodotto;
	}
	
	// 4
	public static int contaTra5e12(int[] numeri) {
		int conta = 0;
		for(int i=0; i<numeri.length; i++) {
			if(numeri[i] > 5 && numeri[i] < 12) {
				conta++;
			}
		}
		return conta;
	}
	
	// 5
	public static int sommaTra5e12(int[] numeri) {
		int somma = 0;
		for(int i=0; i<numeri.length; i++) {
			if(numeri[i] > 5 && numeri[i] < 12) {
				somma += numeri[i];
			}
		}
		return somma;
	}
	
	// 6
	public static void sommaProdottoTra5e12(int[] numeri) {
		int somma = 0;
		int prodotto = 1;
		for(int i=0; i<numeri.length; i++) {
			if(numeri[i] > 3 && numeri[i] < 9) {
				somma += numeri[i];
				prodotto *= numeri[i];
			}
		}
		System.out.println("La somma tra i numeri compresi tra 5 e 12 e': " + somma + "\nIl prodotto tra i numeri compresi tra 5 e 12 e': " + prodotto);
	}
	
	// 7
	public static int contaNegativi(int[] numeri) {
		int conta = 0;
		for(int i=0; i<numeri.length; i++) {
			if(numeri[i] < 0) {
				conta++;
			}
		}
		return conta;
	}
	
	// 8
	public static int contaPositiviEMinori(int[] numeri) {
		int conta = 0;
		for(int i=0; i<numeri.length; i++) {
			if(numeri[i] < 0 || numeri[i] < -5) {
				conta++;
			}
		}
		return conta;
	}
	
}
