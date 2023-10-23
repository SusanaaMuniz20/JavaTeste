package Principal;

import java.util.Scanner;

public class Calculdora {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		
		 Scanner input = new Scanner(System.in);



	        System.out.print("Digite o primeiro número: ");

	        double numero1 = input.nextDouble();



	        System.out.print("Digite o segundo número: ");

	        double numero2 = input.nextDouble();



	        System.out.print("Escolha a operação (+, -, *, /): ");

	        char operacao = input.next().charAt(0);



	        double resultado = 0;



	        switch (operacao) {

	            case '+':

	                resultado = adicao(numero1, numero2);

	                break;

	            case '-':

	                resultado = subtracao(numero1, numero2);

	                break;

	            case '*':

	                resultado = multiplicacao(numero1, numero2);

	                break;

	            case '/':

	                resultado = divisao(numero1, numero2);

	                break;

	            default:

	                System.out.println("Operação inválida");

	                break;

	        }



	        System.out.println("Resultado: " + resultado);

	    }



	    public static double adicao(double num1, double num2) {

	        return num1 + num2;

	    }



	    public static double subtracao(double num1, double num2) {

	        return num1 - num2;

	    }



	    public static double multiplicacao(double num1, double num2) {

	        return num1 * num2;

	    }



	    public static double divisao(double num1, double num2) {

	        if (num2 != 0) {

	            return num1 / num2;

	        } else {

	            System.out.println("Erro: Divisão por zero.");

	            return Double.NaN; 

	        }
	}

}
