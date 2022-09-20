package com.ichan.eshop.service;

import com.ichan.eshop.constant.ProductCategory;
import com.ichan.eshop.dto.ProductQueryParams;
import com.ichan.eshop.dto.ProductRequest;
import com.ichan.eshop.model.Product;

import java.util.List;

public interface ProductService {

    Integer countProduct(ProductQueryParams productQueryParams);

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
