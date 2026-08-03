package avaliacao.formula1;
public class Patrocinadores {
    //variaveis
    private String nome;
    private float valor_pat;

    //construtor
    public Patrocinadores(String nome, float valor_pat) {
        this.nome = nome;
        this.valor_pat = valor_pat;
    }

    //get e set
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getValor_pat() {
        return valor_pat;
    }
    public void setValor_pat(float valor_pat) {
        this.valor_pat = valor_pat;
    }

    @Override
    public String toString() {
        return "Patrocinador: " + nome + " | Investimento: R$ " + String.format("%.2f", valor_pat);
    }
}
