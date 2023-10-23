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

        System.out.print("Digite um n�mero para verificar se � primo: ");



       

        int numero = scanner.nextInt();



       

        if (ePrimo(numero)) {

            System.out.println(numero + " � um n�mero primo.");

        } else {

            System.out.println(numero +  " n�o � um n�mero primo.");

        }



        

        scanner.close();

	}

}
