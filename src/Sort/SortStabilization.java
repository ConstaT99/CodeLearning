package Sort;

public class SortStabilization {
    public static void unstableBubbleSort(Product[] products){
        for (int i = 0; i < products.length - 1; i++){
            for( int j = products.length - 1; j > i; j --){
                if(  products[j - 1].getPrice() >= products[j].getPrice()){
                    Product temp = products[j];
                    products[j] = products[j - 1];
                    products[j - 1] = temp;
                }
            }
        }

        for (int i = 0; i < products.length - 1; i++){
            for( int j = products.length - 1; j > i; j --){
                if(  products[j - 1].getSale() >= products[j].getSale()){
                    Product temp = products[j];
                    products[j] = products[j - 1];
                    products[j - 1] = temp;
                }
            }
        }
    }

    public static void stableBubbleSort(Product[] products){
        for (int i = 0; i < products.length - 1; i++){
            for( int j = products.length - 1; j > i; j --){
                if( products[j].compareTo(products[j-1]) < 0){
                    Product temp = products[j];
                    products[j] = products[j - 1];
                    products[j - 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Product product1 = new Product(0,9);
        Product product2 = new Product(1,9);
        Product product3 = new Product(2,9);
        Product product4 = new Product(3,10);

        Product[] products = new Product[]{product1,product2,product3,product4};
        stableBubbleSort(products);
        for(Product product : products){
            System.out.println(product.toString());
        }
        unstableBubbleSort(products);
        for(Product product : products){
            System.out.println(product.toString());
        }
    }
}
