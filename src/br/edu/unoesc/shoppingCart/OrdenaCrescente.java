package br.edu.unoesc.shoppingCart;

import java.util.Comparator;

public class OrdenaCrescente implements Comparator<ItemCarrinho> {

    @Override
    public int compare(ItemCarrinho item1, ItemCarrinho item2) {
        if (item1.getValor() < item2.getValor()) {
            return -1;
        } else if (item1.getValor() > item2.getValor()) {
            return +1;
        } else {
            return 0;
        }
    }

}
