package beecrowd;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Distancia {
	static Scanner console = new Scanner(System.in);
	static DecimalFormat formatador = new DecimalFormat("0.0000");

	public static void main(String[] args) {
		// Ponto 1:
		double x1 = 0;
		double y1 = 0;
		// Ponto 2:
		double x2 = 0;
		double y2 = 0;
		System.out.print("Digite o eixos X e Y do ponto 1, respectivamente: ");
		x1 = console.nextDouble();
		y1 = console.nextDouble();
		System.out.println("Digite o eixos X e Y do ponto 2, respectivamente: ");
		x2 = console.nextDouble();
		y2 = console.nextDouble();
		double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		System.out.println("A distância entre o Ponto 1 e o Ponto 2 é: " + formatador.format(distancia));
	}

}
