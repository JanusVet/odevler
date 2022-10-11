package staticDemo;

public class Main {
	public static void main(String[] args) {
		Product product = new Product();
		product.id = 1;
		product.name = "Allah yok";
		product.price = 0.1;
		ProductManager manager = new ProductManager();
		manager.add(product);
	}
}
