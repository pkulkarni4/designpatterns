package behavioral.iterator;

import java.util.Iterator;

public class CountryIterator implements Iterator<Country> {
    private World world;
    private int index;

    public CountryIterator(World world) {
        this.world = world;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        var countries = world.getCountries();
        return countries.length > this.index;
    }

    @Override
    public Country next() {
        var countries = world.getCountries();
        Country country = null;
        if (hasNext()) {
            country = countries[this.index++];
        }
        return country;
    }
}
