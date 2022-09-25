public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("laptop" ,"asus laptop", 5000 , 4 , 1);
        Product product2 = new Product();
        product2.setName("laptop");
        product2.setId(1);
        product2.setPrice(5000);
        product2.setDescription("asus notebook");
        product2.setStockAmount(4);
        ProductManager productManager = new ProductManager();
        productManager.add(product2);

    }
}