package br.edu.unoesc.shoppingCart;

public class VinteCincoPorcento implements ConcederDesconto {

    @Override
    public Double calculaDesconto(Produto produto) {
        return produto.getVlrUnitario() * 0.25;
    }
    
}
