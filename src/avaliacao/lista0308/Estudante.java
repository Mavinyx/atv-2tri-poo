package avaliacao.lista0308;

import java.util.ArrayList;
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
            notas[i] = sc.nextDouble();
        }
    }

    public double calculaMedia(){
        double sum=0;
        for(double nota : notas){
            sum += nota;
        }
        return sum/notas.length;
    }

    public double menorNota(){
        return Arrays.stream(notas).min().orElse(0);
    }
}
