package unit4.aggregationAndComposition.task4;

class Owner {
    private String name;

    Owner(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "owner name=" + name;
    }
}
