package br.edu.unoesc.shoppingCart.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import br.edu.unoesc.shoppingCart.Carrinho;
import br.edu.unoesc.shoppingCart.DepartamentoProduto;
import br.edu.unoesc.shoppingCart.ItemCarrinho;
import br.edu.unoesc.shoppingCart.Produto;


public class TestWork {
	    
    @Test
    public void valorUnitarioDosProdutos() {
        Produto prod1 = new Produto("Casaco", 100.0, DepartamentoProduto.VESTUARIO);
        Produto prod2 = new Produto("Água", 10.0, DepartamentoProduto.BEBIDAS);
        Produto prod3 = new Produto("Trident", 2.5, DepartamentoProduto.ALIMENTACAO);
        
        assertEquals(Double.valueOf(100.0), prod1.getVlrUnitario());
        assertEquals(Double.valueOf(10.0), prod2.getVlrUnitario());
        assertEquals(Double.valueOf(2.5), prod3.getVlrUnitario());
    }

    @Test
    public void ordenarMenorPrecoPrimeiro() {
        Produto prod1 = new Produto("Casaco", 100.0, DepartamentoProduto.VESTUARIO);
        Produto prod2 = new Produto("Água", 10.0, DepartamentoProduto.BEBIDAS);
        Produto prod3 = new Produto("Trident", 2.5, DepartamentoProduto.ALIMENTACAO);

        Carrinho carrinho = new Carrinho();
        ItemCarrinho item;

        item = new ItemCarrinho(prod1, 2);
        carrinho.adicionarItem(item);
        item = new ItemCarrinho(prod3, 3);
        carrinho.adicionarItem(item);
        item = new ItemCarrinho(prod2, 1);
        carrinho.adicionarItem(item);
        
        carrinho.ordenarItensMenorPrecoPrimeiro();
    }
    
    @Test
    public void ordenarMaiorPrecoPrimeiro() {
        Produto prod1 = new Produto("Casaco", 100.0, DepartamentoProduto.VESTUARIO);
        Produto prod2 = new Produto("Água", 10.0, DepartamentoProduto.BEBIDAS);
        Produto prod3 = new Produto("Trident", 2.5, DepartamentoProduto.ALIMENTACAO);

        Carrinho carrinho = new Carrinho();
        ItemCarrinho item;

        item = new ItemCarrinho(prod2, 1);
        carrinho.adicionarItem(item);
        item = new ItemCarrinho(prod3, 3);
        carrinho.adicionarItem(item);
        item = new ItemCarrinho(prod1, 2);
        carrinho.adicionarItem(item);

        carrinho.ordenarItensMaiorPrecoPrimeiro();
    }

    @Test
    public void valorTotalCarrinho() {
        Produto prod1 = new Produto("Casaco", 100.0, DepartamentoProduto.VESTUARIO);
        Produto prod2 = new Produto("Água", 10.0, DepartamentoProduto.BEBIDAS);
        Produto prod3 = new Produto("Trident", 2.5, DepartamentoProduto.ALIMENTACAO);

        Carrinho carrinho = new Carrinho();
        ItemCarrinho item;

        item = new ItemCarrinho(prod1, 2);
        carrinho.adicionarItem(item);
        item = new ItemCarrinho(prod3, 3);
        carrinho.adicionarItem(item);
        item = new ItemCarrinho(prod2, 1);
        carrinho.adicionarItem(item);

        assertEquals(Double.valueOf(167.0), carrinho.valorTotal());
    }

    @Test
    public void descontoAutomaticoBebidaVestuario() {
        Produto prod1 = new Produto("Casaco", 100.0, DepartamentoProduto.VESTUARIO);
        Produto prod2 = new Produto("Água", 10.0, DepartamentoProduto.BEBIDAS);
        Produto prod3 = new Produto("Trident", 2.5, DepartamentoProduto.ALIMENTACAO);

        Carrinho carrinho = new Carrinho();

        ItemCarrinho item1 = new ItemCarrinho(prod1, 2);
        carrinho.adicionarItem(item1);
        ItemCarrinho item2 = new ItemCarrinho(prod2, 1);
        carrinho.adicionarItem(item2);
        ItemCarrinho item3 = new ItemCarrinho(prod3, 3);
        carrinho.adicionarItem(item3);

        assertEquals(Double.valueOf(150.0), item1.getValor());
        assertEquals(Double.valueOf(9.5), item2.getValor());
        assertEquals(Double.valueOf(7.5), item3.getValor());
    }
    
    
}