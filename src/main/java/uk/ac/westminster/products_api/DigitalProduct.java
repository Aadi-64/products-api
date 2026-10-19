package uk.ac.westminster.products_api;

public class DigitalProduct extends Product{
    private String downloadUrl;
    private double fileSizeMB;


    public DigitalProduct(){}

    public DigitalProduct(Long id, String name, double Price, String downloadUrl, double fileSizeMB) {
    this.downloadUrl = downloadUrl;
    this.fileSizeMB = fileSizeMB;

    }

    public double getFileSizeMB() {
        return fileSizeMB;
    }

    public String getDownloadUrl(){
        return downloadUrl;
    }
}



