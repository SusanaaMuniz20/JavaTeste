package Principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class listaDeCompras {

	private List<Item> itens;

	   public void ListaCompras() {
	       this.itens = new ArrayList<>();
	   }

	   public void adicionarItem(String nome, double preco) {
	       Item item = new Item(nome, preco);
	       itens.add(item);
	       System.out.println("Item \"" + nome + "\" adicionado à lista de compras.");
	   }

	   public void removerItem(String nome) {
	       for (Item item : itens) {
	           if (item.getNome().equalsIgnoreCase(nome)) {
	               itens.remove(item);
	               System.out.println("Item \"" + nome + "\" removido da lista de compras.");
	               return;
	           }
	       }
	       System.out.println("Item \"" + nome + "\" não encontrado na lista de compras.");
	   }

	   public void listarItens() {
	       System.out.println("Lista de Compras:");
	       for (Item item : itens) {
	           System.out.println(item);
	       }
	   }

	   public double calcularCustoTotal() {
	       double custoTotal = 0;
	       for (Item item : itens) {
	           custoTotal += item.getPreco();
	       }
	       return custoTotal;
	   }

	   private static class Item {
	       private String nome;
	       private double preco;

	       public Item(String nome, double preco) {
	           this.nome = nome;
	           this.preco = preco;
	       }

	       public String getNome() {
	           return nome;
	       }

	       public double getPreco() {
	           return preco;
	       }

	       @Override
	       public String toString() {
	           return nome + " - R$" + preco;
	       }
	   }

	   public static void main(String[] args) {
	       Scanner scanner = new Scanner(System.in);
	       listaDeCompras listaCompras = new listaDeCompras();

	       while (true) {
	           System.out.println("\nEscolha uma opção:");
	           System.out.println("\n1. Adicionar item");
	           System.out.println("2. Remover item");
	           System.out.println("3. Listar itens");
	           System.out.println("4. Calcular custo total");
	           System.out.println("5. Sair");

	           int escolha = scanner.nextInt();
	           scanner.nextLine();  // Consumir a quebra de linha

	           switch (escolha) {
	               case 1:
	                   System.out.print("Digite o nome do item: ");
	                   String nomeItem = scanner.nextLine();
	                   System.out.print("Digite o preço do item: R$");
	                   double precoItem = scanner.nextDouble();
	                   listaCompras.adicionarItem(nomeItem, precoItem);
	                   break;
	               case 2:
	                   System.out.print("Digite o nome do item a ser removido: ");
	                   String nomeRemover = scanner.nextLine();
	                   listaCompras.removerItem(nomeRemover);
	                   break;
	               case 3:
	                   listaCompras.listarItens();
	                   break;
	               case 4:
	                   double custoTotal = listaCompras.calcularCustoTotal();
	                   System.out.println("Custo total da lista de compras: R$" + custoTotal);
	                   break;
	               case 5:
	                   System.out.println("Obrigado por usar nossa lista de compras. Até mais!");
	                   scanner.close();
	                   System.exit(0);
	               default:
	                   System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
	           }
	       }

	}

}
