public class Product {
    //attribute && field
    int id;
    String name;
    String description;
    double price;
    int stockAmount;
    Product(int id,String name, String description,double price,int stockAmount){
        this.id=id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stockAmount = stockAmount;
    }
}
