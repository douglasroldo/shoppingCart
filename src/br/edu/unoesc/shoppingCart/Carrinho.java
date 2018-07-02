package br.edu.unoesc.shoppingCart;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Deiziane Buganti
 *
 */
public class Carrinho {

    private List<ItemCarrinho> itensCarrinho;

    public void adicionarItem(ItemCarrinho item) {
        if (itensCarrinho == null) {
            itensCarrinho = new ArrayList<>();
        }
        itensCarrinho.add(item);
    }

    public void removerItem(ItemCarrinho item) {
        if (itensCarrinho != null) {
            itensCarrinho.remove(item);
        }
    }

    public List<ItemCarrinho> listarItensCarrinho() {
        return itensCarrinho;
    }

    public Double valorTotal() {
        Double totalCarrinho = 0.0;
        for (ItemCarrinho itemCarrinho : itensCarrinho) {
            totalCarrinho += itemCarrinho.getValor();
        }
        return totalCarrinho;
    }

    public void ordenarItensMenorPrecoPrimeiro() {
        Collections.sort(itensCarrinho, new OrdenaCrescente());
        for (ItemCarrinho itemCarrinho : itensCarrinho) {
            System.out.println(itemCarrinho.toString());
        }
        System.out.println("_______________________________________________________");
    }
    
    public void ordenarItensMaiorPrecoPrimeiro() {
        Collections.sort(itensCarrinho, new OrdenarDecrescente());
        for (ItemCarrinho itemCarrinho : itensCarrinho) {
            System.out.println(itemCarrinho.toString());
        }
    }
    
}