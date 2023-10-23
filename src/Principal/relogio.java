package Principal;

public class relogio {

	private int hora;

    private int minutos;



    public void definirHora(int hora, int minutos) {

        if (hora >= 0 && hora <= 23 && minutos >= 0 && minutos <= 59) {

            this.hora = hora;

            this.minutos = minutos;

            System.out.println("Hora definida para " + this.hora + ":" + this.minutos);

        } else {

            System.out.println("Hora ou minutos inválidos.");

        }

    }



    public void exibirHoraAtual() {

        System.out.println("Hora atual: " + hora + ":" + minutos);

    }



    public static void main(String[] args) {

        relogio relogio = new relogio();



        relogio.definirHora(15, 45);



        relogio.exibirHoraAtual();

		

	}

}
