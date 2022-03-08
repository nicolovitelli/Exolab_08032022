package it.exolab;

public class Ciao {

	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("Numero argomenti errato");
			System.exit(-1);
		}
		System.out.println("Ciao " + args[0]);
	}

}
