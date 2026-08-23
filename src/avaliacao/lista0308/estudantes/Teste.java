package avaliacao.lista0308.estudantes;

import java.util.ArrayList;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Estudante>estudantes = new ArrayList<Estudante>();
        Estudante reg1 = new Estudante("fulanito cabrito");
        Estudante reg2 = new Estudante("juanita bella");
        estudantes.add(reg1);
        estudantes.add(reg2);
        reg1.insereNotas();
        //reg2.insereNotas();
        //System.out.println(Arrays.toString(reg1.getNotas()));
        //System.out.println("Média de "+reg1.getNomeEstudante()+":"+reg1.calculaMedia());

        //CalculaMediaEAprovados(estudantes);

        calcularMediaPonderada(reg1, sc);
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
        System.out.println("Estudante   -   Media\n"+aprovados);
    }
    public static void calcularMediaPonderada(Estudante registro,Scanner sc){
        int[] pesos = new int[5];
        double[] notas = registro.getNotas();
        for(int i=0;i<pesos.length;i++){
            System.out.println(notas[i]+"-> Peso:");
            pesos[i]=sc.nextInt();
        }
        System.out.println(registro.calculaMedia(pesos));
    }
}
