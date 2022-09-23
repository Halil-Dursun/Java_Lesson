public class Main {
    public static void main(String[] args) {
        Product product = new Product(1,"telefon","8 gb ram", 1555,10,"Siyah");
        ProductManager productManager = new ProductManager();
        productManager.Add(product);

        Product product1 = new Product();
        product1.setName("Asus Laptop");
        product1.setId(2);
        product1.setPrice(5000);

        System.out.println(product1.getName());

        System.out.println(product.getKod());


    }
}