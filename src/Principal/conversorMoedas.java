package Principal;

import java.util.Scanner;

public class conversorMoedas {

	public static final double TAXA_CAMBIO = 0.85;



    public static double converterDolaresParaEuros(double quantiaEmDolares) {

        return quantiaEmDolares * TAXA_CAMBIO;

    }



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);



        System.out.print("Digite a quantia em dólares: ");

        double quantiaEmDolares = input.nextDouble();



        double quantiaEmEuros = converterDolaresParaEuros(quantiaEmDolares);



        System.out.println(quantiaEmDolares + " dólares equivalem a " + quantiaEmEuros + " euros.");

        

        input.close();

	}

}
