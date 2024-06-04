package ejRepaso;

import java.util.ArrayList;
import java.util.Scanner;

public class leerPalabras {
	public static void main(String[]arg){
		
		String[]palabras=new String[20];
		String palabra = "";
		Scanner sc = new Scanner(System.in);
		int i=0;
		while(!palabra.equalsIgnoreCase("fin")){
			System.out.println("Introduce palabras hasta cuando deseas finalizar que deberas introducir: 'fin'");
			palabra=sc.nextLine();
			
			palabras[i]=palabra;
			i++;
		}
		
		System.out.println("Palabras que contiene el array:");
		for(int j=0; j<i-1; j++) {
			System.out.println(palabras[j]);
		}
		System.out.println("");
		System.out.println("--Letras--");
		System.out.print("Introduce una letra: ");
		char letra=sc.next().charAt(1);
		
		int contador=contieneLetra(palabras, i, letra);
		System.out.println("Hay "+contador+" palabra con la letra "+letra);	
	}
	
	public static int contieneLetra(String[] palabras, int numPalabras,char letra) {
		int contador=0;
	
		for(int i = 0; i<numPalabras-1; i++) {
			if(palabras[i].contains(Character.toString(letra))) {
				contador++;
			}
		}
		return contador;
	}
}
