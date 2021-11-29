package model;

public class Product {
    private int productId;
    private ProductCategory productCategory;
    private ProductType productType;
    private String productName;
    private int ownerId;

    public Product(int productId, ProductCategory productCategory, ProductType productType, String productName, int ownerId) {
        this.productId = productId;
        this.productCategory = productCategory;
        this.productType = productType;
        this.productName = productName;
        this.ownerId = ownerId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }
}
