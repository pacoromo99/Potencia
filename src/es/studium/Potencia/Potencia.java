package es.studium.Potencia;

import java.util.Scanner;

public class Potencia 
{

	public static void main(String[] args) 
	{
		int base, exponente, i, resultado;
		Scanner teclado = new Scanner (System.in);
		System.out.println("Dame la base");
		base = teclado.nextInt(); //leo variable num1
		System.out.println("Dame el exponente");
		exponente = teclado.nextInt(); //leo variable num2
		resultado = 1;
		for (i = 1; i <= exponente; i++) 
		{
			resultado= resultado*base;
		}
		
		System.out.println("El numero " + base + " " + "elevado a " + exponente + " " + "es igual a " + resultado);
	}

}
