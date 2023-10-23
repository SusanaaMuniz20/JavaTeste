package Principal;

public class Contabancaria {
	 private String numeroConta;

	    private double saldo;

	    public void ContaBancaria(String numeroConta, double saldoInicial) {

	        this.numeroConta = numeroConta;

	        this.saldo = saldoInicial;

	    }



	    public void depositar(double valor) {

	        saldo += valor;

	        System.out.println("Depósito de R$" + valor + " realizado com sucesso.");

	        System.out.println();

	        exibirSaldo();

	    }



	    public void sacar(double valor) {

	        if (valor > saldo) {

	            System.out.println("Saldo insuficiente. Saque não realizado.");

	            System.out.println();

	        } else {

	            saldo -= valor;

	            System.out.println("Saque de R$" + valor + " realizado com sucesso.");

	            System.out.println();

	            exibirSaldo();

	        }

	    }



	    public void exibirSaldo() {

	        System.out.println("Saldo atual: R$" + saldo);

	        System.out.println();

	    }



	    public static void main(String[] args) {

	        Contabancaria conta = new Contabancaria();



	        conta.depositar(500.0);

	        conta.sacar(200.0);

	        conta.sacar(800.0); 



	        conta.exibirSaldo();
	
	}

}
