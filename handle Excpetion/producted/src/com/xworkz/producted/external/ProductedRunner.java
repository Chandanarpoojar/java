package com.xworkz.producted.external;

import com.xworkz.producted.internal.Product;

public class ProductedRunner {
    public static void main(String[] args) {
        Product product=new Product();
        product.checkProduct("Soap");
        product.checkExpire(2025);
        product.checkFound("ToothPaste");
        product.checkStock(99);
        product.checkPrice(199);
    }
}
