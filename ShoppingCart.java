class ShoppingCart {
    private Product[] products;
    private int itemCount;
    private double totalPrice;

    public ShoppingCart() {
        products = new Product[10];
        itemCount = 0;
        totalPrice = 0.0;
    }

    public void addItem(Product product) {
        if (itemCount == products.length) {
            increaseSize();
        }
        products[itemCount] = product;
        itemCount++;
        totalPrice += product.getPrice();
    }

    private void increaseSize() {
        Product[] temp = new Product[products.length * 2];
        for (int i = 0; i < products.length; i++) {
            temp[i] = products[i];
        }
        products = temp;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void clear() {
        products = new Product[10];
        itemCount = 0;
        totalPrice = 0.0;
    }
}