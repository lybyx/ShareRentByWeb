package com.lybxxx.ssm.controller;

import com.lybxxx.ssm.pojo.Category;
import com.lybxxx.ssm.pojo.Page;
import com.lybxxx.ssm.service.CategoryService;
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
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @RequestMapping("/listCategory")
    public ModelAndView listCategory(Page page) {
        ModelAndView mav = new ModelAndView();
        List<Category> cs = categoryService.list(page);
        int total = categoryService.total();
        page.lastPage(total);

        mav.addObject("cs",cs);
        mav.setViewName("listCategory");
        return mav;
    }

}
