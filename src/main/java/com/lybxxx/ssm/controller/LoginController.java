package com.lybxxx.ssm.controller;

import com.lybxxx.ssm.pojo.User;
import com.lybxxx.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author lybxxx
 */
@Controller
@RequestMapping("")
public class LoginController {
    @Autowired
    UserService userService;
    @RequestMapping("/login")
    public ModelAndView login(User user) throws IOException {

        User newUser = userService.getUser(user);
        ModelAndView mav = new ModelAndView();
        if (newUser == null) {
            mav.setViewName("redirect:/static/html/login.html");
            return mav;
        }
        mav.setViewName("listCategory");
        return mav;
    }

    public ModelAndView login2(User user) {
        User newUser = userService.getUser(user);
        ModelAndView mav = new ModelAndView();
        if (newUser != null) {
            mav.setViewName("redirect:/static/html/login2.html");
            mav.addObject("message","该用户名已存在");
            return mav;
        }
        userService.addUser(user);
        mav.setViewName("redirect:/static/html/login.html");
        return mav;
    }
}
