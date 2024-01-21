package com.deadhead.iterator_pattern.implementation;

import com.deadhead.iterator_pattern.specifications.Iterator;
import com.deadhead.iterator_pattern.specifications.Menu;
import com.deadhead.iterator_pattern.specifications.MenuItem;

public class BreakFastMenu implements Menu {

    private MenuItem[] menu;

    @Override
    public Iterator<MenuItem> getIterator() {
        return new BreakFastMenuIterator(menu);
    }

    public BreakFastMenu() {
        menu = new MenuItem[2];
        MenuItem dosa = new MenuItem();
        dosa.setName("Dosa");
        dosa.setPrice(40.0d);
        MenuItem idli = new MenuItem();
        idli.setName("Idli");
        idli.setPrice(35.0d);
        menu[0] = dosa;
        menu[1] = idli;
    }

}
