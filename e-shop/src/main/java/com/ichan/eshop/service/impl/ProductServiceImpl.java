package com.ichan.eshop.service.impl;

import com.ichan.eshop.dao.ProductDao;
import com.ichan.eshop.dto.ProductRequest;
import com.ichan.eshop.model.Product;
import com.ichan.eshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }

    @Override
    public Integer createProduct(ProductRequest productRequest) {
        return productDao.createProduct(productRequest);
    }
}
