package avaliacao.lista0308.biblioteca;

public abstract class Exemplar {
    protected String titulo;

    public Exemplar(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

}
