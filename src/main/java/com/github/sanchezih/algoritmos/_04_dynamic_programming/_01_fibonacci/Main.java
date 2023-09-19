package com.github.sanchezih.algoritmos._04_dynamic_programming._01_fibonacci;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class Main {
	public static void main(String[] args) {

		System.out.println("========== FIBONACCI ==========");
		System.out.println();
		System.out.println("EJEMPLO 1");
		int posicion = 8;
		System.out.println("El numero " + Fibonacci.getFibonacciNumberAt(posicion) + " esta en la posicion " + posicion
				+ " de la secuencia");

		System.out.println();

		System.out.println("EJEMPLO 2");

		int maxCount = 48;
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss.SSSS");
		System.out.println("Mostrando los primeros " + maxCount + " de la secuencia...");
		Date inicio = new Date();
		System.out.println("Inicio: " + sdf.format(inicio));

		for (int i = 0; i < maxCount; i++) {
			int fibonaccinumber = Fibonacci.getFibonacci(i);
			System.out.println("\tNumber at " + i + ": " + fibonaccinumber);
		}
		System.out.println("Fin: " + ((new Date().getTime() - inicio.getTime())) + " ms desde el inicio");
	}
}
