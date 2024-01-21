package com.deadhead.iterator_pattern.implementation;

import java.util.List;

import com.deadhead.iterator_pattern.specifications.Iterator;
import com.deadhead.iterator_pattern.specifications.MenuItem;

public class DinnerMenuIterator implements Iterator<MenuItem> {

    private List<MenuItem> menuItems;
    private int index;

    @Override
    public boolean hasNext() {
        return index < menuItems.size() && menuItems.get(index) != null;
    }

    @Override
    public MenuItem next() {
        return menuItems.get(index++);
    }

    public DinnerMenuIterator(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }
    

}
