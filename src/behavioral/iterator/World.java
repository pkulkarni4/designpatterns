package behavioral.iterator;

import java.util.Iterator;

public class World implements Iterable<Country> {
    private final Country[] countries;

    public World(Country... countries) {
        this.countries = countries;
    }

    @Override
    public Iterator<Country> iterator() {
        return new CountryIterator(this);
    }

    public Country[] getCountries() {
        return countries;
    }
}
