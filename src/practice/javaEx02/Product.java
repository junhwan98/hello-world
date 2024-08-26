package practice.javaEx02;

public class Product {


    int productNo;
    String productName;
    int price;
    String maker;
    String manufacturingDate;
    int inventory;

    public Product(int productNo, String productName, int price, String maker, String manufacturingDate, int inventory) {
        this.productNo = productNo;
        this.productName = productName;
        this.price = price;
        this.maker = maker;
        this.manufacturingDate = manufacturingDate;
        this.inventory = inventory;
    }


    public int getProductNo() {
        return productNo;
    }

    public void setProductNo(int productNo) {
        this.productNo = productNo;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(String manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    @Override
    public String toString() {
        return
                "상품번호=" + productNo +
                ",\n상품명=" + productName  +
                ", \n가격=" + price +
                ", \n제조회사=" + maker  +
                ", \n제조일=" + manufacturingDate +
                ", \n재고=" + inventory ;
    }
}
