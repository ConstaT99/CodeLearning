package Sort;

public class Example {
    // some test cases
    public int[] nums;
    public Product[] products;

    public int[] getNums() {
        return nums;
    }

    public Example() {
        this.nums =  new int[]{5,3,9,4,7,6,1,3,8};
    }
    public Product[] getProductExample(){
        Product product1 = new Product(0,9);
        Product product2 = new Product(1,9);
        Product product3 = new Product(2,9);
        Product product4 = new Product(3,10);
        products = new Product[]{product1,product2,product3,product4};
        return products;
    }
}
