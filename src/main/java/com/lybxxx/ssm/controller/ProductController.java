package com.lybxxx.ssm.controller;

import com.lybxxx.ssm.pojo.Product;
import com.lybxxx.ssm.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author lybxxx
 */
@Controller
@RequestMapping("")
public class ProductController {
    @Autowired
    ProductService productService;

    @RequestMapping("/listProduct")
    public ModelAndView listProduct() {
        List<Product> products = productService.listProduct();
        ModelAndView mav = new ModelAndView();
        mav.addObject("products",products);
        mav.setViewName("/listProduct");
        return mav;
    }
}
