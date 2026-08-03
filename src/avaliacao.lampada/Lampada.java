package avaliacao.lampada;

public class Lampada {
    /**
     * Atributos privados que guardam o estado interno do objeto.
     * 'state' armazena se está ligada ou desligada, e 'watts' armazena a potência.
     */
    private boolean state;
    private int watts;


    /**
     * Este construtor é usado quando o usuário sabe a potência da lâmpada.
     * Ele recebe o estado inicial e a potência por parâmetro.
     */
    public Lampada(boolean state, int watts) {
        this.state = state;
        setWatts(watts); // Chama o set para testar os limites de watts.
    }
    /**
     * Este construtor é acionado quando o usuário digita '0' (não sabe os Watts).
     * Ele define o estado escolhido, mas define uma potência padrão fixa de 60 Watts.
     */
    public Lampada(boolean state){
        this.watts = 60; // definir valor padrão
        this.state = state;
    }
    // get e set
    public int getWatts() {
        return watts;
    }
    // Permite que outras classes consultem o valor da variável privada 'watts' com segurança.

    /**
     * Controla como a potência pode ser modificada.
     * Impede potências menores que 1 ou maiores que 1000.
     */
    public void setWatts(int watts) {
        if(watts < 1){
            this.watts = 1; // Se os watts informados forem menores que 1, define o mínimo como 1.
        } else if(watts > 1000){
            this.watts = 1000; // Se forem maiores que 1000, limita o valor máximo para 1000.
        } else {
            this.watts = watts; // Se estiver dentro do intervalo seguro, aceita o valor digitado.
        }
    }
    public boolean getState(){
        return state;
    } //Retorna o estado atual da lâmpada (true para ligada, false para desligada).

    public void setState(boolean state) {
        this.state = state;
    } //Permite alterar o estado da lâmpada diretamente para um valor booleano específico.

    //metodos
    /**
     * Inverte o estado atual da lâmpada usando o operador de negação (!).
     * Se estava ligada (true), passa a ser falsa (false) e vice-versa.
     */
    public void interruptor(){
        state = !state;
    }

    /**
     * Exibe no console o resultado final da execução do programa para o usuário.
     * Analisa o booleano 'state' para imprimir o texto correto e mostra a potência em Watts configurada.
     */
    public void exibir(){
        if(state){
            System.out.println("Você ligou a Lâmpada =>");
        }else{
            System.out.println("Você desligou a Lâmpada =>");
        }
        System.out.println("Watts "+ this.watts);
    }

}
