package it.exolab;

//Esercizio 11
public class MassimoDiN {

	public static void main(String[] args) {
		int max = 0;
		for(int i=0;i<args.length;i++) {
			if(max < Integer.parseInt(args[i])) {
				max = Integer.parseInt(args[i]);
			}
		}
		System.out.println("Numero Max: " + max);
	}

}
