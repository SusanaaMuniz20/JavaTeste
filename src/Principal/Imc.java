package Principal;

import java.util.Scanner;

public class Imc {

	public static double calcularIMC(double peso, double altura) {

        return peso / (altura * altura);

    }



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        System.out.print("Digite o seu peso em kg: ");

        double peso = scanner.nextDouble();



        System.out.print("Digite a sua altura em metros: ");

        double altura = scanner.nextDouble();



        double imc = calcularIMC(peso, altura);



        System.out.println("O seu Índice de Massa Corporal (IMC) é: " + imc);



        scanner.close();

	}

}
