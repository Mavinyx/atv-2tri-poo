package avaliacao.lista0308.estudantes;

import java.util.Arrays;
import java.util.Scanner;

public class Estudante {
    private String nomeEstudante;
    private double[] notas;


    public Estudante(String nomeEstudante) {
        this.nomeEstudante = nomeEstudante;
        this.notas = new double[5];
    }

    public String getNomeEstudante() {
        return nomeEstudante;
    }

    public double[] getNotas() {
        return notas;
    }

    public void insereNotas(){
        Scanner sc = new Scanner(System.in);
        System.out.println("----INSERÇÃO DE NOTAS----");
        for(int i=0;i<5;i++){
            System.out.println("Insira a "+(i+1)+"° nota-> ");
            double notaDigitada = sc.nextDouble();
            if (notaDigitada < 0 || notaDigitada > 10) {
                throw new NotaInvalidaException("Erro: A nota deve estar entre 0 e 10!");
            }
                notas[i] = notaDigitada;
        }
    }

    public double calculaMedia(){
        double sum=0;
        for(double nota : notas){
            sum += nota;
        }
        return sum/notas.length;
    }
    public double calculaMedia(int[] pesos){
        double sumN=0;
        double sumP=0;
        for(int i=0;i<notas.length;i++){
            sumN += notas[i] * pesos[i];
            sumP += pesos[i];
        }
        return sumP!=0 ? sumN/sumP : 0;
    }

    public double menorNota(){
        return Arrays.stream(notas).min().orElse(0);
    }
    @Override
    public String toString(){
        return nomeEstudante+"  -   "+calculaMedia();
    }
}
