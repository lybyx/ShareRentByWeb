package com.lybxxx.ssm.mapper;

import com.lybxxx.ssm.pojo.Category;
import com.lybxxx.ssm.pojo.Page;

import java.util.List;

/**
 * @author lybxxx
 */
public interface CategoryMapper {
    int add(Category category);

    void delete(int id);

    Category get(int id);

    int update(Category category);

    List<Category> list();

    List<Category> list(Page page);

    int total();

}
