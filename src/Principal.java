import java.util.ArrayList;
import java.util.Date;


public class Principal {
    public static void main(String[] args) {
        // Supondo que a data de validade seja a data atual
        Date dateValidade = new Date();

        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Leite", 3.5, 20, dateValidade);

        System.out.println(produtoPerecivel);

        // Criando objetos Produto utilizando o novo construtor
        Produto produto1 = new Produto("Camiseta", 29.99, 10);
        Produto produto2 = new Produto("Calça Jeans", 59.99, 5);
        Produto produto3 = new Produto("Camiseta", 79.99, 8);


        // Criando a lista de produtos
        ArrayList<Produto> listaProdutos = new ArrayList<>();

        // Adcionando produtos à lista
        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);


        // imprimindo o tamanho da lista
        System.out.println("Tamanho da lista de produtos: " + listaProdutos.size());

        //Recuperando um produto pelo indice
        int indiceProduto = 2; //indice do segundo produto
        Produto produtoRecuperado = listaProdutos.get(indiceProduto);


        System.out.println("Produto recuperado: " + produtoRecuperado.getNome());
        System.out.println("Preço: " + produtoRecuperado.getPreco());
        System.out.println("Quantidade: " + produtoRecuperado.getQuantidade());


        // Imprimindo a lista de produto utilizando o método toString()
        for(Produto produto : listaProdutos){
            System.out.println(produto);
        }

        System.out.println(produtoPerecivel);

    }
}
