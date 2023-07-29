package Sort;

import java.util.HashMap;
import java.util.Map;

public class Example {
    // some test cases
    public int[] nums = new int[]{5,3,9,4,7,6,1,3,8};

    public Product[] products;

    public int[] Q300 = new int[]{10,9,2,5,3,7,101,18};
    public Map<String, Object > Q88 = new HashMap<>();

    public int[][] matrix = new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12}};

    public int[] getNums() {
        return nums;
    }

    public void setNums(int[] nums) {
        this.nums = nums;
    }

    public Example() {
    }
    public Product[] getProductExample(){
        Product product1 = new Product(0,9);
        Product product2 = new Product(1,9);
        Product product3 = new Product(2,9);
        Product product4 = new Product(3,10);
        products = new Product[]{product1,product2,product3,product4};
        return products;
    }
    public Map<String, Object > getQ88(){
        Q88.put("nums1" , new int[]{1,2,3,0,0,0} );
        Q88.put("nums2" , new int[]{2,5,6});
        Q88.put("m" ,  3 );
        Q88.put("n" ,  3 );
        return Q88;
    }
}
