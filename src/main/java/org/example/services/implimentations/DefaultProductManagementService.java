package org.example.services.implimentations;

import org.example.entitis.Product;
import org.example.entitis.StandardCategories;
import org.example.entitis.implimetations.DefaultProduct;
import org.example.services.ProductManagementService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DefaultProductManagementService implements ProductManagementService {
    private static DefaultProductManagementService instance;

    private static List<Product> products;

    static {
        initProducts();
    }

    private static void initProducts() {
        products = new ArrayList<>(Arrays.asList(
                new DefaultProduct(1, "Hardwood Oak Suffolk Internal Door", StandardCategories.CLOTHS, 109.99),
                new DefaultProduct(2, "Oregon Cottage Interior Oak Door", StandardCategories.CLOTHS, 179.99),
                new DefaultProduct(3, "Oregon Cottage Horizontal Interior White Oak Door", StandardCategories.CLOTHS, 189.99),
                new DefaultProduct(4, "4 Panel Oak Deco Interior Door", StandardCategories.CLOTHS, 209.09),
                new DefaultProduct(5, "Worcester 2000 30kW Ng Combi Boiler Includes Free Comfort+ II controller", StandardCategories.ELECTRONICS, 989.99),
                new DefaultProduct(6, "Glow-worm Betacom 4 30kW Combi Gas Boiler ERP", StandardCategories.ELECTRONICS, 787.99),
                new DefaultProduct(7, "Worcester 2000 25kW Ng Combi Boiler with Free Comfort+ II controller", StandardCategories.ELECTRONICS, 859.99),
                new DefaultProduct(8, "Wienerberger Terca Class B Engineering Brick Red 215mm x 102.5mm x 65mm (Pack of 504)", StandardCategories.SHOES, 402.99),
                new DefaultProduct(9, "Wienerberger Terca Engineering Brick Blue Perforated Class B 65mm (Pack of 400)",  StandardCategories.SHOES, 659.99),
                new DefaultProduct(10, "Wienerberger Engineering Brick Red Smooth Class B 73mm - Pack of 368",  StandardCategories.SHOES, 523.99)
        ));
    }

    private DefaultProductManagementService() {

    }

    public static ProductManagementService getInstance() {
        if (instance == null) {
            instance = new DefaultProductManagementService();
        }
        return instance;
    }

    @Override
    public List<Product> getProducts() {
        return products;
    }

    @Override
    public Product getProductById(Integer productIdToAddToCart) {
        for(Product product:products)if(product.getId().equals(productIdToAddToCart))return product;
        return null;
    }
}
