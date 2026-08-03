package avaliacao.formula1;

public class Pessoa {
    //variaveis
    protected String nome;
    protected int idade;
    protected String nacionalidade;
    //construtor
    public Pessoa(String nome, int idade, String nacionalidade) {
        this.nome = nome;
        this.idade = idade;
        this.nacionalidade = nacionalidade;
    }
    // get e set
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                " | Idade: " + idade +
                " | Nacionalidade: " + nacionalidade;
    }
}
