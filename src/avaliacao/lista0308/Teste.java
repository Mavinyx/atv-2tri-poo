package avaliacao.lista0308;

import java.util.Arrays;

public class Teste {
    public static void main(String[] args) {
        Estudante aluno = new Estudante("João");
        try {
            aluno.insereNotas();
            System.out.println("Média: " + aluno.calculaMedia());
        } catch (NotaInvalidaException e) {

            System.out.println(e.getMessage());
            System.out.println("Tente cadastrar o aluno novamente.");
        }
    }
}
