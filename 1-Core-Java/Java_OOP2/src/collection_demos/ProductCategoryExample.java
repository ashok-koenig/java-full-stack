package collection_demos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductCategoryExample {
    public static void main(String[] args) {
        HashMap<String, List<String>> categories = new HashMap<>();

        ArrayList<String> electronicProducts = new ArrayList<>();
        electronicProducts.add("Phone");
        electronicProducts.add("Laptop");
        electronicProducts.add("Tablet");
        categories.put("Electronics", electronicProducts);
        categories.put("Clothing", List.of("Shirt","Jeans", "Jacket"));

        System.out.println("Category Products"+ categories);

        for (Map.Entry<String, List<String>> entry: categories.entrySet()){
            System.out.println("Category: "+ entry.getKey() + " Products: "+ entry.getValue());
        }
    }
}
