package entidades;

public class Produto {
    private String nomeDoProduto;
    private String descricaoDoProduto;
    private Double valorDoProduto;
    private Boolean disponivelParaVenda;

    public Produto(String nomeDoProduto, String descricaoDoProduto,
                   Double valorDoProduto,
                   Boolean disponivelParaVenda) {
        this.nomeDoProduto = nomeDoProduto;
        this.descricaoDoProduto = descricaoDoProduto;
        this.valorDoProduto = valorDoProduto;
        this.disponivelParaVenda = disponivelParaVenda;
    }

    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    public Double getValorDoProduto() {
        return valorDoProduto;
    }

    @Override
    public String toString() {
        return "Produto: " +
                "Nome: " + nomeDoProduto +
                ", Valor: " + String.format("%.2f", valorDoProduto) + " R$";
    }
}
