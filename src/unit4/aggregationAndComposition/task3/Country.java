package unit4.aggregationAndComposition.task3;

import java.util.List;

/**
 * 3. Создать объект класса Государство, используя классы Область, Район, Город.
 * Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
 */
class Country {
    private String name;
    private City capital;
    private List<Region> regions;

    Country(String name, City capital, List<Region> regions) {
        this.name = name;
        this.capital = capital;
        this.regions = regions;
    }

    void showCapital() {
        System.out.printf("Capital of %s is %s\n", name, capital.getName());
    }

    void regionCount() {
        System.out.printf("Number of regions is %d\n", regions.size());
    }

    void showTotalArea() {
        int area = 0;
        for (Region region : regions) {
            area += region.getAreaOfRegion();
        }
        System.out.printf("Area of %s country is %d\n", name, area);
    }

    void showRegionsCenters() {
        for (Region region : regions) {
            String regionName = region.getName();
            String regionCenter = region.getRegionCenter().getName();
            System.out.printf("Center of region %s is %s\n", region, regionCenter);
        }
    }
}

