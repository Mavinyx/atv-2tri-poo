package avaliacao.lista0308.biblioteca;

public class Periodico extends Exemplar{
    private int nVolume;

    public Periodico(String titulo, int nVolume) {
        super(titulo);
        this.nVolume = nVolume;
    }

    public int getnVolume() {
        return nVolume;
    }

    public void setnVolume(int nVolume) {
        this.nVolume = nVolume;
    }
    @Override
    public String toString(){
        return getTitulo()+" - vol: "+nVolume;
    }
}
