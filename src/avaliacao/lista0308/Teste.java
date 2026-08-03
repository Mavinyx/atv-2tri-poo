package avaliacao.lista0308;

import java.util.Arrays;

public class Teste {
    public static void main(String[] args) {
        Estudante reg1 = new Estudante("fulanito cabrito");
        reg1.insereNotas();
        System.out.println(Arrays.toString(reg1.getNotas()));
    }
}
