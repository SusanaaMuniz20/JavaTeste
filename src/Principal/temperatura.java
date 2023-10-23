package Principal;

import java.util.Scanner;

public class temperatura {

	public class Temperatura {

	    public double converterParaFahrenheit(double temperaturaCelsius) {

	        return temperaturaCelsius * 9/5 + 32;

	    }



	    public void main(String[] args) {

	        Scanner scanner = new Scanner(System.in);



	        System.out.print("Digite a temperatura em graus Celsius: ");

	        double temperaturaCelsius = scanner.nextDouble();

	        double temperaturaFahrenheit = converterParaFahrenheit(temperaturaCelsius);



	        System.out.println(temperaturaCelsius + " graus Celsius é equivalente a " + temperaturaFahrenheit + " graus Fahrenheit.");



	        scanner.close();

	    }
	}

	}
