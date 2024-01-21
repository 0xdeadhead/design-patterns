package com.deadhead.iterator_pattern.implementation;

import com.deadhead.iterator_pattern.specifications.Iterator;
import com.deadhead.iterator_pattern.specifications.MenuItem;

public class BreakFastMenuIterator implements Iterator<MenuItem> {

    private MenuItem[] items;
    private int position = 0;

    @Override
    public boolean hasNext() {
        return position < items.length && items[position] != null;
    }

    @Override
    public MenuItem next() {
        return items[position++];
    }

    public BreakFastMenuIterator(MenuItem[] items) {
        this.items = items;
    }

}
