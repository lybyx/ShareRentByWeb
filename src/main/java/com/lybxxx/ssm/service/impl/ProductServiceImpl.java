package com.lybxxx.ssm.service.impl;

import com.lybxxx.ssm.mapper.ProductMapper;
import com.lybxxx.ssm.pojo.Product;
import com.lybxxx.ssm.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lybxxx
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductMapper productMapper;
    @Override
    public int addProduct(Product product) {
         return productMapper.addProduct(product);
    }

    @Override
    public Product getProduct(int id) {
        return productMapper.getProduct(id);
    }

    @Override
    public List<Product> listProduct() {
        return productMapper.listProduct();
    }
}
