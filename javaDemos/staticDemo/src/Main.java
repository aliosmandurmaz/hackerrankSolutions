public class Main {

    public static void main(String[] args) {

        ProductManager manager = new ProductManager();
        Product product = new Product();
        product.price = 10;
        product.name = "mouse";

        manager.add(product);

        DatabaseHelper.Crud.delete();
    }
}
