package br.edu.unoesc.shoppingCart;

public class CincoPorCento implements ConcederDesconto {

    @Override
    public Double calculaDesconto(Produto produto) {
        return produto.getVlrUnitario() * 0.05;
    }

}
