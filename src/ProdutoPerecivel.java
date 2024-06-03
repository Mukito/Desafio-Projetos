import java.util.Date;
public class ProdutoPerecivel extends Produto{
    private Date dataValidade;

    public ProdutoPerecivel(String nome, double preco, int quantidade, Date dataValidade){

        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    // Método toString para representação em texto do objeto
    @Override
    public String toString(){
        return "ProdutoPerecivel{" +
                "Nome=' " + getNome() + '\'' +
                ", Preço= " + getPreco() +
                ", Quantidade= " + getQuantidade() +
                ", Validade= " + dataValidade +
                '}';
    }

    // Método de acesso ao atributo datavalidade
    public Date getDataValidade(){
        return dataValidade;
    }

}
