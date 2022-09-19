package com.ichan.eshop.service;

import com.ichan.eshop.dto.ProductRequest;
import com.ichan.eshop.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);
}
