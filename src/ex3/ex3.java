package ex3;

import java.util.*;

public class ex3 {
	static int numeros[] = new int[8];
	public static void inserirNumeros() {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<8; i++) {
			int indice = i+1;
			System.out.println("Insira o "+ indice + "º numero.");
			numeros[i] = sc.nextInt();
		}
		
		Imprimir i = new Imprimir(numeros[3], numeros[7]);
		i.imprime();
		System.out.println("-------------");
		Media m = new Media(numeros);
		System.out.println("A média é: " + m.calculaMedia(numeros));
	}
	
	public static void main(String[] args) {
		inserirNumeros();
	}

}

final class Imprimir{
	private int quarto;
	private int ultimo;
	
	public Imprimir(int quarto, int ultimo) {
		this.quarto = quarto;
		this.ultimo = ultimo;
	}
	
	public int getQuarto() {
		return quarto;
	}
	
	public int getUltimo() {
		return ultimo;
	}
	
	public void imprime() {
		System.out.println("Quarto número inserido: " + getQuarto());
		System.out.println("Último número inserido: " + getUltimo());

	}
}

final class Media{
	private int numeros[] = new int[7];
	double media = 0;
	
	public Media(int numeros[]) {
		this.numeros = numeros;
	}
	

	
	public double calculaMedia(int numeros[]) {
		double soma = 0;
		for (int i = 0; i<numeros.length; i++) {
			soma = soma + numeros[i];
		}
		media= soma/8;
		
		return media;
	}

}
