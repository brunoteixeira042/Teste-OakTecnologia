package entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    Produto produto;
    List<Produto> listaDeProduto = new ArrayList<>();


    public void cadastrarProduto(){
        System.out.println("Nome do Produto: ");
        String nomeDoProduto = sc.nextLine();
        System.out.println("Descrição do Produto: ");
        String descricaoDoProduto = sc.nextLine();
        System.out.println("Valor do Produto: ");
        Double valorDoProduto = sc.nextDouble();
        System.out.println("Disponível para Venda? (sim/não): ");
        sc.nextLine();
        String entrada = sc.nextLine().trim().toLowerCase();
        Boolean disponivelParaVenda = entrada.equals("sim");

        produto = new Produto(nomeDoProduto, descricaoDoProduto, valorDoProduto, disponivelParaVenda);
        listaDeProduto.add(produto);
        System.out.println("\nProduto Cadastrado com Sucesso!\n");
    }

    public void listarProdutos(){
        System.out.println("\nLista de Produtos (ordenados por valor):");
        listaDeProduto.sort((p1, p2) -> Double.compare(p1.getValorDoProduto(), p2.getValorDoProduto()));

        System.out.printf("%-20s %-10s\n", "Nome", "Valor (R$)");


        for(Produto produtolista : listaDeProduto){
            System.out.printf("%-20s %.2f\n", produtolista.getNomeDoProduto(), produtolista.getValorDoProduto());
        }
    }
}
