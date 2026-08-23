package avaliacao.lista0308.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Livro> livros = new ArrayList<Livro>();
        ArrayList<Periodico> periodicos = new ArrayList<Periodico>();

        boolean sair=false;
        while(sair==false){
            System.out.println("-------------- BEM VINDO ---------------");
            System.out.println("1-Registre um Livro\n2-Registre um Periódico\n3-Registre/Modifique um Emprestimo\n4-Listar Livros\n5-Listar Periodicos\n6-Sair");
            int opc = sc.nextInt();
            switch (opc){
                case 1:
                    registroLivro(sc,livros);
                    break;
                case 2:
                    registroPeriodico(sc,periodicos);
                    break;
                case 3:
                    registroEmprestimo(sc,livros);
                    break;
                case 4:
                    for(Livro livro : livros){
                        System.out.println(livro);
                    }
                    break;
                case 5:
                    for(Periodico per : periodicos){
                        System.out.println(per);
                    }
                    break;
                case 6:
                    sair=true;
                    break;
                default:
                    System.out.println("opção invalida");
            }
        }
    }

    public static void registroLivro(Scanner sc, ArrayList livros){
        System.out.println("\nTitulo -> ");
        sc.nextLine();
        String title = sc.nextLine();
        Livro l = new Livro(title);
        livros.add(l);
    }
    public static void registroPeriodico(Scanner sc, ArrayList periodicos){
        System.out.println("\nTitulo -> ");
        sc.nextLine();
        String title = sc.nextLine();
        System.out.println("\nNúmero de volumes -> ");
        int vol = sc.nextInt();
        Periodico p = new Periodico(title, vol);
        periodicos.add(p);
    }
    public static void registroEmprestimo(Scanner sc, ArrayList<Livro> livros){
        System.out.println("\n--- Escolha um Livro ---");
        for (int i = 0; i < livros.size(); i++) {
            System.out.println(i + " - " + livros.get(i));
        }

        System.out.print("Digite o número do livro: ");
        int indice = sc.nextInt();

        System.out.println("O que deseja fazer?");
        System.out.println("1 - Emprestar (Marcar como Indisponível)");
        System.out.println("2 - Devolver (Marcar como Disponível)");
        int acao = sc.nextInt();

        if (acao == 1) {
            livros.get(indice).setDisponivel(false);
            System.out.println("Empréstimo realizado com sucesso!");
        } else if (acao == 2) {
            livros.get(indice).setDisponivel(true);
            System.out.println("Devolução realizada com sucesso!");
        } else {
            System.out.println("Ação inválida!");
        }
    }
}
