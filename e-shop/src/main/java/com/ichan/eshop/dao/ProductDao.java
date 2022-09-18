package com.ichan.eshop.dao;

import com.ichan.eshop.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
