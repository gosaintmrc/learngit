package com.cmos.ngbusitemps_sc.controller;

import com.cmos.ngbusitemps_sc.domain.User;
import com.cmos.ngbusitemps_sc.service.IUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Authgor: gosaint
 * @Description:
 * @Date Created in 21:18 2018/1/24
 * @Modified By:
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;
    @RequestMapping("/show")
    public ModelAndView showUser(User user){
        user  = userService.get(user.getId());
        ModelAndView mv=new ModelAndView("index");
        mv.addObject("user",user);
        return  mv;
    }
}
