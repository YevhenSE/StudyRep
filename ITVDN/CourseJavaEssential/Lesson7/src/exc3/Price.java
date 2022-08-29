package exc3;

public class Price {
    private String productName;
    private String storeName;
    private double priceInUah;

    public Price() {
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public double getPriceInUah() {
        return priceInUah;
    }

    public void setPriceInUah(double priceInUah) {
        this.priceInUah = priceInUah;
    }


    @Override
    public String toString() {
        return "Магазин " + getStoreName() + ";  Название предмета: " + getProductName() + ";  Стоимость:  " + getPriceInUah() + " грн";
    }
}
