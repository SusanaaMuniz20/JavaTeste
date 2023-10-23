package Principal;

import java.util.Arrays;

public class Aluno {

	private String nome;

    private String matricula;

    private double[] notas;


    public Aluno(String nome, String matricula, double[] notas) {

        this.nome = nome;

        this.matricula = matricula;

        this.notas = notas;

    }



    public double calcularMedia() {

        double soma = 0;

        for (double nota : notas) {

            soma += nota;

        }

        return soma / notas.length;

    }





    public boolean verificarAprovacao(double mediaMinima) {

        double media = calcularMedia();

        return media >= mediaMinima;

    }





    public static void main(String[] args) {



        double[] notasAluno1 = { 8.5, 7.2, 9.0, 6.8 };

        Aluno aluno1 = new Aluno("Alice", "12345", notasAluno1);



        double[] notasAluno2 = { 6.0, 5.5, 7.8, 4.2 };

        Aluno aluno2 = new Aluno("Matheus", "67890", notasAluno2);



        double mediaMinima = 6.0;



       

        System.out.println("Aluno 1 -> " + aluno1.nome + "; Matrícula:  " + aluno1.matricula + "; Média = " + aluno1.calcularMedia() + "; O aluno esta aprovado? "

                + aluno1.verificarAprovacao(mediaMinima));



        System.out.println("Aluno 2 -> " + aluno2.nome + "; Matrícula: " + aluno1.matricula + "; Média = " + aluno2.calcularMedia() + "; O aluno esta aprovado? "

                + aluno2.verificarAprovacao(mediaMinima));




	}

}
