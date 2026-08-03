package avaliacao.formula1;

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        //inserindo dados para teste
        Patrocinadores[] pat = new Patrocinadores[10];
        pat[0] = new Patrocinadores("Empresafoda", 1000);
        Piloto piloto = new Piloto("Joelson",32,"Brasileiro",4);
        Equipe equipe = new Equipe("McLaren",1992, pat);
        Carro car = new Carro(1,3, equipe, piloto);
        Engenheiro eng = new Engenheiro("Roier",25,"Porto-Riquense",piloto);

        //exibir dados
        System.out.println(car);
        System.out.println(eng);
        System.out.println(equipe);

        System.out.println(piloto);

        //mostrar todos os patrocinadores
        System.out.println("\n------Patrocinadores------\n");
        for (int i = 0; i < pat.length; i++) {
            if (pat[i] != null) {
                System.out.println("Posição " + i + ": " + pat[i]);
            }
        }
    }
}
