package org.viniciusog.patterns.behavioral.iterator.cart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Cart implements Iterable<Product> {

    private List<Product> products = new ArrayList<>();

    public Cart(Product... products) {
        this.products = Arrays.asList(products);
    }

    @Override
    public Iterator<Product> iterator() {
        return products.iterator();
    }
}