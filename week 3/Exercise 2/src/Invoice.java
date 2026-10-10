public class Invoice {
    String partnumber;
    String description;
    int quantity;
    double price;

    public Invoice(String partnumber, String description, int quantity, double price) {
        this.partnumber = partnumber;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }

    public String getPartnumber() {
        return partnumber;
    }

    public String getDescription() {
        return description;
    }

    public int getQuantity() {
        if(quantity < 0){
            return 0;
        }else{
            return quantity;
        }
    }

    public double getPrice() {
        if(price<0){
            return 0.0;
        }else{
            return price;
        }
    }

    void setPartnumber() {
        this.partnumber = partnumber;
    }

    void setDescription() {
        this.description = description;
    }

    void setQuantity() {
        this.quantity = quantity;
    }

    void setPrice() {
        this.price = price;
    }
    public double getInvoiceAmount(){
        return quantity * price;
    }
}