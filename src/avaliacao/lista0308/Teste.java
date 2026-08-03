package avaliacao.lista0308;

import java.util.ArrayList;
import java.util.Arrays;

public class Teste {
    public static void main(String[] args) {
        ArrayList<Estudante>estudantes = new ArrayList<Estudante>();
        Estudante reg1 = new Estudante("fulanito cabrito");
        Estudante reg2 = new Estudante("juanita bella");
        estudantes.add(reg1);
        estudantes.add(reg2);
        reg1.insereNotas();
        reg2.insereNotas();
        //System.out.println(Arrays.toString(reg1.getNotas()));
        //System.out.println("Média de "+reg1.getNomeEstudante()+":"+reg1.calculaMedia());

        CalculaMediaEAprovados(estudantes);
    }

    public static void CalculaMediaEAprovados(ArrayList<Estudante> estudantes){
        ArrayList<Estudante> aprovados = new ArrayList<Estudante>();
        double sum=0;
        for(Estudante aluno : estudantes){
            double mediaAluno = aluno.calculaMedia();
            sum += mediaAluno;
            if(mediaAluno>=6){
                aprovados.add(aluno);
            }
        }
        System.out.println("Media"+sum / estudantes.toArray().length);
        System.out.println(aprovados);
    }
}
