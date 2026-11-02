package uk.ac.westminster.products_api;

public class DigitalProduct extends Product implements Discountable
{
    private String downloadUrl;
    private double fileSizeMB;
    private double discountedPrice;




    public DigitalProduct(){}

    public DigitalProduct(Long id, String name, double Price, String downloadUrl, double fileSizeMB) {
    this.downloadUrl = downloadUrl;
    this.fileSizeMB = fileSizeMB;

    }

    public double getFileSizeMB() {
        return fileSizeMB;
    }

    public String getDownloadUrl(){return downloadUrl;}

    @Override
    public String getSummary() {
        return "Digital: " + getName() + "| Download:"+ getDownloadUrl() +" - "+ getFileSizeMB();
    }

    @Override
    public void applyDiscount (double rate) {
        private double discountedPrice(getPrice()*(1-rate)){
            this.discountedPrice = d;
        }

    }

    @Override
    public double getDiscountedPrice() {
        return discountedPrice;

    }
};



