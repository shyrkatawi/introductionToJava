package unit4.aggregationAndComposition.task3;

import java.util.List;

class Region {
    private String name;
    private List<Area> areas;
    private City regionCenter;
    private int areaOfRegion;

    int getAreaOfRegion() {
        return areaOfRegion;
    }

    Region(String name, List<Area> areas, City regionCenter, int areaOfRegion) {
        this.name = name;
        this.areas = areas;
        this.regionCenter = regionCenter;
        this.areaOfRegion = areaOfRegion;
    }

    City getRegionCenter() {
        return regionCenter;
    }

    String getName() {
        return name;
    }
}
