package com.lybxxx.ssm.service.impl;

import com.lybxxx.ssm.mapper.CategoryMapper;
import com.lybxxx.ssm.pojo.Category;
import com.lybxxx.ssm.pojo.Page;
import com.lybxxx.ssm.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lybxxx
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryMapper categoryMapper;
    @Override
    public List<Category> list() {
        return categoryMapper.list();
    }

    @Override
    public int total() {
        return categoryMapper.total();
    }

    @Override
    public List<Category> list(Page page) {
        return categoryMapper.list(page);
    }


}
