package it.exolab;

import java.util.Arrays;

// Esercizio 13
public class CreaArrayDiN {

	public static void main(String[] args) {
		Integer[] array = new Integer[args.length];
		for(int i=0;i<array.length;i++) {
			if(array[i] == null) {
				array[i] = Integer.parseInt(args[i]);
			}
		}
		System.out.println(Arrays.toString(array));
	}

}
