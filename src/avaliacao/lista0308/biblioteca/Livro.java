package avaliacao.lista0308.biblioteca;

public class Livro extends Exemplar {
    private boolean disponivel;

    public Livro(String titulo) {
        super(titulo);
        this.disponivel = true;
    }

    public String isDisponivel() {
        return disponivel==true ? "Disponível" : "Indisponivel";
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public String toString(){
        return getTitulo()+" - status: "+isDisponivel();
    }
}
