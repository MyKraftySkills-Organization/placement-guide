import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ShoppingCart {
    private List<Product> productList;
    /**
     * Initialize empty cart
     */
    ShoppingCart() {
        productList = new ArrayList<Product>();
    }

    /**
     * Prints items and total amount in cart
     */
    public void getItems() {
        if (productList.size() >= 1) {
            System.out.println("Id \t Name \t Quantity \t Price");
            for (Product product : productList) {
                System.out.print(product.id + "\t" + product.name + "\t" + product.quantity + "\t" + product.price);
                System.out.println();
            }
            System.out.println("Total: " + totalAmount());
        } else {
            System.out.println("Cart Empty!");
        }
    }

    public void updateQuantity(Product product, int quantity)
    {
        product.quantity = quantity;
        if(productList.contains(product))
        {
           productList.set(productList.indexOf(product), product);      
        }
        getItems();
    }
    /**
     * 
     * @param product - product object is passed
     * @param quantity - quantity for product to buy
     */
    public void addItem(Product product, int quantity) {
        product.quantity = quantity;
        if(productList.contains(product))
        {
            productList.set(productList.indexOf(product), product);
        }
        else {
            productList.add(product);
        }
        getItems();
    }

    public double totalAmount() {
        double total = 0;
        for (Product product : productList) {
            total += (product.quantity * product.price);
        }
        return total;
    }

    public void removeItem(Product product)
    {
        if(productList.contains(product))
        {
            productList.remove(product);
        }
        getItems();
    }
}

class Stock {
    List<Product> productList;

    Stock() {
        productList = new ArrayList<Product>();
        productList.add(new Product("prd1", "Blog Website", 10, 2200.0f));
        productList.add(new Product("prd2", "Library Management", 10, 3100.0f));
        productList.add(new Product("prd3", "Ecommerce", 10, 4100.0f));
        productList.add(new Product("prd4", "Mario App(apk/ios)", 10, 3200.0f));
    }

    public void getProductList() {
        System.out.println("\t Stock List");
        System.out.println("Id \t Name \t Quantity \t Price");
        for (Product product : productList) {
            System.out.print(product.id + "\t" + product.name + "\t" + product.quantity + "\t" + product.price);
            System.out.println();
        }
    }

    Product getProduct(String id) {
        for (Product product : productList) {
            if (product.id.equals(id)) {
                return product;
            }
        }
        return new Product();
    }
}

/**
 * Model Class
 * 
 * @param name     - product name
 * @param quantity - quantity in stock
 * @param price    - price of one product
 */
class Product {
    String id;
    String name;
    int quantity;
    float price;

    Product() {
    }

    Product(String id, String name, int quantity, float price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    String getName() {
        return name;
    }

    int getQuantity() {
        return quantity;
    }

    float getPrice() {
        return price;
    }

    void setName(String name) {
        this.name = name;
    }

    void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    void setPrice(float price) {
        this.price = price;
    }
}

public class Customer {
    public static void displayMenu() {
        System.out.println("\t\tEcommerce");
        System.out.println("1. Show Stocks");
        System.out.println("2. Show Cart");
        System.out.println("3. Add Product to Cart");
        System.out.println("4. Remove product from Cart");
        System.out.println("5. Update Quantity");
        System.out.println("6. Checkout");
        System.out.println("7. Exit");
        System.out.print("Enter Choice number: ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String prod;
        Stock stock = new Stock();
        ShoppingCart cart = new ShoppingCart();
        int choice, quantity;
        do {
            displayMenu();
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    stock.getProductList();
                    break;
                case 2:
                    cart.getItems();
                    break;
                case 3:
                    System.out.println();
                    System.out.print("Enter Product Id to add: ");
                    prod = sc.next();
                    System.out.print("Enter Product Quantity: ");
                    quantity = sc.nextInt();
                    cart.addItem(stock.getProduct(prod), quantity);
                    break;
                case 4:
                    System.out.print("Enter Product Id to remove: ");
                    prod = sc.next();
                    cart.removeItem(stock.getProduct(prod));
                    break;
                case 5:
                    System.out.print("Enter Product Id to update quantity: ");
                    prod = sc.next();
                    System.out.print("Enter Product updated quantity: ");
                    quantity = sc.nextInt();
                    cart.updateQuantity(stock.getProduct(prod), quantity);
                    break;
                case 6:
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Invalid Selection. Choose a valid option");

            }
        } while (choice != 7);

        sc.close();
    }
}