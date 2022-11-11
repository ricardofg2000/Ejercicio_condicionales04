package unico;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		/* Escribe un programa que calcule el salario semanal de 
		 * un trabajador teniendo en cuenta que las horas ordinarias 
		 * (40 primeras horas de trabajo) se pagan a 12 euros la hora. 
		 * A partir de la hora 41, se pagan a 16 euros la hora.*/
		
		Scanner leer = new Scanner(System.in);
		
		final int TOPE = 40;
		final double PRECIO_HORAS = 12.0D;
		final double PRECIO_EXTRAS = 16.0D;
		
		double numHoras;
		double numHorasExtras;
		double nomina;

		
		System.out.println("Por favor, introduzca el número de horas trabajadas durante la semana:");
		numHoras = leer.nextInt();
		
		if (numHoras < TOPE) {
			nomina = numHoras * PRECIO_HORAS;
		}
		else {
			numHorasExtras = numHoras - TOPE;
			nomina = TOPE * PRECIO_HORAS + numHorasExtras * PRECIO_EXTRAS;
		}
		
		System.out.println("El sueldo semanal que le corresponde es de " + nomina + " euros");
		
		

	}

}
