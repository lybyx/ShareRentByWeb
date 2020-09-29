package com.lybxxx.ssm.service.impl;

import com.lybxxx.ssm.mapper.CategoryMapper;
import com.lybxxx.ssm.pojo.Category;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class CategoryServiceImplTest {

    @Autowired
    private CategoryMapper categoryMapper;

    @Test
    public void testAdd(){
        for (int i = 0; i < 100; i++) {
            Category category = categoryMapper.get(i);
            categoryMapper.delete(i);
        }
    }
}