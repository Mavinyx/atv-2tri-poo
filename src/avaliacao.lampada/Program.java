package avaliacao.lampada;

import java.util.Scanner;

public class Program {



    public static void main(String[] args) { // Este é o metodo de entrada obrigatório para qualquer aplicação Java executável.

        /**
         * Instanciação do objeto 'Scanner' para capturar as entradas digitadas pelo utilizador
         * no terminal de comandos.
         */
        Scanner sc = new Scanner(System.in);

        // Solicita ao utilizador o estado inicial da lâmpada (ligada ou desligada)
        System.out.println("A lâmpada esta ligada? ( 0 - desligada/ 1 - ligada )");
        int opc = sc.nextInt();

        /**
         * Converte a opção numérica digitada pelo utilizador num valor lógico.
         * Se o utilizador digitar qualquer valor diferente de 0, o estado será true.
         */
        boolean estado = (opc!=0);

        // Solicita ao utilizador a potência da lâmpada em Watts
        System.out.println("Quantos Watts tem a lâmpada? (0 se não souber)");
        int watts = sc.nextInt();

        //Criação da referência 'lamp' do tipo 'Lampada', que será instanciada a seguir.
        Lampada lamp;

        /**
         * Se o utilizador digitar 0 para os Watts, o programa utiliza o construtor de um único
         * parâmetro, definindo o valor de fábrica (60W). Caso contrário, utiliza o construtor completo
         * para validar e aplicar a potência informada.
         */
        if(watts == 0){
            lamp = new Lampada(estado);// Instancia com o valor padrão de 60 Watts
        }else{
            lamp = new Lampada(estado,watts); // Instancia com a potência especificada pelo utilizador
        }





        lamp.interruptor(); // Invocação do metodo 'interruptor' para inverter o estado inicial da lâmpada.
        lamp.exibir();   // Invocação do metodo 'exibir' para mostrar o estado final e a potência configurada.

    }
}
