import entidades.Menu;
import entidades.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Produto produto;
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        int opcao = 0;

        while (opcao != 3) {
            System.out.println("\nSelecione a opção:");
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Listar Produtos");
            System.out.println("3 - Sair");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    menu.cadastrarProduto();
                    menu.listarProdutos();
                    break;
                case 2:
                    menu.listarProdutos();
                    System.out.println("Deseja cadastrar um novo produto? (sim/não): ");
                    String resposta = sc.nextLine().trim().toLowerCase();
                    if (resposta.equals("sim")) {
                        menu.cadastrarProduto();
                        menu.listarProdutos();
                    }
                    break;
                case 3:
                    System.out.println("Finalizando...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
        sc.close();
    }
}
