public class Main {
    public static void main(String[] args) {
        Product product = new Product(1,"telefon","8 gb ram", 1555,10);
        ProductManager productManager = new ProductManager();
        productManager.Add(product);
    }
}