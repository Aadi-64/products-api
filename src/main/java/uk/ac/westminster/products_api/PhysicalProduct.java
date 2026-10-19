package uk.ac.westminster.products_api;

//A PhysicalProduct IS-A Product because it has all the attributes of a product with the addition of a two more

//One other class a shop system might have is storage


public class PhysicalProduct extends Product{

    private double weightKg;
    private String dimensions;

    public PhysicalProduct(){}
    public PhysicalProduct(long id, String name, double price, double weightKg, String dimensions) {
        this.dimensions = dimensions;
        this.weightKg = weightKg;

    }

    public double getWeightKg(){
        return weightKg;
    }

    public String getDimensions(){
        return dimensions;
    }
}
