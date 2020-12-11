package unit4.aggregationAndComposition.task3;

import java.util.List;

class Area {
    private String name;
    private List<City> cities;

    Area(String name, List<City> cities) {
        this.name = name;
        this.cities = cities;
    }

    void addCity(City city) {
        cities.add(city);
    }
}
