package br.edu.unoesc.shoppingCart;

public class ItemCarrinho {

    private Produto produto;
    private Integer quantidade;
    private Double valor;

    public ItemCarrinho(Produto produto, Integer quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.valor = ((produto.getVlrUnitario() - produto.getDeptoProduto().calcular(produto)) * quantidade);
    }
    
    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
    
    public Double getValor() {
        return valor;
    }
    
    @Override
    public String toString() {
        return "Produto: " + produto.getNome() + "      Quantidade: " + quantidade + "        Valor: " + valor;
    }
}