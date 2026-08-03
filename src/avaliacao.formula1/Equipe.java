package avaliacao.formula1;
import java.util.Arrays;

public class Equipe {
    //variaveis
    private String nome;
    private int ano_fund;
    private Patrocinadores[] patrocinadores;

    //construtor
    public Equipe(String nome, int ano_fund, Patrocinadores[] patrocinadores) {
        this.nome = nome;
        this.ano_fund = ano_fund;
        this.patrocinadores = patrocinadores;
    }
    //get e set
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getAno_fund() {
        return ano_fund;
    }
    public void setAno_fund(int ano_fund) {
        this.ano_fund = ano_fund;
    }
    public Patrocinadores[] getPatrocinadores() {
        return patrocinadores;
    }
    public void setPatrocinadores(Patrocinadores[] patrocinadores) {
        this.patrocinadores = patrocinadores;
    }

    @Override
    public String toString() {
        String lista = "";
        // criar uma lista com a array dos patrocinadores não nulos(q ja foram setados pq tava dando null no terminal q tava mostranod a array inteira)
        for (Patrocinadores p : patrocinadores) {
            if (p != null) {
                // adiciona o pat na lista
                lista += "\n   > " + p.toString();
            }
        }
        return "\n---Equipe---\n" +
                "Nome: " + nome + "\n" +
                "Ano: " + ano_fund + "\n" +
                "Patrocinadores ativos:" +  lista;
    }
}
