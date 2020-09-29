package com.lybxxx.ssm.service;

import com.lybxxx.ssm.mapper.ProductMapper;
import com.lybxxx.ssm.pojo.Product;

import java.util.List;

/**
 * @author lybxxx
 */
public interface ProductService {


    int addProduct(Product product);
    Product getProduct(int id);
    List<Product> listProduct();

}
