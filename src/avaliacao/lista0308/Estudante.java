package avaliacao.lista0308;

import java.util.ArrayList;

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



}
