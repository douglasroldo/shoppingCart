package br.edu.unoesc.shoppingCart;

public enum DepartamentoProduto {
    
    ALIMENTACAO,
    BEBIDAS(new CincoPorCento()),
    VESTUARIO(new VinteCincoPorcento());

    DepartamentoProduto() {
    
    }
    
    DepartamentoProduto(ConcederDesconto concederDesconto) {
        this.concederDesconto = concederDesconto;
    }

    private ConcederDesconto concederDesconto;

    public Double calcular(Produto produto) {
        if (concederDesconto != null) {
            return concederDesconto.calculaDesconto(produto);
        } else {
            return 0.0;
        }
    }
}
