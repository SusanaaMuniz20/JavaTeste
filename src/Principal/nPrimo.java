package Principal;

import java.util.Scanner;

public class nPrimo {

	public static boolean ePrimo(int numero) {

        if (numero <= 1) {

            return false;

        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {

            if (numero % i == 0) {

                return false;

            }

        }

        return true;

    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para verificar se é primo: ");



       

        int numero = scanner.nextInt();



       

        if (ePrimo(numero)) {

            System.out.println(numero + " é um número primo.");

        } else {

            System.out.println(numero +  " não é um número primo.");

        }



        

        scanner.close();

	}

}
