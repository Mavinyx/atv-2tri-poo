package avaliacao.formula1;
public class Piloto extends Pessoa {
   //variaveis
   private int nvitorias;
    //construtor
    public Piloto(String nome, int idade, String nacionalidade, int nvitorias) {
        super(nome, idade, nacionalidade);
        this.nvitorias = nvitorias;
    }
    //get e set
    public int getNvitorias() {
        return nvitorias;
    }
    public void setNvitorias(int nvitorias) {
        this.nvitorias = nvitorias;
    }

    @Override
    public String toString() {
        return "\n---Piloto---\n" +
                super.toString() + // chamar o toString de Pessoa
                "\nVitórias: " + nvitorias;
    }
}

