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
        Example examples = new Example();
        Product[] products = examples.getProductExample();

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
