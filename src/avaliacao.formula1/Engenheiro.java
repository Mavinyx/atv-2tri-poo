package avaliacao.formula1;

public class Engenheiro extends Pessoa{
    //variaveis
    private Piloto piloto;

     //construtor
    public Engenheiro(String nome, int idade, String nacionalidade, Piloto piloto) {
        super(nome, idade, nacionalidade);
        this.piloto = piloto;
    }
    //get e set
    public Piloto getPiloto() {return piloto;}
    public void setPiloto(Piloto piloto) {this.piloto = piloto;}

    @Override
    public String toString() {
        return "\n---Engenheiro---\n" +
                super.toString() + // chamar o toString de Pessoa
                "\nResponsável pelo Piloto: " +piloto;
    }
}
