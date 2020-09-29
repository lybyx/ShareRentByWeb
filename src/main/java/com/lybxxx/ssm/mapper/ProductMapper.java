package com.lybxxx.ssm.mapper;

import com.lybxxx.ssm.pojo.Product;

import java.util.List;

/**
 * @author lybxxx
 */
public interface ProductMapper {
    int addProduct(Product product);

    Product getProduct(int id);

    int updateProduct(Product product);

    int deleteProduct(int id);

    List<Product> listProduct();


}
