package uk.ac.westminster.products_api;

//A PhysicalProduct IS-A Product because it has all the attributes of a product with the addition of a two more

//One other class a shop system might have is storage


public class PhysicalProduct extends Product implements  Discountable{

    private double discountedPrice;
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

    @Override
    public String getSummary() {
        return "Physical: " + getName() + "| Weight: " + getWeightKg();
    }

    @Override
    public void applyDiscount (double rate){
        double capped = Math.min(rate, 0.20);
        this.discountedPrice = getPrice() + (1 - capped);


    }

    @Override
    public double getDiscountedPrice() {
        return discountedPrice;
    }
}
