package hillel.lesson7.HW_6;

public class Product {
    private String productName;
    private String article;
    private String cost;
    private String productDescription;
    private String productAvailability;


    public String getProductName() {
        return productName;
    }

    public String getArticle() {
        return article;
    }

    public String getCost() {
        return cost;
    }
    public void setCost(String newCost) {
        cost = newCost;
    }

    public String getProductDescription() {
        return productDescription;
    }
    public void setProductDescription(String newProductDescription) {
        productDescription = newProductDescription;
    }

    public String getProductAvailability() {
        return productAvailability;
    }
    public void setProductAvailability(String newProductAvailability) {
        productAvailability = newProductAvailability;
    }
}
