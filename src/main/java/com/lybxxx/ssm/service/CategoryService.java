package com.lybxxx.ssm.service;

import com.lybxxx.ssm.pojo.Category;
import com.lybxxx.ssm.pojo.Page;

import java.util.List;

/**
 * @author lybxxx
 */
public interface CategoryService {

    List<Category> list();
    int total();
    List<Category> list(Page page);
}
