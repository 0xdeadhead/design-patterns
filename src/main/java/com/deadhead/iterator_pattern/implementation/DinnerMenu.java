package com.deadhead.iterator_pattern.implementation;

import java.util.ArrayList;
import java.util.List;

import com.deadhead.iterator_pattern.specifications.Iterator;
import com.deadhead.iterator_pattern.specifications.Menu;
import com.deadhead.iterator_pattern.specifications.MenuItem;

public class DinnerMenu implements Menu {

    private List<MenuItem> menu;

    @Override
    public Iterator<MenuItem> getIterator() {
        return new DinnerMenuIterator(menu);
    }

    public DinnerMenu() {
        menu = new ArrayList<>();
        MenuItem biryani = new MenuItem();
        biryani.setName("Biryani");
        biryani.setPrice(180.25D);
        MenuItem naan = new MenuItem();
        naan.setName("Naan");
        naan.setPrice(40.25D);
        menu.add(naan);
        menu.add(biryani);
    }

}
